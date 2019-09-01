package org.cd.cls.c3.d3;

import lombok.Data;

/**
 * @description: 产品：有产品唯 id 、名称、描述 图片 价格等属性
 * @author: Mr.Wang
 * @create: 2019-09-01 14:29
 **/
@Data
public class Product {
    private String id;
    private String name;
    private String  pictureUrl;
    private String description;
    private double price;

}
