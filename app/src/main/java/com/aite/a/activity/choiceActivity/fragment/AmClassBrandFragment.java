package com.aite.a.activity.choiceActivity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.aite.a.activity.choiceActivity.adapter.BanderRecyAdapter;
import com.aite.a.activity.choiceActivity.bean.BrandBean;
import com.aite.a.activity.choiceActivity.bean.BrandInnerBean;
import com.aite.a.activity.choiceActivity.bean.ExtraBean;
import com.aite.a.activity.choiceActivity.bean.ShopBean;
import com.aite.a.activity.choiceActivity.util.SpUtils;
import com.aite.a.base.Mark;
import com.aite.a.parse.NetRun;
import com.aite.a.utils.BeanConvertor;
import com.aiteshangcheng.a.R;
import com.gjiazhe.wavesidebar.WaveSideBar;
import com.google.gson.Gson;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.util.LogUtils;

import org.json.JSONObject;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import static android.support.constraint.solver.widgets.ConstraintWidget.ContentAlignment.BEGIN;
import static android.view.Gravity.END;

public class AmClassBrandFragment extends Fragment {
    private RecyclerView recyclerView;
    private WaveSideBar waveSideBar;
    private List<String> bandlist = new ArrayList<>();
    private BanderRecyAdapter banderRecyAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_amclassbrand, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.band_recy);
        waveSideBar = view.findViewById(R.id.side_bar);

        NetRun netRun = new NetRun(getActivity());
        netRun.onBrandtypeChoice(new RequestCallBack<String>() {
            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {
                final BrandBean brandBean = BeanConvertor.convertBean(responseInfo.result, BrandBean.class);
                Collections.sort(brandBean.getDatas(), new Comparator<BrandBean.DatasBean>() {
                    @Override
                    public int compare(BrandBean.DatasBean o1, BrandBean.DatasBean o2) {
                        int i = SpUtils.getPingYin(o1.getBrand_name()).toUpperCase().compareTo( SpUtils.getPingYin(o2.getBrand_name()).toUpperCase());
                        if (i > 0) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                });
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        banderRecyAdapter = new BanderRecyAdapter(getActivity(), brandBean.getDatas());
                        recyclerView.setAdapter(banderRecyAdapter);
                        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
                        waveSideBar.setOnSelectIndexItemListener(new WaveSideBar.OnSelectIndexItemListener() {
                            @Override
                            public void onSelectIndexItem(String index) {
                                for (int i = 0; i < brandBean.getDatas().size(); i++) {
                                    Log.d("",(String.valueOf(SpUtils.getPingYin(brandBean.getDatas().get(i).getBrand_name()))));
                                    if ((String.valueOf(SpUtils.getPingYin(brandBean.getDatas().get(i).getBrand_name()).charAt(0)).toUpperCase()).equals(index)) {
                                        recyclerView.scrollToPosition(i);
                                        //或者
//                        ((LinearLayoutManager) recyclerView.getLayoutManager()).scrollToPositionWithOffset(i, 0);
                                        return;
                                    }


                                }
                            }
                        });
                    }
                });
            }

            @Override
            public void onFailure(HttpException e, String s) {

            }
        });
    }

}
