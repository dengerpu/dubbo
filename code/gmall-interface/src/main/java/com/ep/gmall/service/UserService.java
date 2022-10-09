package com.ep.gmall.service;

import com.ep.gmall.bean.UserAddress;

import java.util.List;

/***
 * @author dep
 * @version 1.0
 * 用户服务
 */
public interface UserService {
    /**
     * 按照用户id返回所有的收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
