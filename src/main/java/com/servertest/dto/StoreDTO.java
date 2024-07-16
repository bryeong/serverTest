package com.servertest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StoreDTO {
    private String storeName;  // 가맹점명
    private String brandName;  // 프랜차이즈명
    private String delivery;
    private Integer likeCount;  // 좋아요 수

}
