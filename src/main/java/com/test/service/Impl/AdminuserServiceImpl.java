package com.test.service.Impl;

import com.test.dao.AdminuserDao;
import com.test.entity.Adminuser;
import com.test.service.AdminuserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class AdminuserServiceImpl implements AdminuserService {

    @Resource
    AdminuserDao adminuserDao ;

    @Override
    public Adminuser getAdminuser(Adminuser adminuser) {
        // 密码加密
        return adminuserDao.getAdminuser(adminuser);
    }
}
