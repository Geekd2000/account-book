package com.account.book.enums;

/**
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/3/19 18:53
 */
public enum MsgEnum {
    /**
     * 成功返回
     */
    SUCCESS("success", "请求成功！");

    private String msgCode;
    private String msg;

    MsgEnum(String msgCode, String msg) {
        this.msgCode = msgCode;
        this.msg = msg;
    }

    public String getMsgEnum() {
        return msgCode;
    }

    public void setMsgEnum(String msgCode) {
        this.msgCode = msgCode;
    }

    public String getMsg() {
        return this.msg;
    }
}
