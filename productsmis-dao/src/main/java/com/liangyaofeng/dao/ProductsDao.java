package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Products;
import com.liangyaofeng.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ProductsDao implements IProductsDao{

    public List<Products> selectAllProducts(Products products) {
        List<Products> list=new ArrayList<Products>();
        SqlSession session=SqlSessionFactoryUtils.OpenSqlSession(true);
        IProductsDao mapper=session.getMapper(IProductsDao.class);
        list = mapper.selectAllProducts(products);
        SqlSessionFactoryUtils.colseSqlSession(session);
        return list;
    }

    public List<Products> selectBycname(int bid,int cid) {
        List<Products> list=new ArrayList<Products>();
        SqlSession session=SqlSessionFactoryUtils.OpenSqlSession(true);
        IProductsDao mapper=session.getMapper(IProductsDao.class);
        list = mapper.selectBycname(bid,cid);
        SqlSessionFactoryUtils.colseSqlSession(session);
        return list;
    }

    public List<Products> selectBybname(String bname) {
        List<Products> list=new ArrayList<Products>();
        SqlSession session=SqlSessionFactoryUtils.OpenSqlSession(true);
        IProductsDao mapper=session.getMapper(IProductsDao.class);
        list = mapper.selectBybname(bname);
        SqlSessionFactoryUtils.colseSqlSession(session);
        return list;
    }

    public List<Products> selectByiname(String iname) {
        List<Products> list=new ArrayList<Products>();
        SqlSession session=SqlSessionFactoryUtils.OpenSqlSession(true);
        IProductsDao mapper=session.getMapper(IProductsDao.class);
        list = mapper.selectByiname(iname);
        SqlSessionFactoryUtils.colseSqlSession(session);
        return list;
    }

    public List<Products> selectBymname(String mname) {
        List<Products> list=new ArrayList<Products>();
        SqlSession session=SqlSessionFactoryUtils.OpenSqlSession(true);
        IProductsDao mapper=session.getMapper(IProductsDao.class);
        list = mapper.selectBymname(mname);
        SqlSessionFactoryUtils.colseSqlSession(session);
        return list;
    }

    public List<Products> selectBytname(String tname) {
        List<Products> list=new ArrayList<Products>();
        SqlSession session=SqlSessionFactoryUtils.OpenSqlSession(true);
        IProductsDao mapper=session.getMapper(IProductsDao.class);
        list = mapper.selectBytname(tname);
        SqlSessionFactoryUtils.colseSqlSession(session);
        return list;
    }

    public List<Products> selectByhname(String hname) {
        List<Products> list=new ArrayList<Products>();
        SqlSession session=SqlSessionFactoryUtils.OpenSqlSession(true);
        IProductsDao mapper=session.getMapper(IProductsDao.class);
        list = mapper.selectByhname(hname);
        SqlSessionFactoryUtils.colseSqlSession(session);
        return list;
    }

    public List<Products> selectByMarketPrice(String price) {
        List<Products> list=new ArrayList<Products>();
        SqlSession session=SqlSessionFactoryUtils.OpenSqlSession(true);
        IProductsDao mapper=session.getMapper(IProductsDao.class);
        list = mapper.selectByMarketPrice(price);
        SqlSessionFactoryUtils.colseSqlSession(session);
        return list;
    }

    public void text() {
        Logger log = Logger.getLogger("myTest");
        ProductsDao math=new ProductsDao();
        log.debug(math);
        log.info(math);
        log.warn(math);
        log.error(math);
    }


}
