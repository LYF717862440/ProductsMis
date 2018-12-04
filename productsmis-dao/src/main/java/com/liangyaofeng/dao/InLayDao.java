package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Inlay;
import com.liangyaofeng.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class InLayDao implements IInLayDao{

    public List<Inlay> selectAllInLay() {
        List<Inlay> list=new ArrayList<Inlay>();
        SqlSession session=SqlSessionFactoryUtils.OpenSqlSession(true);
        IInLayDao mapper=session.getMapper(IInLayDao.class);
        list = mapper.selectAllInLay();
        SqlSessionFactoryUtils.colseSqlSession(session);
        return list;
    }

    public void text() {
        Logger log = Logger.getLogger("myTest");
        InLayDao math=new InLayDao();
        log.debug(math);
        log.info(math);
        log.warn(math);
        log.error(math);
    }
}
