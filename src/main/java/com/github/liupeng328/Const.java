package com.github.liupeng328;

/**
 * 常量类
 */
public interface Const {
    //抖音随机刷新视频列表
    String url = "https://aweme-eagle.snssdk.com/aweme/v1/feed/?type=0&max_cursor=0&min_cursor=0&count=6&volume=0.0&pull_type=1&need_relieve_aweme=0&filter_warn=0&req_from&is_cold_start=0&longitude=120.388862&latitude=36.090072&ts=1545468521&js_sdk_version=1.5.4&app_type=normal&manifest_version_code=380&_rticket=1545468521415&ac=wifi&device_id=53039791462&iid=54915619827&mcc_mnc=46000&os_version=8.0.0&channel=update&version_code=380&device_type=MHA-AL00&language=zh&uuid=865296034887289&resolution=1080*1808&openudid=3a6f6cdf79dc8965&update_version_code=3802&app_name=aweme&version_name=3.8.0&os_api=26&device_brand=HUAWEI&ssmix=a&device_platform=android&dpi=480&aid=1128&as=a195cfd199360cbaed8411&cp=f667cb5e91d818ade1IgQk&mas=0139d6baba15f4cc628baffe83a99fad7c8c8c2c1c26a68646c60c";
    //User-Agent
    String userAgent= "com.ss.android.ugc.aweme/380 (Linux; U; Android 8.0.0; zh_CN_#Hans; MHA-AL00; Build/HUAWEIMHA-AL00; Cronet/58.0.2991.0)";
    //数据共享url 共享爬到的数据
    String shareUrl = "http://123.56.146.98:9999/insert/";
}
