package com.ranjit.o2o.service;



import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import com.ranjit.o2o.BaseTest;
import com.ranjit.o2o.dto.ImageHolder;
import com.ranjit.o2o.dto.ShopExecution;
import com.ranjit.o2o.entity.Area;
import com.ranjit.o2o.entity.PersonInfo;
import com.ranjit.o2o.entity.Shop;
import com.ranjit.o2o.entity.ShopCategory;
import com.ranjit.o2o.enums.ShopStateEnum;
import com.ranjit.o2o.exceptions.ShopOperationException;

public class ShopServiceTest extends BaseTest{
    @Autowired
    private ShopService shopService;
    
	@Test
	public void testGetShopList() {
		Shop shopCondition = new Shop();
		ShopCategory sc = new ShopCategory();
		sc.setShopCategoryId(3L);
		shopCondition.setShopCategory(sc);
		ShopExecution se = shopService.getShopList(shopCondition, 2, 2);
		System.out.println("店铺列表数为：" + se.getShopList().size());
		System.out.println("店铺总数为：" + se.getCount());
	}
	
    @Test
    @Ignore
    public void testModifyShop()throws ShopOperationException, FileNotFoundException {
    	Shop shop =new Shop();
    	shop.setShopId(54L);
    	shop.setShopName("修改后的店铺名称");
    	File shopImg =new File("D:/Users/baidu/work/image/dabai.jpg");
    	InputStream is=new FileInputStream(shopImg);
    	ImageHolder imageHolder=new ImageHolder("dabai.jpg",is);
    	ShopExecution shopexecution=shopService.modifyShop(shop,imageHolder);
    	System.out.println(shopexecution.getShop().getShopImg());
    }
    
    @Test
    @Ignore
    public void testAddShop() throws ShopOperationException, FileNotFoundException {
       Shop shop=new Shop();
   	   PersonInfo owner=new PersonInfo();
   	   Area area=new Area();
   	   ShopCategory shopCategory=new ShopCategory();
   	   owner.setUserId(1L);
   	   area.setAreaId(2);
   	   shopCategory.setShopCategoryId(1L);
   	   shop.setOwner(owner);
   	   shop.setArea(area);	
   	   shop.setShopCategory(shopCategory);
   	   shop.setShopName("测试的店铺4");
   	   shop.setShopDesc("test4");
   	   shop.setShopAddr("test4");
   	   shop.setPhone("test4");
   	  
   	   shop.setCreateTime(new Date());
   	   shop.setEnableStatus(ShopStateEnum.CHECK.getState());
   	   shop.setAdvice("审核中");
   	   File shopImg =new File("D:/Users/baidu/work/image/xiaohuangren.jpg");
   	   InputStream is=new FileInputStream(shopImg);
   	   ImageHolder imageHolder=new ImageHolder(shopImg.getName(),is);
   	   ShopExecution se =shopService.addShop(shop, imageHolder);
   	   assertEquals(ShopStateEnum.CHECK.getState(),se.getState());
    }
}
