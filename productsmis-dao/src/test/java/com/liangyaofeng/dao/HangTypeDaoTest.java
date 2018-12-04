package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Hangtype;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* HangTypeDao Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 16, 2018</pre> 
* @version 1.0 
*/ 
public class HangTypeDaoTest {
    IHangTypeDao hangTypeDao;

@Before
public void before() throws Exception {
    hangTypeDao=new HangTypeDao();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: selectHangType() 
* 
*/ 
@Test
public void testSelectHangType() throws Exception { 
//TODO: Test goes here...
    List<Hangtype> list=hangTypeDao.selectHangType();
    System.out.println(list);
} 


} 
