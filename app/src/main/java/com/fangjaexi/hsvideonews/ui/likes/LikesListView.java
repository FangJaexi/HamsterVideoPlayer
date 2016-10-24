package com.fangjaexi.hsvideonews.ui.likes;

import android.content.Context;
import android.util.AttributeSet;

import com.fangjaexi.hsvideonews.bombapi.BombConst;
import com.fangjaexi.hsvideonews.bombapi.entity.NewsEntity;
import com.fangjaexi.hsvideonews.bombapi.other.InQuery;
import com.fangjaexi.hsvideonews.bombapi.result.QueryResult;
import com.fangjaexi.hsvideonews.ui.UserManager;
import com.fangjaexi.hsvideonews.ui.base.BaseResourceView;

import retrofit2.Call;

/**
 * 我的收藏列表视图
 */
public class LikesListView extends BaseResourceView<NewsEntity,LikesItemView>{
    public LikesListView(Context context) {
        super(context);
    }

    public LikesListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LikesListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override protected Call<QueryResult<NewsEntity>> queryData(int limit, int skip) {
        String userId = UserManager.getInstance().getObjectId();
        InQuery where = new InQuery(BombConst.FIELD_LIKES, BombConst.TABLE_USER,userId);
        return newsApi.getLikedList(limit, skip, where);
    }

    @Override protected int getLimit() {
        return 15;
    }

    @Override protected LikesItemView createItemView() {
        return new LikesItemView(getContext());
    }

    public void clear(){
        adapter.clear();
    }
}
