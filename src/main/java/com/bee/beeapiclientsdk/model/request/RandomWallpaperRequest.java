package com.bee.beeapiclientsdk.model.request;

import com.bee.beeapiclientsdk.model.enums.RequestMethodEnum;
import com.bee.beeapiclientsdk.model.params.RandomWallpaperParams;
import com.bee.beeapiclientsdk.model.response.RandomWallpaperResponse;
import com.bee.beeapiclientsdk.model.response.ResultResponse;

import lombok.experimental.Accessors;

/**
 * @author ZhuWeiFeng
 * @create 16:55
 * @Description:
 */
@Accessors(chain = true)
public class RandomWallpaperRequest extends BaseRequest<RandomWallpaperParams, RandomWallpaperResponse> {
    @Override
    public String getPath() {
        return "/randomWallpaper";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link ResultResponse}>
     */
    @Override
    public Class<RandomWallpaperResponse> getResponseClass() {
        return RandomWallpaperResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
