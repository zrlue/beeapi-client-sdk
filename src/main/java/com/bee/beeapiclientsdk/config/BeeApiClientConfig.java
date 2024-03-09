package com.bee.beeapiclientsdk.config;

import com.bee.beeapiclientsdk.client.BeeApiClient;
import com.bee.beeapiclientsdk.service.ApiService;
import com.bee.beeapiclientsdk.service.Impl.ApiServiceImpl;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZhuWeiFeng
 * @create 17:38
 * @Description
 */

@Configuration
// 这里给所有的配置加上前缀为"beeapi.client"
@ConfigurationProperties("beeapi.client")
@Data
@ComponentScan
public class BeeApiClientConfig {

    private String accessKey;

    private String secretKey;

    /**
     * 网关
     */
    private String host;

    /**
     * 创建一个BeeApiClient实例
     *
     * @return
     */
    @Bean
    public BeeApiClient beeApiClient() {
        //使用accessKey,secretKey创建一个BeeApiClient实例
        return new BeeApiClient(accessKey, secretKey);
    }

    @Bean
    public ApiService apiService() {
        ApiServiceImpl apiService = new ApiServiceImpl();
        apiService.setBeeApiClient(new BeeApiClient(accessKey, secretKey));
        if (StringUtils.isNotBlank(host)) {
            apiService.setGatewayHost(host);
        }
        return apiService;
    }

}
