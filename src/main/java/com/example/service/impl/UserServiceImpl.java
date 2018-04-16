package com.example.service.impl;

import com.example.common.config.TargetDataSource;
import com.example.dao.TuserDao;
import com.example.entity.Tcompany;
import com.example.entity.Tuser;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Author: yifeng G
 * @Date: Create in 13:29 2018/4/4 2018
 * @Description:
 * @Modified By:
 * @Vsersion:
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TuserDao userDao;


    @Override
    @TargetDataSource(name = "ds1")
    public List<Tuser> readByLoginName(int id) {
        return userDao.queryFamilyList(id);
    }

    @TargetDataSource(name = "ds2")
    @Override
    public List<Tcompany> getNameById(int id) {
        return userDao.queryBy(id);
    }

}
