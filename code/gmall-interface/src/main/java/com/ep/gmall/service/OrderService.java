package com.ep.gmall.service;

import com.ep.gmall.bean.UserAddress;

import java.util.List;

/***
 * @author dep
 * @version 1.0
 */
public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     * @return
     */
    public List<UserAddress> initOrder(String userId);
}
