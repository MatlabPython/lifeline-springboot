package com.example.service;

import com.example.entity.Tcompany;
import com.example.entity.Tuser;

import java.util.List;

/**
 * @Author: yifeng G
 * @Date: Create in 13:31 2018/4/4 2018
 * @Description:
 * @Modified By:
 * @Vsersion:
 */
public interface UserService {
    public List<Tuser> readByLoginName(int id);

    public List<Tcompany> getNameById(int id);
    public List getListById();
}
