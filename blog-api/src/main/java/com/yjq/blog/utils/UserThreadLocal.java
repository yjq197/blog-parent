package com.yjq.blog.utils;

import com.yjq.blog.dao.pojo.SysUser;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserThreadLocal {
    private UserThreadLocal(){}

    public static final ThreadLocal<SysUser> LOCAL = new ThreadLocal<>();

    public static void put(SysUser sysUser){
        LOCAL.set(sysUser);
    }

    public static SysUser get(){
        return LOCAL.get();
    }

    public static void remove(){
        LOCAL.remove();
    }

}
