package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Brand;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* BrandDao Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 16, 2018</pre> 
* @version 1.0 
*/ 
public class BrandDaoTest {
    IBrandDao brandDao;

@Before
public void before() throws Exception {
    brandDao=new BrandDao();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: selectAllBname() 
* 
*/ 
@Test
public void testSelectAllBname() throws Exception { 
//TODO: Test goes here...
    List<Brand> list=brandDao.selectAllBname();
    System.out.println(list);
} 


} 
