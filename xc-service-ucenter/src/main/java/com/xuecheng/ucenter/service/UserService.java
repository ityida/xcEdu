package com.xuecheng.ucenter.service;

import com.xuecheng.framework.domain.ucenter.XcCompanyUser;
import com.xuecheng.framework.domain.ucenter.XcUser;
import com.xuecheng.framework.domain.ucenter.ext.XcUserExt;
import com.xuecheng.ucenter.dao.XcCompanyUserRepository;
import com.xuecheng.ucenter.dao.XcUserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/28
 */
@Service
public class UserService {
    @Autowired
    XcUserRepository xcUserRepository;
    @Autowired
    XcCompanyUserRepository xcCompanyUserRepository;

    /**
     * 根据账号查询xcUser信息
     *
     * @param username
     * @return
     */
    public XcUser findXcUserByUsername(String username) {
        return xcUserRepository.findByUsername(username);
    }

    /**
     * 根据账号查询用户信息
     *
     * @param username
     * @return
     */
    public XcUserExt getUserExt(String username) {
        //根据账号查询xcUser基本信息
        XcUser xcUser = this.findXcUserByUsername(username);
        if (xcUser == null) {
            return null;
        }
        //用户id
        String userId = xcUser.getId();
        //根据用户id查询用户所属公司id
        XcCompanyUser xcCompanyUser = xcCompanyUserRepository.findByUserId(userId);
        //取到用户的公司id
        String companyId = null;
        if (xcCompanyUser != null) {
            companyId = xcCompanyUser.getCompanyId();
        }
        // 创建XcUserExt对象
        XcUserExt xcUserExt = new XcUserExt();
        // 拷贝xcUser对象到xcUserExt对象
        BeanUtils.copyProperties(xcUser, xcUserExt);
        xcUserExt.setCompanyId(companyId);
        return xcUserExt;
    }

}
