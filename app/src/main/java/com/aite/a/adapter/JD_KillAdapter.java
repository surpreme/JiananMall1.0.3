package com.aite.a.adapter;

import java.util.List;

import com.aite.a.activity.GoodsDatailsActivity;
import com.aite.a.activity.GoodsDetailsFargmentActivity;
import com.aite.a.activity.ProductDetailsActivity;
import com.aite.a.model.GoodList;
import com.aiteshangcheng.a.R;
import com.lidroid.xutils.BitmapUtils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 秒杀适配
 * 
 * @author Administrator
 *
 */
public class JD_KillAdapter extends Adapter<ViewHolder2> {

	private Context mactivity;
	private BitmapUtils bitmapUtils;
	private List<GoodList> saleGoodsList;

	public JD_KillAdapter(Context mactivity,List<GoodList> saleGoodsList) {
		this.mactivity = mactivity;
		bitmapUtils = new BitmapUtils(mactivity);
		this.saleGoodsList=saleGoodsList;
	}

	@Override
	public int getItemCount() {
		return saleGoodsList==null?0:saleGoodsList.size();
	}

	@Override
	public void onBindViewHolder(ViewHolder2 arg0, int arg1) {
		final GoodList goodList = saleGoodsList.get(arg1);
		bitmapUtils.display(arg0.id_index_gallery_item_image, goodList.goods_image);
		arg0.id_index_gallery_item_text.setText("￥"+goodList.goods_price);
		arg0.tv_laseprice.setText("￥"+goodList.goods_marketprice);
		arg0.tv_laseprice.getPaint().setFlags(Paint. STRIKE_THRU_TEXT_FLAG); //中划线
		arg0.id_index_gallery_item_image.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// 详情
				Intent intent = new Intent(mactivity, ProductDetailsActivity.class);
				intent.putExtra("goods_id", goodList.getGoods_id());
				mactivity.startActivity(intent);
			}
		});
	}

	@Override
	public ViewHolder2 onCreateViewHolder(ViewGroup parent, int arg1) {
		ViewHolder2 holder = new ViewHolder2(LayoutInflater.from(mactivity)
				.inflate(R.layout.item_jd_killgoods, parent, false));
		return holder;
	}
}

class ViewHolder2 extends android.support.v7.widget.RecyclerView.ViewHolder {
	ImageView id_index_gallery_item_image;
	TextView id_index_gallery_item_text,tv_laseprice;

	public ViewHolder2(View itemView) {
		super(itemView);
		id_index_gallery_item_image = (ImageView) itemView
				.findViewById(R.id.id_index_gallery_item_image);
		id_index_gallery_item_text = (TextView) itemView
				.findViewById(R.id.id_index_gallery_item_text);
		tv_laseprice = (TextView) itemView
				.findViewById(R.id.tv_laseprice);
	}
}
