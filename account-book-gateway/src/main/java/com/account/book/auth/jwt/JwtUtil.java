package com.account.book.auth.jwt;

import com.account.book.constants.AuthConstant;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * JWT工具类
 **/

public class JwtUtil {

    // 过期时间30分钟
    public static final long EXPIRE_TIME = 604800000L;

    /**
     * 校验token是否正确
     *
     * @param token  密钥
     * @param secret 用户的密码
     * @return 是否正确
     */
    public static boolean verify(String token, String username, String secret) {
        try {
            // 根据密码生成JWT效验器
            Algorithm algorithm = Algorithm.HMAC256(secret);
            JWTVerifier verifier = JWT.require(algorithm).withClaim("username", username).build();
            // 效验TOKEN
            verifier.verify(token);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    /**
     * 校验 token 是否有效
     *
     * @param token 密钥
     * @param salt  盐
     * @return 是否正确
     */
    public static boolean verifyToken(String token, String password, String salt) {
        try {
            DecodedJWT verify = JWT.require(Algorithm.HMAC256(password + salt)).build().verify(token);
            return verify.getExpiresAt().after(new Date());
        } catch (Exception exception) {
            return false;
        }
    }

    /**
     * 获得token中的信息无需secret解密也能获得
     *
     * @return token中包含的用户名
     */
    public static String getUsername(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("username").asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    /**
     * 生成签名
     *
     * @param username 用户名
     * @param password 用户的密码
     * @param salt     盐
     * @return 加密的token
     */
    public static String sign(String username, String password, String salt) {
        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        Algorithm algorithm = Algorithm.HMAC256(password + salt);
        // 附带username信息
        return JWT.create().withClaim("username", username).withExpiresAt(date).sign(algorithm);
    }

    /**
     * 生成签名
     *
     * @param username     用户名
     * @param password     用户的密码
     * @param salt         盐
     * @param expireMillis 过期时间，单位毫秒
     * @return 加密的token
     */
    public static String signE(String username, String password, String salt, Long expireMillis) {
        Date date = new Date(System.currentTimeMillis() + expireMillis);
        Algorithm algorithm = Algorithm.HMAC256(password + salt);
        return JWT.create().withClaim("username", username).withExpiresAt(date).sign(algorithm);
    }

    /**
     * 根据request中的token获取用户账号
     */
    public static String getUsernameByToken(HttpServletRequest request) throws Exception {
        String accessToken = request.getHeader(AuthConstant.ACCESS_TOKEN);
        String username = getUsername(accessToken);
        if (StringUtils.isEmpty(username)) {
            throw new Exception("未获取到用户");
        }
        return username;
    }

}
