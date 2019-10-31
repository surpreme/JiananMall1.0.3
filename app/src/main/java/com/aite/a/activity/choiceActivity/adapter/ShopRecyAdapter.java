package com.aite.a.activity.choiceActivity.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aite.a.activity.choiceActivity.bean.ShopBean;
import com.aiteshangcheng.a.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;

import java.util.List;

public class ShopRecyAdapter extends RecyclerView.Adapter<ShopRecyAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private Context context;
    private List<ShopBean.DatasBean.StoreListBean> mDatas;

    public ShopRecyAdapter(Context context, List<ShopBean.DatasBean.StoreListBean> datas) {
        //这里适配器是写给主活动互相调用的方法
        this.context = context;
        this.mDatas = datas;
        this.inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public ShopRecyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.shop_item_layout, parent, false);
        ShopRecyAdapter.ViewHolder viewHolder = new ShopRecyAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ShopRecyAdapter.ViewHolder holder, int position) {
        holder.shop_name.setText(mDatas.get(position).getStore_name());
        Glide.with(context).load(mDatas.get(position).getStore_label()).into(holder.shop_icon);

    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView shop_name;
        ImageView shop_icon;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            shop_name = itemView.findViewById(R.id.shop_name);
            shop_icon = itemView.findViewById(R.id.shop_icon);

        }
    }

}

