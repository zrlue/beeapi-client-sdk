package com.bee.beeapiclientsdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author ZhuWeiFeng
 * @create 17:05
 * @Description 名字接口的请求参数
 */
@Data
// 对应字段的 setter 方法调用后，会返回当前对象
@Accessors(chain = true)
public class NameParams {

    private static final long serialVersionUID = 15151646452269370L;

    private String name;

}
