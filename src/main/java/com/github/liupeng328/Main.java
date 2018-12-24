package com.github.liupeng328;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.http.useragent.UserAgent;
import cn.hutool.http.useragent.UserAgentUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************************************************************");
        System.err.println("欢迎使用抖音视频下载工具，如有问题请加QQ群交流：317896269");
        System.err.println("开始抓取数据……");
        down();//开始下载
    }

    /**
     *下载视频
     */
    private static void down() {
       UserAgentUtil.parse(Const.userAgent);;
        String body = HttpRequest.get(Const.url).header("User-Agent", Const.userAgent).execute().body();
        JSONObject jsonObject = JSONUtil.parseObj(body);
        System.out.println(JSONUtil.formatJsonStr(body));

    }
}
