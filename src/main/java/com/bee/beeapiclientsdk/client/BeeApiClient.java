package com.bee.beeapiclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.bee.beeapiclientsdk.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

import static com.bee.beeapiclientsdk.utils.SignUtils.genSign;

/**
 * @author ZhuWeiFeng
 * @create 22:57
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeeApiClient {

    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 密钥
     */
    private String secretKey;

    /**
     * 网关
     */
    private static final String GATEWAY_HOST = "http://localhost:8090";



    // 使用GET方法从服务器获取名称信息
    public String getNameByGet(String name) {
        // 可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        // 将"name"参数添加到映射中
        paramMap.put("name", name);
        // 使用HttpUtil工具发起GET请求，并获取服务器返回的结果
        String result= HttpUtil.get(GATEWAY_HOST + "/api/name/", paramMap);
        // 打印服务器返回的结果
        System.out.println(result);
        // 返回服务器返回的结果
        return result;
    }

    // 使用POST方法从服务器获取名称信息
    public String getNameByPost(String name) {
        // 可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("name", name);
        // 使用HttpUtil工具发起POST请求，并获取服务器返回的结果
        String result= HttpUtil.post(GATEWAY_HOST + "/api/name/", paramMap);
        System.out.println(result);
        return result;
    }


    //用于构造请求头
    private Map<String, String> getHeaderMap(String body) {
        //创建HashMap对象
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("accessKey",accessKey);
        // 注意：不能直接发送密钥
        // hashMap.put("secretKey",secretKey);
        // 生成随机数（生成一个包含4个随机数字的字符串）
        hashMap.put("nonce", RandomUtil.randomNumbers(4));
        //请求体内容
        hashMap.put("body",body);
        //当前时间戳
        hashMap.put("timestamp",String.valueOf(System.currentTimeMillis()/1000));
        // 生成签名
        hashMap.put("sign" ,genSign(body, secretKey));
        return hashMap;
    }

    // 使用POST方法向服务器发送User对象，并获取服务器返回的结果
    public String getUserNameByPost(User user) {
        // 将User对象转换为JSON字符串
        String json = JSONUtil.toJsonStr(user);
        // 使用HttpRequest工具发起POST请求，并获取服务器的响应
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + "/api/name/user")
                //添加请求头
                .addHeaders(getHeaderMap(json))
                .body(json) // 将JSON字符串设置为请求体
                .execute(); // 执行请求
        // 打印服务器返回的状态码
        System.out.println(httpResponse.getStatus());
        // 获取服务器返回的结果
        String result = httpResponse.body();
        // 打印服务器返回的结果
        System.out.println(result);
        // 返回服务器返回的结果
        return result;
    }
}
