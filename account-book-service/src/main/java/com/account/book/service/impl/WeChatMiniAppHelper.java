//package com.account.book.service.impl;
//
//import cn.binarywang.wx.miniapp.api.WxMaMsgService;
//import cn.binarywang.wx.miniapp.api.WxMaService;
//import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
//import cn.binarywang.wx.miniapp.bean.WxMaUniformMessage;
//import com.account.book.exception.RTException;
//import lombok.AllArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
///**
// * 微信小程序服务
// *
// * @author : JiangJunYe
// * @version : 1.0
// * @date : 2023/7/1 19:09
// */
//@AllArgsConstructor
//@Slf4j
//public class WeChatMiniAppHelper {
//
//    private final WxMaService wxMaService;
//    private final WxMaMsgService wxMaMsgService;
//
//
//    public String getAccessToken() {
//        try {
//            return wxMaService.getAccessToken();
//        } catch (Exception e) {
//            log.error("wechat getAccessToken has exception!", e);
//            throw new RTException(e);
//        }
//    }
//
//    public WxMaJscode2SessionResult code2Session(String code) {
//        try {
//            return wxMaService.jsCode2SessionInfo(code);
//        } catch (Exception e) {
//            log.error("wechat code2Session has exception!", e);
//            throw new RTException(e);
//        }
//    }
//
//    public void sendUniformMessage(WxMaUniformMessage uniformMessage) {
//        try {
//            wxMaMsgService.sendUniformMsg(uniformMessage);
//        } catch (Exception e) {
//            log.error("wechat sendUniformMessage has exception!", e);
//            throw new RTException(e);
//        }
//    }
//
//}
