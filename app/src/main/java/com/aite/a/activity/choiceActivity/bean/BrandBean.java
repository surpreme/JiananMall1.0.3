package com.aite.a.activity.choiceActivity.bean;

import java.io.Serializable;
import java.util.List;

public class BrandBean implements Serializable {


    /**
     * error_code : 0
     * message : success
     * datas : [{"brand_id":"110","brand_pic":"https://aitecc.com/data/upload/shop/brand/06166983839715552_sm.jpg","brand_href":"0","class_id":"645","show_type":"0","brand_name":"测试服饰品牌","brand_class":"棉衣"},{"brand_id":"108","brand_pic":"","brand_href":"0","class_id":"0","show_type":"0","brand_name":"测试","brand_class":""},{"brand_id":"107","brand_pic":"https://aitecc.com/data/upload/shop/brand/06017544598382270_small.jpg","brand_href":null,"class_id":"777","show_type":"0","brand_name":"小米","brand_class":"小米MIX3"},{"brand_id":"105","brand_pic":"https://aitecc.com/data/upload/shop/brand/06005325846331830_small.jpg","brand_href":"","class_id":"0","show_type":"0","brand_name":"奔驰","brand_class":""},{"brand_id":"103","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955977537077115_sm.png","brand_href":"0","class_id":"858","show_type":"0","brand_name":"QV","brand_class":"婴幼食品"},{"brand_id":"102","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955976981295497_sm.png","brand_href":"0","class_id":"738","show_type":"0","brand_name":"Adidas阿迪达斯","brand_class":"运动鞋"},{"brand_id":"101","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955973462696498_sm.png","brand_href":"0","class_id":"681","show_type":"0","brand_name":"COACH蔻驰","brand_class":"皮具箱包"},{"brand_id":"100","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955972750972704_sm.png","brand_href":"0","class_id":"771","show_type":"0","brand_name":"SIEMENS/西门子","brand_class":"数码家电"},{"brand_id":"99","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955967215662836_sm.png","brand_href":"0","class_id":"643","show_type":"0","brand_name":"优衣库UNIQLO","brand_class":"男女服装"},{"brand_id":"98","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955966016910993_sm.png","brand_href":"0","class_id":"0","show_type":"0","brand_name":"Gree/格力","brand_class":"电子数码"},{"brand_id":"97","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955964566607026_sm.png","brand_href":"0","class_id":"859","show_type":"0","brand_name":"合生元","brand_class":"配方奶粉"},{"brand_id":"96","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955964012690367_sm.png","brand_href":"0","class_id":"729","show_type":"0","brand_name":"Laneige/兰芝","brand_class":"唇彩"},{"brand_id":"95","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955961460356199_sm.png","brand_href":"0","class_id":"743","show_type":"0","brand_name":"Nike","brand_class":"跑步鞋"},{"brand_id":"94","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955960144265077_sm.png","brand_href":"0","class_id":"743","show_type":"0","brand_name":"特步","brand_class":"跑步鞋"},{"brand_id":"93","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955959646761080_sm.png","brand_href":"0","class_id":"743","show_type":"0","brand_name":"新佰伦","brand_class":"跑步鞋"},{"brand_id":"92","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955954222856604_sm.png","brand_href":"0","class_id":"712","show_type":"0","brand_name":"韩后","brand_class":"面膜"},{"brand_id":"91","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955953080668986_sm.png","brand_href":"0","class_id":"643","show_type":"0","brand_name":"韩舍衣都","brand_class":"男女服装"},{"brand_id":"90","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955950488476660_sm.png","brand_href":"0","class_id":"857","show_type":"0","brand_name":"贝亲","brand_class":"母婴用品"},{"brand_id":"89","brand_pic":"https://aitecc.com/data/upload/shop/brand/05794507050311952_small.jpg","brand_href":null,"class_id":"65","show_type":"0","brand_name":"魅族","brand_class":"手机"},{"brand_id":"88","brand_pic":"https://aitecc.com/data/upload/shop/brand/05793744881153425_small.jpg","brand_href":null,"class_id":"154","show_type":"0","brand_name":"魅族","brand_class":"魅族"},{"brand_id":"74","brand_pic":"https://aitecc.com/data/upload/shop/brand/05540649703083035_sm.png","brand_href":"0","class_id":"107","show_type":"0","brand_name":"爱佳","brand_class":"粉底"},{"brand_id":"73","brand_pic":"https://aitecc.com/data/upload/shop/brand/05540519735057906_small.png","brand_href":null,"class_id":"442","show_type":"0","brand_name":"家家乐","brand_class":"日用百货"},{"brand_id":"72","brand_pic":"https://aitecc.com/data/upload/shop/brand/05537114828455493_sm.jpg","brand_href":"0","class_id":"172","show_type":"0","brand_name":"步步高","brand_class":"VIVO"},{"brand_id":"70","brand_pic":"https://aitecc.com/data/upload/shop/brand/05537112977329476_sm.png","brand_href":"","class_id":"304","show_type":"0","brand_name":"康师傅方便面","brand_class":"方便面"},{"brand_id":"69","brand_pic":"https://aitecc.com/data/upload/shop/brand/05261286012098715_sm.jpg","brand_href":"0","class_id":"225","show_type":"0","brand_name":"哇哈哈","brand_class":"矿泉水"},{"brand_id":"68","brand_pic":"https://aitecc.com/data/upload/shop/brand/05700536843915129_sm.jpg","brand_href":"0","class_id":"10","show_type":"0","brand_name":"卡路丝","brand_class":"女装"},{"brand_id":"67","brand_pic":"","brand_href":"0","class_id":"10","show_type":"0","brand_name":"百丝","brand_class":"女装"},{"brand_id":"66","brand_pic":"","brand_href":"0","class_id":"10","show_type":"0","brand_name":"百色丽人","brand_class":"女装"},{"brand_id":"64","brand_pic":"","brand_href":"0","class_id":"10","show_type":"0","brand_name":"爱美丽","brand_class":"女装"},{"brand_id":"63","brand_pic":"","brand_href":"0","class_id":"10","show_type":"0","brand_name":"九茵","brand_class":"女装"},{"brand_id":"60","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247517457065429_sm.jpg","brand_href":"/shop/brand-43-0-0-0-0-0-0.html","class_id":"7","show_type":"0","brand_name":"大宝","brand_class":"母婴用品"},{"brand_id":"59","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247518680947955_sm.png","brand_href":"","class_id":"1","show_type":"0","brand_name":"爱马仕","brand_class":"服饰鞋帽"},{"brand_id":"58","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247521143357590_sm.jpeg","brand_href":"","class_id":"1","show_type":"0","brand_name":"阿迪达斯","brand_class":"服饰鞋帽"},{"brand_id":"56","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247522507650017_sm.jpg","brand_href":"0","class_id":"304","show_type":"0","brand_name":"康师傅","brand_class":"方便面"},{"brand_id":"54","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247578137227492_sm.jpg","brand_href":"0","class_id":"304","show_type":"1","brand_name":"统一","brand_class":"方便面"},{"brand_id":"53","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247579031382930_sm.jpg","brand_href":"0","class_id":"15","show_type":"1","brand_name":"李宁","brand_class":"流行男鞋"},{"brand_id":"52","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247581851459218_sm.jpg","brand_href":"0","class_id":"6","show_type":"0","brand_name":"景田百岁山","brand_class":"食品特产"},{"brand_id":"51","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247582752795836_sm.jpg","brand_href":"0","class_id":"1","show_type":"0","brand_name":"乔丹","brand_class":"服饰鞋帽"},{"brand_id":"50","brand_pic":"https://aitecc.com/data/upload/shop/brand/05179349536459154_sm.jpeg","brand_href":"0","class_id":"0","show_type":"0","brand_name":"景兰","brand_class":""},{"brand_id":"49","brand_pic":"https://aitecc.com/data/upload/shop/brand/05176635695308731_sm.jpg","brand_href":"0","class_id":"0","show_type":"0","brand_name":"波司登","brand_class":"服饰鞋帽"},{"brand_id":"48","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247584524967409_sm.jpg","brand_href":"","class_id":"0","show_type":"0","brand_name":"好丽友","brand_class":"食品特产"},{"brand_id":"47","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247585285336069_sm.jpg","brand_href":"","class_id":"65","show_type":"0","brand_name":"HTC","brand_class":"手机"},{"brand_id":"46","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247585916076273_sm.png","brand_href":"0","class_id":"255","show_type":"0","brand_name":"RIO","brand_class":"茶类饮料"},{"brand_id":"45","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247586832471300_sm.jpg","brand_href":"0","class_id":"105","show_type":"0","brand_name":"MOM FACE/亲润","brand_class":"洗护清洁"},{"brand_id":"44","brand_pic":"https://aitecc.com/data/upload/shop/brand/05175756192418003_sm.jpg","brand_href":"0","class_id":"10","show_type":"0","brand_name":"茵曼","brand_class":"女装"},{"brand_id":"43","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247588206297053_sm.jpg","brand_href":"0","class_id":"226","show_type":"0","brand_name":"美的","brand_class":"冰箱"},{"brand_id":"42","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247589378635228_sm.jpg","brand_href":"0","class_id":"227","show_type":"0","brand_name":"Sanyo/三洋","brand_class":"洗衣机"},{"brand_id":"41","brand_pic":"","brand_href":"0","class_id":"109","show_type":"0","brand_name":"森田药妆","brand_class":"洁面"},{"brand_id":"40","brand_pic":"","brand_href":"0","class_id":"109","show_type":"0","brand_name":"CEDAR·TREE/香柏树","brand_class":"洁面"},{"brand_id":"39","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247604712006684_sm.jpg","brand_href":"0","class_id":"87","show_type":"0","brand_name":"优异","brand_class":"亲子装"},{"brand_id":"38","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247605780648279_sm.jpg","brand_href":"0","class_id":"99","show_type":"0","brand_name":"异口童声","brand_class":"春装新款"},{"brand_id":"37","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247607298412291_sm.jpg","brand_href":"0","class_id":"0","show_type":"0","brand_name":"小猪班纳","brand_class":""},{"brand_id":"36","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247608078606765_sm.jpg","brand_href":"0","class_id":"97","show_type":"0","brand_name":"羊羊100","brand_class":"羊奶粉"},{"brand_id":"35","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247608774045045_sm.jpg","brand_href":"0","class_id":"97","show_type":"0","brand_name":"可瑞康","brand_class":"羊奶粉"},{"brand_id":"34","brand_pic":"","brand_href":"0","class_id":"226","show_type":"0","brand_name":"美菱","brand_class":"冰箱"},{"brand_id":"32","brand_pic":"","brand_href":"0","class_id":"227","show_type":"0","brand_name":"韩电","brand_class":"洗衣机"},{"brand_id":"31","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247609181014812_sm.jpg","brand_href":"0","class_id":"93","show_type":"0","brand_name":"Dumex/多美滋","brand_class":"奶食"},{"brand_id":"30","brand_pic":"","brand_href":"0","class_id":"0","show_type":"0","brand_name":"容声","brand_class":""},{"brand_id":"29","brand_pic":"","brand_href":"0","class_id":"107","show_type":"0","brand_name":"卡姿兰","brand_class":"粉底"},{"brand_id":"28","brand_pic":"https://aitecc.com/data/upload/shop/brand/05175090781445832_sm.gif","brand_href":"0","class_id":"225","show_type":"0","brand_name":"农夫山泉","brand_class":"矿泉水"},{"brand_id":"27","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247596237801900_sm.jpg","brand_href":"0","class_id":"223","show_type":"0","brand_name":"雀巢","brand_class":"黑咖啡"},{"brand_id":"26","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247599330207267_sm.jpg","brand_href":"0","class_id":"147","show_type":"0","brand_name":"古龙天成酱油","brand_class":"酱油"},{"brand_id":"25","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247596936222692_sm.jpg","brand_href":"0","class_id":"146","show_type":"1","brand_name":"红牛","brand_class":"红牛"},{"brand_id":"24","brand_pic":"","brand_href":"0","class_id":"0","show_type":"0","brand_name":"pinkcharm","brand_class":""},{"brand_id":"23","brand_pic":"","brand_href":"0","class_id":"143","show_type":"1","brand_name":"乐葵","brand_class":"蛋糕模具"},{"brand_id":"22","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247600131875855_sm.jpg","brand_href":"0","class_id":"145","show_type":"0","brand_name":"赢满益","brand_class":"棒棒糖"},{"brand_id":"21","brand_pic":"","brand_href":"0","class_id":"144","show_type":"1","brand_name":"麦吉士","brand_class":"鸡蛋糕"},{"brand_id":"20","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247595259947622_sm.jpg","brand_href":"0","class_id":"112","show_type":"0","brand_name":"泊泉雅","brand_class":"面膜"},{"brand_id":"9","brand_pic":"","brand_href":"0","class_id":"6","show_type":"1","brand_name":"卜珂","brand_class":"食品特产"},{"brand_id":"8","brand_pic":"","brand_href":"0","class_id":"6","show_type":"1","brand_name":"九鑫山珍","brand_class":"食品特产"},{"brand_id":"7","brand_pic":"","brand_href":"0","class_id":"1","show_type":"0","brand_name":"凡客","brand_class":"服饰鞋帽"},{"brand_id":"6","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955968624888753_sm.png","brand_href":"0","class_id":"1","show_type":"0","brand_name":"七匹狼","brand_class":"服饰鞋帽"},{"brand_id":"5","brand_pic":"https://aitecc.com/data/upload/shop/brand/05955957968630163_sm.png","brand_href":"0","class_id":"760","show_type":"0","brand_name":"太平鸟","brand_class":"户外服装"},{"brand_id":"4","brand_pic":"","brand_href":"0","class_id":"1","show_type":"0","brand_name":"南极人","brand_class":"服饰鞋帽"},{"brand_id":"3","brand_pic":"","brand_href":"0","class_id":"1","show_type":"1","brand_name":"海澜之家","brand_class":"服饰鞋帽"},{"brand_id":"1","brand_pic":"","brand_href":"0","class_id":"1","show_type":"1","brand_name":"森马","brand_class":"服饰鞋帽"},{"brand_id":"76","brand_pic":"https://aitecc.com/data/upload/shop/brand/05542269613276410_sm.png","brand_href":"0","class_id":"423","show_type":"0","brand_name":"茗品汇","brand_class":"饼干糕点"},{"brand_id":"71","brand_pic":"https://aitecc.com/data/upload/shop/brand/05308983138509791_sm.jpg","brand_href":"0","class_id":"24","show_type":"0","brand_name":"蓝波服饰","brand_class":"西服"},{"brand_id":"11","brand_pic":"","brand_href":"0","class_id":"65","show_type":"1","brand_name":"华为","brand_class":"手机"},{"brand_id":"10","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247602665476332_sm.jpg","brand_href":"0","class_id":"65","show_type":"0","brand_name":"iphone","brand_class":"手机"},{"brand_id":"33","brand_pic":"https://aitecc.com/data/upload/shop/brand/05247603624950542_sm.jpg","brand_href":"0","class_id":"228","show_type":"0","brand_name":"AUX/奥克斯","brand_class":"空调"},{"brand_id":"12","brand_pic":"","brand_href":"0","class_id":"0","show_type":"1","brand_name":"魅族","brand_class":""},{"brand_id":"13","brand_pic":"","brand_href":"0","class_id":"65","show_type":"1","brand_name":"小米","brand_class":"手机"},{"brand_id":"14","brand_pic":"","brand_href":"0","class_id":"0","show_type":"1","brand_name":"酷派","brand_class":""},{"brand_id":"77","brand_pic":"https://aitecc.com/data/upload/shop/brand/05542333700704348_sm.png","brand_href":"0","class_id":"136","show_type":"0","brand_name":"徐福记","brand_class":"糖果"},{"brand_id":"82","brand_pic":"https://aitecc.com/data/upload/shop/brand/05549253901954851_sm.jpg","brand_href":"0","class_id":"145","show_type":"1","brand_name":"阿尔卑斯","brand_class":"棒棒糖"},{"brand_id":"84","brand_pic":"https://aitecc.com/data/upload/shop/brand/05550881412146886_sm.jpg","brand_href":"0https://search.jd.com/Search?keyword=%E5%8F%AF%E5%8F%A3%E5%8F%AF%E4%B9%90&amp;enc=utf-8&amp;wq=%E5%8F%AF%E5%8F%A3%E5%8F%AF%E4%B9%90&amp;pvid=faa9cdc871d748f5abfe715b56497bb7","class_id":"137","show_type":"0","brand_name":"可口可乐","brand_class":"饮料产品"},{"brand_id":"83","brand_pic":"https://aitecc.com/data/upload/shop/brand/05550859057054409_sm.jpg","brand_href":"https://search.jd.com/Search?keyword=%E4%B9%9D%E9%98%B3%E5%8E%9F%E6%B1%81%E6%9C%BA&amp;enc=utf-8&amp;suggest=10.def.0.T14&amp;wq=%E4%B9%9D%E9%98%B3&amp;pvid=39f88adc85d042efa12548ad24928eb7","class_id":"2","show_type":"0","brand_name":"九阳","brand_class":"家用电器"},{"brand_id":"19","brand_pic":"","brand_href":"0","class_id":"65","show_type":"1","brand_name":"乐视手机","brand_class":"手机"},{"brand_id":"18","brand_pic":"","brand_href":"0","class_id":"65","show_type":"1","brand_name":"联想","brand_class":"手机"},{"brand_id":"17","brand_pic":"","brand_href":"0","class_id":"65","show_type":"1","brand_name":"VIVO","brand_class":"手机"},{"brand_id":"16","brand_pic":"","brand_href":"0","class_id":"0","show_type":"0","brand_name":"中兴","brand_class":""},{"brand_id":"109","brand_pic":"https://aitecc.com/data/upload/shop/brand/06156661094170427_sm.png","brand_href":"1","class_id":"0","show_type":"0","brand_name":"百年达","brand_class":"百年达"},{"brand_id":"15","brand_pic":"","brand_href":"0","class_id":"0","show_type":"0","brand_name":"三星","brand_class":""}]
     */

