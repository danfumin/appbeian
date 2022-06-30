package com.softsec.app.web;

import com.softsec.app.pojo.OrderInfo;
import com.softsec.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

   @Autowired
   private OrderService orderService;

    @GetMapping("{orderId}")
    public OrderInfo queryOrderByUserId(@PathVariable("orderId") int orderId) {
        // 根据id查询订单并返回
        return orderService.queryOrderById(orderId);
    }
}
