package com.example.controller;

import com.example.entity.Tuser;
import com.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: yifeng G
 * @Date: Create in 13:20 2018/4/4 2018
 * @Description:
 * @Modified By:
 * @Vsersion:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    protected static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/demo")
    @ResponseBody
    public String demoShowName() {
        logger.debug("访问getUserByName,Name={}", "12");
        return "name is " + "12";
    }

    /**
     * @param id
     * @throws
     * @Title: UserController
     * @Description: 由id获取user
     * @author mengfanzhu
     */
    @RequestMapping("/getUserByLoginName/{id}")
    @ResponseBody
    public Map<String, Object> getUserByName(@PathVariable int id) {
        Map<String, Object> result = new HashMap<String, Object>();
        List<Tuser> user = userService.readByLoginName(id);
        Assert.notNull(user);
        result.put("name", user.get(0).getUserName());
        return result;
    }
    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "index.html";
    }

}
