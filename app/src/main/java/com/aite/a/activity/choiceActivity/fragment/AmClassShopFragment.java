package com.aite.a.activity.choiceActivity.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aite.a.activity.choiceActivity.adapter.ShopRecyAdapter;
import com.aite.a.activity.choiceActivity.bean.ShopBean;
import com.aite.a.parse.NetRun;
import com.aite.a.utils.BeanConvertor;
import com.aiteshangcheng.a.R;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;

import org.json.JSONException;
import org.json.JSONObject;

public class AmClassShopFragment extends Fragment {
    private RecyclerView shop_type_recy;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_amclassshop, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        shop_type_recy = view.findViewById(R.id.shop_type_recy);
        shop_type_recy.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        NetRun netRun = new NetRun(getActivity());
        netRun.onShoptypeChoice(new RequestCallBack<String>() {
            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {
                try {
                    JSONObject  jsonObject = new JSONObject(responseInfo.result);
                    String isSuccess = jsonObject.optString("code");
                    if (!isSuccess.equals("200")) return;
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                ShopBean shopBean = BeanConvertor.convertBean(responseInfo.result, ShopBean.class);
                if (shopBean.getCode() != 200) return;
                shop_type_recy.setAdapter(new ShopRecyAdapter(getActivity(), shopBean.getDatas().getStore_list()));
                Log.e("", responseInfo.result);
            }

            @Override
            public void onFailure(HttpException e, String s) {

            }
        });
    }
}
