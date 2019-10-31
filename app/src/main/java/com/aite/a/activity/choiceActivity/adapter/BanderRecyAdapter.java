package com.aite.a.activity.choiceActivity.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aite.a.activity.choiceActivity.bean.BrandBean;
import com.aite.a.activity.choiceActivity.util.SpUtils;
import com.aiteshangcheng.a.R;

import java.util.List;

public class BanderRecyAdapter extends RecyclerView.Adapter<BanderRecyAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private Context context;
    private List<BrandBean.DatasBean> mDatas;

    public BanderRecyAdapter(Context context, List<BrandBean.DatasBean> datas) {
        //这里适配器是写给主活动互相调用的方法
        this.context = context;
        this.mDatas = datas;
        this.inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.text_itemlayout, parent, false);
        BanderRecyAdapter.ViewHolder viewHolder = new BanderRecyAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        String currentStrLetter = mDatas.get(position).getBrand_name().charAt(0) + "";
        String currentStrLetter = (SpUtils.getPingYin(mDatas.get(position).getBrand_name()).toUpperCase()).charAt(0) + "";
        if (position > 0) {
            String lastStrLetter = (SpUtils.getPingYin(mDatas.get(position - 1).getBrand_name()).toUpperCase()).charAt(0) + "";
            if (lastStrLetter.equals(currentStrLetter)) {
                holder.tv_index.setVisibility(View.GONE);
            } else {
                holder.tv_index.setText(currentStrLetter);
                holder.tv_index.setVisibility(View.VISIBLE);
            }
        } else {
            holder.tv_index.setText(currentStrLetter);
            holder.tv_index.setVisibility(View.VISIBLE);
        }

        holder.textView.setText(mDatas.get(position).getBrand_name());

    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView, tv_index;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            tv_index = itemView.findViewById(R.id.tv_index);


        }
    }

}
