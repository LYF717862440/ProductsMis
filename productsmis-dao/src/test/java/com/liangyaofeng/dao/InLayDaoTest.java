package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Inlay;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* InLayDao Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 16, 2018</pre> 
* @version 1.0 
*/ 
public class InLayDaoTest {
    IInLayDao iInLayDao;

@Before
public void before() throws Exception {
    iInLayDao=new InLayDao();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: selectAllInLay() 
* 
*/ 
@Test
public void testSelectAllInLay() throws Exception { 
//TODO: Test goes here...
    List<Inlay> list=iInLayDao.selectAllInLay();
    System.out.println(list);
} 


} 
