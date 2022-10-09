package com.ep.gmall;

import com.ep.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/***
 * @author dep
 * @version 1.0
 */
public class MainApplication {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        OrderService orderService = applicationContext.getBean(OrderService.class);

        orderService.initOrder("1");
        System.out.println("调用完成....");
        System.in.read();
    }
}
