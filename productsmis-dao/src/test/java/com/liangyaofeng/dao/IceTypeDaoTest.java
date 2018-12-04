package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Icetype;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* IceTypeDao Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 16, 2018</pre> 
* @version 1.0 
*/ 
public class IceTypeDaoTest {
    IIceTypeDao iIceTypeDao;

@Before
public void before() throws Exception {
    iIceTypeDao=new IceTypeDao();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: selectAllIceType() 
* 
*/ 
@Test
public void testSelectAllIceType() throws Exception { 
//TODO: Test goes here...
    List<Icetype> list=iIceTypeDao.selectAllIceType();
    System.out.println(list);
} 


} 
