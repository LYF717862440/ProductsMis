package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Brand;
import com.liangyaofeng.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class BrandDao implements IBrandDao{
    public List<Brand> selectAllBname() {
        List<Brand> list=new ArrayList<Brand>();
        SqlSession session=SqlSessionFactoryUtils.OpenSqlSession(true);
        IBrandDao mapper=session.getMapper(IBrandDao.class);
        list = mapper.selectAllBname();
        SqlSessionFactoryUtils.colseSqlSession(session);
        return list;
    }

    public void text() {
        Logger log = Logger.getLogger("myTest");
        BrandDao math=new BrandDao();
        log.debug(math);
        log.info(math);
        log.warn(math);
        log.error(math);
    }
}
