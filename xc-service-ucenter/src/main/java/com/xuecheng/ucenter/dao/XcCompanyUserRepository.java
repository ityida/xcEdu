package com.xuecheng.ucenter.dao;

import com.xuecheng.framework.domain.ucenter.XcCompanyUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/28
 */
public interface XcCompanyUserRepository extends JpaRepository<XcCompanyUser, String> {
    /**
     * 根据用户id查询该用户所属的公司id
     * @param userId
     * @return
     */
    XcCompanyUser findByUserId(String userId);
}
