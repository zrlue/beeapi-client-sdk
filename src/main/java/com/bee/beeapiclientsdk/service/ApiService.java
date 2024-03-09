package com.bee.beeapiclientsdk.service;

import cn.hutool.http.HttpResponse;
import com.bee.beeapiclientsdk.client.BeeApiClient;
import com.bee.beeapiclientsdk.exception.ApiException;
import com.bee.beeapiclientsdk.model.request.BaseRequest;
import com.bee.beeapiclientsdk.model.request.RandomWallpaperRequest;
import com.bee.beeapiclientsdk.model.response.RandomWallpaperResponse;
import com.bee.beeapiclientsdk.model.response.ResultResponse;

/**
 * @author ZhuWeiFeng
 * @create 16:55
 * @Description api请求服务
 */
public interface ApiService {

    /**
     * 通用请求
     *
     * @param request 要求
     * @return {@link HttpResponse}
     * @throws ApiException 业务异常
     */

    <O, T extends ResultResponse> T request(BaseRequest<O, T> request) throws ApiException;

    /**
     * 通用请求
     *
     * @param beeApiClient bee api客户端
     * @param request     要求
     * @return {@link T}
     * @throws ApiException 业务异常
     */
    <O, T extends ResultResponse> T request(BeeApiClient beeApiClient, BaseRequest<O, T> request) throws ApiException;


    /**
     * 获取随机壁纸
     *
     * @param request 要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException;

    /**
     * 获取随机壁纸
     *
     * @param beeApiClient qi api客户端
     * @param request     要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(BeeApiClient beeApiClient, RandomWallpaperRequest request) throws ApiException;

}
