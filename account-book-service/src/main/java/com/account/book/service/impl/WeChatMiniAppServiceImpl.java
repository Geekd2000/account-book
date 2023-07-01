package com.account.book.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.config.WxMaConfig;
import cn.binarywang.wx.miniapp.config.impl.WxMaDefaultConfigImpl;
import com.account.book.exception.RTException;
import com.account.book.service.WeChatMiniAppService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 微信小程序服务
 *
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/7/1 19:09
 */
@Service
@Slf4j
public class WeChatMiniAppServiceImpl implements WeChatMiniAppService {

    private final WxMaConfig wxMaConfig = new WxMaDefaultConfigImpl();

    private final WxMaService wxMaService = new WxMaServiceImpl();

    @Override
    public String getAccessToken() {
        try {
            return wxMaService.getAccessToken();
        } catch (Exception e) {
            log.error("wechat getAccessToken has exception!", e);
            throw new RTException(e);
        }
    }

    @Override
    public WxMaJscode2SessionResult code2Session(String code) {
        try {
            return wxMaService.jsCode2SessionInfo(code);
        } catch (Exception e) {
            log.error("wechat code2Session has exception!", e);
            throw new RTException(e);
        }
    }

}
