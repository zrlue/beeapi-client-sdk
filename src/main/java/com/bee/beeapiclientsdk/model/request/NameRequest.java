package com.bee.beeapiclientsdk.model.request;

import com.bee.beeapiclientsdk.model.enums.RequestMethodEnum;
import com.bee.beeapiclientsdk.model.params.NameParams;
import com.bee.beeapiclientsdk.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * @author ZhuWeiFeng
 * @create 17:32
 * @Description 名字接口的请求类
 */
@Accessors(chain = true)
public class NameRequest extends BaseRequest<NameParams, NameResponse> {
    @Override
    public String getPath() {
        return "/name";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<NameResponse> getResponseClass() {
        return NameResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
