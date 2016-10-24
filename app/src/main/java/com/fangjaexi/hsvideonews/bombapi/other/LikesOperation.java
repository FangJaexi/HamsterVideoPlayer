package com.fangjaexi.hsvideonews.bombapi.other;

import com.fangjaexi.hsvideonews.bombapi.BombConst;

/**
 * 收藏新闻 / 取消收藏的请求体
 * 作者：fangjaexi on 2016/8/18 0012 10:18
 * 邮箱：fangjaexi@163.com
 */
public class LikesOperation {

    private RelationOperation likes;

    public LikesOperation(String userId, RelationOperation.Operation operation){
        Pointer pointer = new Pointer(BombConst.TABLE_USER,userId);
        likes = new RelationOperation(operation,pointer);
    }

    public RelationOperation getLikes() {
        return likes;
    }
//    "likes": {
//        "__op": "RemoveRelation",   // 代表此操作是删除一个Relation
//                "objects": [
//        {
//            "__type": "Pointer",
//                "className": "_User",  // 用户表名
//                "objectId": 用户Id
//        }
//        ]
}
