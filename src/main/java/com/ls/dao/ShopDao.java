package com.ls.dao;




import org.apache.ibatis.annotations.Param;

import com.ls.pojo.Shop;

import java.util.List;

public interface ShopDao {

    /**
     * 鍒嗛〉鏌ヨ搴楅摵,鍙緭鍏ョ殑鏉′欢鏈夛細搴楅摵鍚嶏紙妯＄硦锛夛紝搴楅摵鐘舵�侊紝搴楅摵Id,搴楅摵绫诲埆,鍖哄煙ID
     *
     * @param shopCondition
     * @param rowIndex
     * @param pageSize
     * @return
     *//*
    List<Shop> queryShopList(@Param("shopCondition") Shop shopCondition,
                             @Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

    *//**
     * 杩斿洖queryShopList鎬绘暟
     *
     * @param shopCondition
     * @return
     *//*
    int queryShopCount(@Param("shopCondition") Shop shopCondition);

    *//**
     * 閫氳繃employee id 鏌ヨ搴楅摵
     *
     * @param employeeId
     * @return List<shop>
     *//*
    List<Shop> queryByEmployeeId(long employeeId);

    *//**
     * 閫氳繃owner id 鏌ヨ搴楅摵
     *
     * @param shopId
     * @return shop
     *//*
    Shop queryByShopId(long shopId);

    *//**
     * 鏂板搴楅摵
     *
     * @param shop
     * @return effectedNum
     *//*
    int insertShop(Shop shop);

    *//**
     * 鏇存柊搴楅摵淇℃伅
     *
     * @param shop
     * @return effectedNum
     *//*
    int updateShop(Shop shop);

    *//**
     * 鍒犻櫎搴楅摵锛堝垵鐗堬紝鍗冲彧鏀寔鍒犻櫎灏氫笖娌℃湁鍙戝竷鍟嗗搧鐨勫簵閾猴級
     *
     * @param shopName
     * @return effectedNum
     *//*
    int deleteShopByName(String shopName);*/
}
