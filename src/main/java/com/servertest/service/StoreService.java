package com.servertest.service;

import com.servertest.dto.StoreDTO;
import com.servertest.mapper.StoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
    @Autowired
    private StoreMapper storeMapper;

    public StoreDTO selectStore(String storeName) {
        return storeMapper.selectStoreByStoreName(storeName);
    }
    public void updateStore() {
        storeMapper.updateStoreLikeCount();
    }

    public void create_store_likeCount() {
        // 상점을 추가한다
        storeMapper.insertStoreWithLikeCount();
    }

}
