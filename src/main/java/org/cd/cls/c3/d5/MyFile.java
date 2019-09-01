package org.cd.cls.c3.d5;

import lombok.Data;

import java.util.Date;

/**
 * @description: 文件类
 * @author: Mr.Wang
 * @create: 2019-09-01 14:48
 **/
@Data
public class MyFile {
    //名称
    private String name;
    private Date createTime;
    //文件大小
    private int size;

    //上级目录
    private MyFolder parent;
}
