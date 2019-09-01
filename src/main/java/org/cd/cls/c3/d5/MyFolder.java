package org.cd.cls.c3.d5;

import lombok.Data;

import java.util.Date;

/**
 * @description: 文件夹
 * @author: Mr.Wang
 * @create: 2019-09-01 14:50
 **/
@Data
public class MyFolder {
    //名称
    private String name;
    private Date createTime;
    //上级文件夹
    private MyFolder parent;
    //包含文件
    private MyFile[] files;
    //包含的子文件夹
    private MyFolder[] subFolder;

    public int totalSize(){
        int totalSize = 0;
        if(files != null){
            for (MyFile file: files) {
                totalSize += file.getSize();
            }
        }

        if(subFolder != null){
            for (MyFolder folder: subFolder) {
                totalSize += folder.totalSize();
            }
        }
        return totalSize;
    }
}
