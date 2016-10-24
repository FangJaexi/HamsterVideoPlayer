package com.fangjaexi.hsvideonews.bombapi.other;


/**
 * 作者：fangjaexi on 2016/8/12 0012 15:15
 * 邮箱：fangjaexi@163.com
 */
public class InQuery {

    private final String field;
    private final String className;
    private final String objectId;

    public InQuery(String field, String className, String objectId) {
        this.field = field;
        this.className = className;
        this.objectId = objectId;
    }

    // 查询当前表的news字段
    //    where = {
    //      "news": {
    //        "$inQuery": {
    //            "className": "News"
    //            "where": {
    //                "objectId": 新闻Id
    //            },
    //      }
//        }
//    }
    final String LIKES_IN_QUERY =
            "{ \"%s\": { \"$inQuery\": {\"where\": {\"objectId\":\"%s\"}, \"className\": \"%s\"}}}";

    @Override public String toString() {
        return String.format(LIKES_IN_QUERY, field, objectId, className);
    }
}