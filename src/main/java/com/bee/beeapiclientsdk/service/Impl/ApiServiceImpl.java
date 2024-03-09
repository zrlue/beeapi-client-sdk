package com.bee.beeapiclientsdk.service.Impl;

import com.bee.beeapiclientsdk.client.BeeApiClient;
import com.bee.beeapiclientsdk.exception.ApiException;
import com.bee.beeapiclientsdk.model.request.RandomWallpaperRequest;
import com.bee.beeapiclientsdk.model.response.RandomWallpaperResponse;
import com.bee.beeapiclientsdk.service.ApiService;
import com.bee.beeapiclientsdk.service.BaseService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author ZhuWeiFeng
 * @create 16:55
 * @Description
 */
@Slf4j
public class ApiServiceImpl extends BaseService implements ApiService {

    @Override
    public RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(BeeApiClient beeApiClient, RandomWallpaperRequest request) throws ApiException {
        return request(beeApiClient, request);
    }
}
