package com.aite.a.activity.choiceActivity.bean;

import java.io.Serializable;
import java.util.List;

public class ShopBean implements Serializable {

    /**
     * code : 200
     * hasmore : true
     * page_total : 35
     * datas : {"store_list":[{"store_points":"113.952039,22.558524","store_id":"1","store_name":"风骚的炮炮兵精品服装店","seller_name":"aitebobo","area_info":"广东省深圳市南山区","store_address":"高新园","store_label":"06003762923086176.jpg","store_zy":"","bill_cycle":0},{"store_points":"","store_id":"2","store_name":"艾特自营商城","seller_name":"aitesoft","area_info":"","store_address":"","store_label":"06017506730634628.jpg","store_zy":"手机,电脑,笔记本,一体机","bill_cycle":0},{"store_points":"113.331306,23.294514","store_id":"3","store_name":"初语","seller_name":"aite","area_info":"广东省广州市白云区","store_address":"兴泰路28号","store_label":"05174271343550930.jpg","store_zy":"女装  男装  童装","bill_cycle":0},{"store_points":"113.958437,22.543689","store_id":"4","store_name":"天威数码专卖店","seller_name":"aite666666","area_info":"广东省深圳市南山区","store_address":"高新园赋安科技大厦B座909","store_label":"06003765166522123.jpg","store_zy":"手机，电脑，平板，单反；","bill_cycle":0},{"store_points":"113.958437,22.543689","store_id":"6","store_name":"艾特集团","seller_name":"aite1111","area_info":"广东省深圳市南山区","store_address":"高新园赋安科技大厦909","store_label":null,"store_zy":"","bill_cycle":0}]}
     */

    private int code;
    private boolean hasmore;
    private int page_total;
    private DatasBean datas;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isHasmore() {
        return hasmore;
    }

    public void setHasmore(boolean hasmore) {
        this.hasmore = hasmore;
    }

    public int getPage_total() {
        return page_total;
    }

    public void setPage_total(int page_total) {
        this.page_total = page_total;
    }

    public DatasBean getDatas() {
        return datas;
    }

    public void setDatas(DatasBean datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        private List<StoreListBean> store_list;

        public List<StoreListBean> getStore_list() {
            return store_list;
        }

        public void setStore_list(List<StoreListBean> store_list) {
            this.store_list = store_list;
        }

        public static class StoreListBean {
            /**
             * store_points : 113.952039,22.558524
             * store_id : 1
             * store_name : 风骚的炮炮兵精品服装店
             * seller_name : aitebobo
             * area_info : 广东省深圳市南山区
             * store_address : 高新园
             * store_label : 06003762923086176.jpg
             * store_zy :
             * bill_cycle : 0
             */

            private String store_points;
            private String store_id;
            private String store_name;
            private String seller_name;
            private String area_info;
            private String store_address;
            private String store_label;
            private String store_zy;
            private int bill_cycle;

            public String getStore_points() {
                return store_points;
            }

            public void setStore_points(String store_points) {
                this.store_points = store_points;
            }

            public String getStore_id() {
                return store_id;
            }

            public void setStore_id(String store_id) {
                this.store_id = store_id;
            }

            public String getStore_name() {
                return store_name;
            }

            public void setStore_name(String store_name) {
                this.store_name = store_name;
            }

            public String getSeller_name() {
                return seller_name;
            }

            public void setSeller_name(String seller_name) {
                this.seller_name = seller_name;
            }

            public String getArea_info() {
                return area_info;
            }

            public void setArea_info(String area_info) {
                this.area_info = area_info;
            }

            public String getStore_address() {
                return store_address;
            }

            public void setStore_address(String store_address) {
                this.store_address = store_address;
            }

            public String getStore_label() {
                return store_label;
            }

            public void setStore_label(String store_label) {
                this.store_label = store_label;
            }

            public String getStore_zy() {
                return store_zy;
            }

            public void setStore_zy(String store_zy) {
                this.store_zy = store_zy;
            }

            public int getBill_cycle() {
                return bill_cycle;
            }

            public void setBill_cycle(int bill_cycle) {
                this.bill_cycle = bill_cycle;
            }
        }
    }
}
