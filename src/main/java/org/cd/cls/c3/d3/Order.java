package org.cd.cls.c3.d3;

import lombok.Data;

import java.util.Date;

/**
 * @description: ）订单：有订单号 下单用户、选购产品列表及数量、下单时间 、收货人、收货地址 联系 电话 订单状态 属性
 * @author: Mr.Wang
 * @create: 2019-09-01 14:36
 **/
@Data
public class Order {
    private String id;
    private User user;
    //购买产品列表及数量
    private OrderItem[] items;
    private Date createTime;
    private String receiver;
    private String address;
    private String phone;
    private String status;

    public double computeTotalPrice(){
        double totalPrice = 0;
        if(items != null){
            for (OrderItem item: items) {
                totalPrice += item.computePrice();
            }
        }
        return totalPrice;
    }
}
