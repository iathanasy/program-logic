package org.cd.cls.c3.d3;

import lombok.Data;

/**
 * @description: 订单条目：有多个产品
 * @author: Mr.Wang
 * @create: 2019-09-01 14:33
 **/
@Data
public class OrderItem {
    //购买产品
    private Product product;
    //购买数量
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    /**
     * 计算价格
     * @return
     */
    public double computePrice(){
        return product.getPrice() * quantity;
    }
}
