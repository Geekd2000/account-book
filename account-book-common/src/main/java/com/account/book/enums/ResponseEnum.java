package com.account.book.enums;

/**
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/3/19 18:50
 */
public enum ResponseEnum {
    /**
     * 200 OK
     */
    SUCCESS(200, "请求成功！"),

    FAILURE(400, "请求失败！"),

    BAD_REQUEST(400, "请求参数的错误！"),

    UNAUTHORIZED(401, "当前用户没有相应角色/权限,请联系管理员！"),

    EX_ARG_NULL(400, "参数不能为空！");

    private Integer code;

    private String message;

    ResponseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResponseEnum valueOfCode(Integer code) {
        // 遍历 ResponseEnum 判断是否存在与 code 相同的枚举
        for (ResponseEnum responseEnum : ResponseEnum.values()) {
            if (responseEnum.getCode().equals(code)) {
                return responseEnum;
            }
        }
        return null;
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
}