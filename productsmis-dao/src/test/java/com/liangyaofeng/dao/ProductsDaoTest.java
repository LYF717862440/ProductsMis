package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Products;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* ProductsDao Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 15, 2018</pre> 
* @version 1.0 
*/ 
public class ProductsDaoTest {

    IProductsDao productsDao;

@Before
public void before() throws Exception {
    productsDao=new ProductsDao();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: selectAllProducts() 
* 
*/ 
@Test
public void testSelectAllProducts() throws Exception { 
//TODO: Test goes here...
    Products products=new Products(1001,2001,3002,4001,5001,6004);
    List<Products> list=productsDao.selectAllProducts(products);
    System.out.println(list);
    Assert.assertNotNull(list);
} 

/** 
* 
* Method: selectBycname(String cname) 
* 
*/ 
@Test
public void testSelectBycname() throws Exception { 
//TODO: Test goes here...
    List<Products> list=productsDao.selectBycname(2002,1001);
    System.out.println(list);
} 

/** 
* 
* Method: selectBybname(String bname) 
* 
*/ 
@Test
public void testSelectBybname() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: selectByiname(String iname) 
* 
*/ 
@Test
public void testSelectByiname() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: selectBymname(String mname) 
* 
*/ 
@Test
public void testSelectBymname() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: selectBytname(String tname) 
* 
*/ 
@Test
public void testSelectBytname() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: selectByhname(String hname) 
* 
*/ 
@Test
public void testSelectByhname() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: selectByMarketPrice(String price) 
* 
*/ 
@Test
public void testSelectByMarketPrice() throws Exception { 
//TODO: Test goes here... 
} 


} 
