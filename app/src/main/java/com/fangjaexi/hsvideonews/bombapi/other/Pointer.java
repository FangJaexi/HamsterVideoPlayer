package com.fangjaexi.hsvideonews.bombapi.other;

import com.google.gson.annotations.SerializedName;

/**
 * 通用POINTER
 *
 * 作者：fangjaexi on 2016/8/18 0012 10:18
 * 邮箱：fangjaexi@163.com
 */
public class Pointer {
//    "__type": "Object",
//    "className": "_User",
//    "objectId": "D5vlAAAJ",

    @SerializedName("__type")
    private String type = "Pointer";

    private String className;

    private String objectId;

    public Pointer(String className, String objectId) {
        this.className = className;
        this.objectId = objectId;
    }

    public String getType() {
        return type;
    }

    public String getClassName() {
        return className;
    }

    public String getObjectId() {
        return objectId;
    }
}
