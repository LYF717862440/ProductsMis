package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Moral;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* MoralDao Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 16, 2018</pre> 
* @version 1.0 
*/ 
public class MoralDaoTest {
    IMoralDao iMoralDao;

@Before
public void before() throws Exception {
    iMoralDao=new MoralDao();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: selectAllMoral() 
* 
*/ 
@Test
public void testSelectAllMoral() throws Exception { 
//TODO: Test goes here...
    List<Moral> list=iMoralDao.selectAllMoral();
    System.out.println(list);
} 


} 
