package com.xuecheng.api.auth;

import com.xuecheng.framework.domain.ucenter.request.LoginRequest;
import com.xuecheng.framework.domain.ucenter.response.JwtResult;
import com.xuecheng.framework.domain.ucenter.response.LoginResult;
import com.xuecheng.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/27
 */
@Api(value = "用户认证", description = "用户认证接口")
public interface AuthControllerApi {
    /**
     * 登录
     *
     * @param loginRequest
     * @return
     */
    @ApiOperation("登录")
    LoginResult login(LoginRequest loginRequest);

    /**
     * 退出
     *
     * @return
     */
    @ApiOperation("退出")
    ResponseResult logout();

    /**
     * 查询用户jwt令牌
     *
     * @return
     */
    @ApiOperation("查询用户jwt令牌")
    JwtResult userjwt();
}
