package com.github.liupeng328;

import cn.hutool.db.Entity;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.useragent.UserAgentUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************************************************************");
        System.err.println("欢迎使用抖音视频下载工具，如有问题请加QQ群交流：317896269");
        System.err.println("开始抓取数据……");
        down();//开始下载
    }

    /**
     * 下载视频
     */
    private static void down() {
        UserAgentUtil.parse(Const.userAgent);
        ;
        String body = HttpRequest.get(Const.url).header("User-Agent", Const.userAgent).execute().body();
        JSONObject json = JSONUtil.parseObj(body);
        //System.out.println(JSONUtil.formatJsonStr(body));
        //抽取数据 响应数据详细解析见： doc/抖音视频列表接口分析.json
        //作者信息
        Entity author = Entity.create()
                .set()

    }
}
