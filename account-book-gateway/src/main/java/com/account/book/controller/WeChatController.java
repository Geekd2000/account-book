package com.account.book.controller;

import cn.binarywang.wx.miniapp.api.WxMaService;
import com.account.book.result.Response;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 微信小程序相关直达接口
 *
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/7/2 18:36
 */
@AllArgsConstructor
@Slf4j
@RestController
@RequestMapping("/wechat")
public class WeChatController {

//    @Resource
//    private WeChatMiniAppService weChatMiniAppService;

    private final WxMaService wxMaService;
//    private final WxMaMsgService wxMaMsgService;

//    WeChatMiniAppHelper wxMaMiniAppHelper;


    @GetMapping("/getAccessToken")
    public Response<?> getAccessToken() throws WxErrorException {
        String accessToken = wxMaService.getAccessToken();
        return Response.success(accessToken);
    }

//    @PostMapping("/sendUniformMessage")
//    public Response<?> sendUniformMessage(@RequestBody WxMaUniformMessage uniformMessage) throws WxErrorException {
//        wxMaMsgService.sendUniformMsg(uniformMessage);
//        return Response.success(true);
//    }

}
