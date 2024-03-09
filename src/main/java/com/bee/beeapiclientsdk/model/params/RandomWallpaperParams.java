package com.bee.beeapiclientsdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author ZhuWeiFeng
 * @create 16:55
 * @Description: 随机壁纸参数
 */
@Data
@Accessors(chain = true)
public class RandomWallpaperParams implements Serializable {

    private static final long serialVersionUID = -4257558923936936054L;
    private String lx;
    private String method;
}
