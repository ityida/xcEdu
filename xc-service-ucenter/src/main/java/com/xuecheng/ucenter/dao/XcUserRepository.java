package com.xuecheng.ucenter.dao;

import com.xuecheng.framework.domain.ucenter.XcUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/28
 */
public interface XcUserRepository extends JpaRepository<XcUser,String> {
    /**
     * 根据账号查询用户信息
     * @param userName
     * @return
     */
    XcUser findByUsername(String userName);
}
