package com.atzyt.yygh.user.service;


import com.atzyt.yygh.model.user.UserInfo;
import com.atzyt.yygh.vo.user.LoginVo;
import com.atzyt.yygh.vo.user.UserAuthVo;
import com.atzyt.yygh.vo.user.UserInfoQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

public interface UserInfoService extends IService<UserInfo> {
    //用户手机号登录接口
    Map<String, Object> loginUser(LoginVo loginVo);

    //根据openid判断
    UserInfo selectWxInfoOpenId(String openid);

    //用户认证
    void userAuth(Long userId, UserAuthVo userAuthVo);

    //用户列表（条件查询带分页）
    IPage<UserInfo> selectPage(Page<UserInfo> pageParam, UserInfoQueryVo userInfoQueryVo);

    //用户锁定
    void lock(Long userId, Integer status);

    //用户详情
    Map<String, Object> show(Long userId);

    //认证审批
    void approval(Long userId, Integer authStatus);

    /**
     * 根据微信openid获取用户信息
     * @param openid
     * @return
     */
    UserInfo getByOpenid(String openid);

}
