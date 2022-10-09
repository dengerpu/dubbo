package com.ep.gmall.service.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.ep.gmall.bean.UserAddress;
import com.ep.gmall.service.UserService;

import java.util.List;

/***
 * @author dep
 * @version 1.0
 */
public class UserServiceStub implements UserService {
    private final UserService userService;


    /**
     * 传入的是userService远程的代理对象
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        super();
        this.userService = userService;
    }


    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // TODO Auto-generated method stub
        System.out.println("UserServiceStub.....");
        if(!StringUtils.isEmpty(userId)) {
            return userService.getUserAddressList(userId);
        }
        return null;
    }

}
