package com.ls.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ls.dao.AreaDao;
import com.ls.pojo.Area;

public class TestDao extends BaseDao {

	
	 @Autowired
     private AreaDao areaDao;

	    @Test
	    public void testQueryArea(){

	        List<Area> list = areaDao.queryArea();
	        System.out.println(list.size()==4);
	    }
}
