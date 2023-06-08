package com.account.book.entity;

import com.account.book.enums.ResponseEnum;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.UUID;

/**
 * 响应信息公共类
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/3/19 13:35
 */
public class Response<T> implements Serializable {

    private static final long serialVersionUID = -1L;

    private T data;
    private Integer code;
    private String message;
    private String requestId;
    private Boolean success;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getRequestId() {
        return requestId;
    }

    /**
     * 默认无参构造返回成功
     */
    public Response() {
        this.code = ResponseEnum.SUCCESS.getCode();
        this.message = ResponseEnum.SUCCESS.getMessage();
        this.requestId = UUID.randomUUID().toString();
        this.setSuccess(true);
    }

    /**
     * 自定义返回 code 及 message
     * @param code    响应码
     * @param message 响应信息
     */
    public Response(Integer code, String message) {
        this.requestId = UUID.randomUUID().toString();
        this.code = code;
        this.message = message;
        this.setSuccess(ResponseEnum.SUCCESS.getCode().equals(code));
    }

    /**
     * 自定义返回 code 及 message(包含响应数据)
     * @param code    响应码
     * @param message 响应信息
     * @param data    响应数据
     */
    public Response(Integer code, String message, T data) {
        this.requestId = UUID.randomUUID().toString();
        this.code = code;
        this.message = message;
        this.data = data;
        this.setSuccess(ResponseEnum.SUCCESS.getCode().equals(code));
    }

    /**
     * 请求成功响应
     * @param data 响应数据
     * @param <T>  泛型数据
     * @return 返回封装好的响应体
     */
    public static <T> Response<T> success(T data) {
        return new Response(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMessage(), data);
    }

    /**
     * 请求失败响应
     * @param <T> 泛型数据
     * @return 返回封装好的响应体
     */
    public static <T> Response<T> failure() {
        return new Response(ResponseEnum.FAILURE.getCode(), ResponseEnum.FAILURE.getMessage());
    }

    /**
     * 自定义请求失败响应
     * @param responseEnum 响应枚举
     * @param <T>          泛型数据
     * @return 返回封装好的响应体
     */
    public static <T> Response<T> failure(ResponseEnum responseEnum) {
        return new Response(responseEnum.getCode(), responseEnum.getMessage());
    }

    /**
     * 自定义请求失败响应
     * @param code    响应码
     * @param message 响应信息
     * @param <T>     泛型数据
     * @return 返回封装好的响应体
     */
    public static <T> Response<T> failure(Integer code, String message) {
        ResponseEnum responseEnum = ResponseEnum.valueOfCode(code);
        if (null != responseEnum && !StringUtils.isEmpty(responseEnum.getMessage())) {
            return new Response(responseEnum.getCode(), responseEnum.getMessage());
        }
        return new Response(code, message);
    }

}
