package com.ranjit.o2o.dao;



import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ranjit.o2o.BaseTest;
import com.ranjit.o2o.entity.ShopCategory;

public class ShopCategoryDaoTest extends BaseTest {
      @Autowired
      private ShopCategoryDao shopCategoryDao;
      @Test
      public void testQueryShopCategory() {
    	  List<ShopCategory> shopCategoryList=shopCategoryDao.queryShopCategory(null);
    	  System.out.println(shopCategoryList.size());
    	  
      }
}
