package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Icetype;
import com.liangyaofeng.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class IceTypeDao implements IIceTypeDao{
    public List<Icetype> selectAllIceType() {
        List<Icetype> list=new ArrayList<Icetype>();
        SqlSession session=SqlSessionFactoryUtils.OpenSqlSession(true);
        IIceTypeDao mapper=session.getMapper(IIceTypeDao.class);
        list = mapper.selectAllIceType();
        SqlSessionFactoryUtils.colseSqlSession(session);
        return list;
    }


    public void text() {
        Logger log = Logger.getLogger("myTest");
        IceTypeDao math=new IceTypeDao();
        log.debug(math);
        log.info(math);
        log.warn(math);
        log.error(math);
    }
}
