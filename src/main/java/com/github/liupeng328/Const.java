package com.github.liupeng328;

/**
 * 常量类
 */
public interface Const {
    //加密算法看这里
    //https://github.com/CrawlData/douyin-sign
    //抖音随机刷新视频列表
//    String url = "https://aweme-eagle.snssdk.com/aweme/v1/feed/?type=0&max_cursor=0&min_cursor=0&count=6&volume=0.0&pull_type=1&need_relieve_aweme=0&filter_warn=0&req_from&is_cold_start=0&longitude=120.388862&latitude=36.090072&ts=1545468521&js_sdk_version=1.5.4&app_type=normal&manifest_version_code=380&_rticket=1545468521415&ac=wifi&device_id=53039791462&iid=54915619827&mcc_mnc=46000&os_version=8.0.0&channel=update&version_code=380&device_type=MHA-AL00&language=zh&uuid=865296034887289&resolution=1080*1808&openudid=3a6f6cdf79dc8965&update_version_code=3802&app_name=aweme&version_name=3.8.0&os_api=26&device_brand=HUAWEI&ssmix=a&device_platform=android&dpi=480&aid=1128&as=a195cfd199360cbaed8411&cp=f667cb5e91d818ade1IgQk&mas=0139d6baba15f4cc628baffe83a99fad7c8c8c2c1c26a68646c60c";
    String url = "https://aweme.snssdk.com/aweme/v1/feed/?offset=0&count=10&is_pull_refresh=0&hot_search=0&latitude=0.0&longitude=0.0" +
            "&js_sdk_version=1.0.0&app_type=normal&manifest_version_code=340&_rticket=1543519141650&ac=wifi&device_id=52650937206&iid=52635715759" +
            "&os_version=8.1.0&channel=wandoujia_zhiwei&version_code=340&device_type=ONEPLUS%20A5000&language=zh&uuid=866265035315870&resolution=1080*1920" +
            "&openudid=4617150637217100&update_version_code=3402&test_name=aweme&version_name=3.4.0&os_api=27&device_brand=OnePlus&ssmix=a&device_platform=android&dpi=420" +
            "&aid=1128&count=6&type=0&max_cursor=0&min_cursor=-1&pull_type=2&mas=01ca43f1b69a405092612bb1c98c590b2b83bb47e823f8b3562eb8&as=a1b5bf7230b58c40115607&ts=1545728080";
//                                                                              mas=012171e807e61c257d23fa292cce0ea31e9a0a346ab825aa1648d8&as=a1550f72de2c7c34515061&ts=1545729230

    //User-Agent
//    String userAgent= "com.ss.android.ugc.aweme/380 (Linux; U; Android 8.0.0; zh_CN_#Hans; MHA-AL00; Build/HUAWEIMHA-AL00; Cronet/58.0.2991.0)";
    String userAgent= "Aweme/1.7.9 (iPhone; iOS 10.2.1; Scale/3.00)";
    //数据共享url 共享爬到的数据
    String shareUrl = "http://123.56.146.98:9999/insert/";
//    String shareUrl = "http://localhost:9999/insert/";
}
