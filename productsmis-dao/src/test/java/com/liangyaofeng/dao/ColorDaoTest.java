package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Color;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* ColorDao Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 16, 2018</pre> 
* @version 1.0 
*/ 
public class ColorDaoTest {

    IColorDao colorDao;

@Before
public void before() throws Exception {
    colorDao=new ColorDao();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: selectAllColor() 
* 
*/ 
@Test
public void testSelectAllColor() throws Exception { 
//TODO: Test goes here...
    List<Color> list=colorDao.selectAllColor();
    System.out.println(list);
} 


} 
