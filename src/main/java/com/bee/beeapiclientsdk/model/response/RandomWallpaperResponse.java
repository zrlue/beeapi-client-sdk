package com.bee.beeapiclientsdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author ZhuWeiFeng
 * @create 16:55
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RandomWallpaperResponse extends ResultResponse {

    private static final long serialVersionUID = -4989047191623196703L;

    private String imgurl;
}
