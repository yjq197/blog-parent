package com.yjq.blog.service;

import com.yjq.blog.dao.pojo.SysUser;
import com.yjq.blog.vo.Result;
import com.yjq.blog.vo.params.LoginParams;

public interface LoginService {
    /**
     * 登录功能
     * @param loginParams
     * @return
     */
    Result login(LoginParams loginParams);

    SysUser checkToken(String token);

    /**
     * 退出登录
     * @param token
     * @return
     */
    Result logout(String token);

    Result register(LoginParams loginParams);
}
