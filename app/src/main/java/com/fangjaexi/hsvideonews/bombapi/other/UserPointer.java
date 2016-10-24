package com.fangjaexi.hsvideonews.bombapi.other;

import com.fangjaexi.hsvideonews.bombapi.BombConst;

/**
 * 指向用户表的Pointer
 *
 * 作者：fangjaexi on 2016/8/18 0012 10:18
 * 邮箱：fangjaexi@163.com
 */
public class UserPointer extends Pointer {
    private String username;

    public UserPointer(String objectId) {
        super(BombConst.TABLE_USER, objectId);
    }
//
//    "createdAt": "2016-07-11 12:20:07",
//    "updatedAt": "2016-07-11 12:20:09",
//    "username": "飞翔的猪头"

    public String getUsername() {
        return username;
    }
}
