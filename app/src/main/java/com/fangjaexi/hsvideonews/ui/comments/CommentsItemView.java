package com.fangjaexi.hsvideonews.ui.comments;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.fangjaexi.hsvideonews.R;
import com.fangjaexi.hsvideonews.bombapi.entity.CommentsEntity;
import com.fangjaexi.hsvideonews.commons.CommonUtils;
import com.fangjaexi.hsvideonews.ui.base.BaseItemView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 评论列表视图上的单项视图
 *
 */
public class CommentsItemView extends BaseItemView<CommentsEntity>{
    public CommentsItemView(Context context) {
        super(context);
    }

    @BindView(R.id.tvContent) TextView tvContent; // 评论内容
    @BindView(R.id.tvAuthor) TextView tvAuthor; // 评论作者
    @BindView(R.id.tvCreatedAt) TextView tvCreatedAt; // 评论时间

    @Override protected void initView() {
        LayoutInflater.from(getContext()).inflate(R.layout.item_comments, this, true);
        ButterKnife.bind(this);
    }

    @Override protected void bindModel(CommentsEntity commentsEntity) {
        tvContent.setText(commentsEntity.getContent());
        tvAuthor.setText(commentsEntity.getAuthor().getUsername());
        tvCreatedAt.setText(CommonUtils.format(commentsEntity.getCreatedAt()));
    }
}
