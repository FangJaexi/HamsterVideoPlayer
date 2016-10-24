package com.fangjaexi.hsvideonews.ui.likes;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import com.fangjaexi.hsvideonews.R;
import com.fangjaexi.hsvideonews.bombapi.BombClient;
import com.fangjaexi.hsvideonews.bombapi.NewsApi;
import com.fangjaexi.hsvideonews.bombapi.entity.NewsEntity;
import com.fangjaexi.hsvideonews.bombapi.other.LikesOperation;
import com.fangjaexi.hsvideonews.bombapi.other.RelationOperation;
import com.fangjaexi.hsvideonews.bombapi.result.UpdateResult;
import com.fangjaexi.hsvideonews.commons.CommonUtils;
import com.fangjaexi.hsvideonews.ui.UserManager;
import com.fangjaexi.hsvideonews.ui.base.BaseItemView;
import com.fangjaexi.hsvideonews.ui.comments.CommentsActivity;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 收藏列表单项视图
 */
public class LikesItemView extends BaseItemView<NewsEntity> {

    @BindView(R.id.ivPreview) ImageView ivPreview;
    @BindView(R.id.tvNewsTitle) TextView tvNewsTitle;
    @BindView(R.id.tvCreatedAt) TextView tvCreatedAt;

    private NewsEntity newsEntity;

    public LikesItemView(Context context) {
        super(context);
    }

    @Override protected void initView() {
        LayoutInflater.from(getContext()).inflate(R.layout.item_likes, this, true);
        ButterKnife.bind(this);
    }

    @Override protected void bindModel(NewsEntity newsEntity) {
        this.newsEntity = newsEntity;
        tvNewsTitle.setText(newsEntity.getNewsTitle());
        tvCreatedAt.setText(CommonUtils.format(newsEntity.getCreatedAt()));
        String url = CommonUtils.encodeUrl(newsEntity.getPreviewUrl());
        Picasso.with(getContext()).load(url).into(ivPreview);
    }

    @OnClick
    public void navigateToComments() {
        CommentsActivity.open(getContext(), newsEntity);
    }

    private void testDel() {
        NewsApi newsApi = BombClient.getsInstance().getNewsApi();
        String newsId = newsEntity.getObjectId();
        String userId = UserManager.getInstance().getObjectId();
        LikesOperation likesOperation = new LikesOperation(userId, RelationOperation.Operation.RemoveRelation);
        Call<UpdateResult> call = newsApi.changLikes(newsId, likesOperation);
        call.enqueue(callback);
    }

    private Callback<UpdateResult> callback = new Callback<UpdateResult>() {
        @Override public void onResponse(Call<UpdateResult> call, Response<UpdateResult> response) {

        }

        @Override public void onFailure(Call<UpdateResult> call, Throwable t) {

        }
    };
}
