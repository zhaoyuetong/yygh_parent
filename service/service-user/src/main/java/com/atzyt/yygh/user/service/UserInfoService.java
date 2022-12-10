package com.atzyt.yygh.user.service;

import com.atzyt.yygh.model.user.UserInfo;
import com.atzyt.yygh.vo.user.LoginVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

public interface UserInfoService extends IService<UserInfo> {
    //会员登录
    Map<String, Object> login(LoginVo loginVo);
    /**
     * 根据微信openid获取用户信息
     * @param openid
     * @return
     */
//    UserInfo getByOpenid(String openid);

}
