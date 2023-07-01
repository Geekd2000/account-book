package com.account.book.config;

import com.account.book.enums.ResponseEnum;
import com.account.book.exception.RTException;
import com.account.book.result.Response;
import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class ExceptionAdvice {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionAdvice.class);

    /**
     * 权限认证失败异常处理
     *
     * @param ex 异常结果
     * @return 异常结果
     */
    @ResponseBody
    @ExceptionHandler({AuthorizationException.class, AuthenticationException.class})
    public Response<String> handleShiroException(Exception ex) {
        return Response.failure(ResponseEnum.UNAUTHORIZED);
    }

    /**
     * 参数校验异常处理
     *
     * @param ex 参数校验异常
     * @return 异常结果
     */
    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Response<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        BindingResult result = ex.getBindingResult();
        StringBuilder errorMessage = new StringBuilder();
        if (result.hasErrors()) {
            List<ObjectError> errors = result.getAllErrors();
            if (CollectionUtils.isNotEmpty(errors)) {
                errors.forEach(p -> {
                    FieldError fieldError = (FieldError) p;
                    logger.warn("Bad Request Parameters: dto entity [{}],field [{}],message [{}]", fieldError.getObjectName(), fieldError.getField(), fieldError.getDefaultMessage());
                    errorMessage.append(fieldError.getDefaultMessage());
                });
            }
        }
        return Response.failure(ResponseEnum.BAD_REQUEST.getCode(), ex.getMessage());
    }

    /**
     * 系统全局自定义异常捕获
     *
     * @param ex 系统异常
     * @return 异常结果
     */
    @ResponseBody
    @ExceptionHandler(RTException.class)
    public Response<String> handleException(RTException ex) {
        logger.error("RTException. ", ex);
        return Response.failure(ResponseEnum.BAD_REQUEST.getCode(), ex.getMessage());
    }

    /**
     * 系统全局异常捕获
     *
     * @param ex 系统异常
     * @return 异常结果
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Response<String> handleException(Exception ex) {
        logger.error("Exception. ", ex);
        return Response.failure(ResponseEnum.BAD_REQUEST.getCode(), ex.getMessage());
    }

}
