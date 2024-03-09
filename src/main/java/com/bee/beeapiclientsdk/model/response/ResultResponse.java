package com.bee.beeapiclientsdk.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhuWeiFeng
 * @create 17:17
 * @Description 通用返回类
 */
@Data
@NoArgsConstructor
public class ResultResponse implements Serializable {

    private static final long serialVersionUID = 2935150555773738622L;

    private Map<String, Object> data = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
