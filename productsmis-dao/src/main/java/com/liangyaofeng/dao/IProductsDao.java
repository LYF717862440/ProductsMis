package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Products;

import java.util.List;

public interface IProductsDao {

    List<Products> selectAllProducts(Products products);

    List<Products> selectBycname(int bid,int cid);

    List<Products> selectBybname(String bname);

    List<Products> selectByiname(String iname);

    List<Products> selectBymname(String mname);

    List<Products> selectBytname(String tname);

    List<Products> selectByhname(String hname);

    List<Products> selectByMarketPrice(String price);


}
