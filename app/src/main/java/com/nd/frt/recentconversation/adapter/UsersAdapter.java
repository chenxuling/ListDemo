package com.nd.frt.recentconversation.adapter;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.nd.frt.recentconversation.R;
import com.nd.frt.recentconversation.model.UserInfo;
import com.nd.frt.recentconversation.viewholer.UserViewHoler;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UserViewHoler>{

    private List<UserInfo> mUserinfos;

    public UsersAdapter(List<UserInfo>userInfos) {
        mUserinfos = userInfos;
    }

    @NonNull
    @Override
    public UserViewHoler onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_user, viewGroup, false);
        return new UserViewHoler(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHoler userViewHoler, int position) {
        UserInfo userInfo = mUserinfos.get(position);
        Glide.with(userViewHoler.itemView.getContext())
                .load(userInfo.avatarUrl)
                .into(userViewHoler.mIvAvatar);
        userViewHoler.mTvUserName.setText(userInfo.userName);
        userViewHoler.mTvEmail.setText(userInfo.content);
    }

    @Override
    public int getItemCount() {
        return mUserinfos.size();
    }
}
