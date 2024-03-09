package com.bee.beeapiclientsdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author ZhuWeiFeng
 * @create 17:12
 * @Description 名字接口的返回类
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NameResponse extends ResultResponse {

    private static final long serialVersionUID = 8672154882125850446L;

    private String username;

}
