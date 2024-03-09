package com.bee.beeapiclientsdk.client;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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


}
