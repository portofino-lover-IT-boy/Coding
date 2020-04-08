package com.ranjit.o2o.dao;

import com.ranjit.o2o.entity.Area;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class AreaDaoTest {
   @Autowired
   private AreaDao areaDao;
   @Test
   public void testQueryArea() {
	   List<Area> areaList= areaDao.queryArea();
       assertEquals(5,areaList.size());
   }

}
