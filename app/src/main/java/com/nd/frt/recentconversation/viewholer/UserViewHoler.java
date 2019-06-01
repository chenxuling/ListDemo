package com.nd.frt.recentconversation.viewholer;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nd.frt.recentconversation.R;

public class UserViewHoler extends RecyclerView.ViewHolder{
    public final TextView mTvEmail;
    public final TextView mTvUserName;
    public ImageView mIvAvatar;

    public UserViewHoler(@NonNull View itemView){
        super(itemView);
        mIvAvatar = itemView.findViewById(R.id.ivAvatar);
        mTvUserName = itemView.findViewById(R.id.tvUserName);
        mTvEmail = itemView.findViewById(R.id.tvEmail);
    }

}
