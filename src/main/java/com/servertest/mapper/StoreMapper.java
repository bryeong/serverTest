package com.servertest.mapper;

import com.servertest.dto.StoreDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StoreMapper {
    /* insert store */
     void insertStoreWithLikeCount();

    /* update store likeCount */
     void updateStoreLikeCount(StoreDTO storeName);

     void selectStoreByStoreName();



}
