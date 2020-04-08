package com.ranjit.o2o.service;

import java.util.List;

import com.ranjit.o2o.entity.ShopCategory;

public interface ShopCategoryService {
	public static final String SCLISTKEY = "shopcategorylist";
	/**
	 * 根据查询条件获取shopCategory列表
	 * @param shopCategoryCondition
	 * @return List<ShopCategory>
	 */
	List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);
}
