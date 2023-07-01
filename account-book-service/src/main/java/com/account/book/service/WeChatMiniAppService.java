package com.account.book.service;

import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;

/**
 * 微信小程序服务
 *
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/7/1 18:14
 */
public interface WeChatMiniAppService {

    /**
     * 获取接口调用凭据
     *
     * @return 获取到的凭证
     */
    String getAccessToken();

    /**
     * 小程序登录
     *
     * @param code 登录时获取的 js_code
     * @return session信息
     */
    WxMaJscode2SessionResult code2Session(String code);

}