    private int error_code;
    private String message;
    private List<DatasBean> datas;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * brand_id : 110
         * brand_pic : https://aitecc.com/data/upload/shop/brand/06166983839715552_sm.jpg
         * brand_href : 0
         * class_id : 645
         * show_type : 0
         * brand_name : 测试服饰品牌
         * brand_class : 棉衣
         */

        private String brand_id;
        private String brand_pic;
        private String brand_href;
        private String class_id;
        private String show_type;
        private String brand_name;
        private String brand_class;

        public String getBrand_id() {
            return brand_id;
        }

        public void setBrand_id(String brand_id) {
            this.brand_id = brand_id;
        }

        public String getBrand_pic() {
            return brand_pic;
        }

        public void setBrand_pic(String brand_pic) {
            this.brand_pic = brand_pic;
        }

        public String getBrand_href() {
            return brand_href;
        }

        public void setBrand_href(String brand_href) {
            this.brand_href = brand_href;
        }

        public String getClass_id() {
            return class_id;
        }

        public void setClass_id(String class_id) {
            this.class_id = class_id;
        }

        public String getShow_type() {
            return show_type;
        }

        public void setShow_type(String show_type) {
            this.show_type = show_type;
        }

        public String getBrand_name() {
            return brand_name;
        }

        public void setBrand_name(String brand_name) {
            this.brand_name = brand_name;
        }

        public String getBrand_class() {
            return brand_class;
        }

        public void setBrand_class(String brand_class) {
            this.brand_class = brand_class;
        }
    }
}
