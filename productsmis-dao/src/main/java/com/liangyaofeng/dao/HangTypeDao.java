package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Hangtype;
import com.liangyaofeng.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class HangTypeDao implements IHangTypeDao{
    public List<Hangtype> selectHangType() {
        List<Hangtype> list=new ArrayList<Hangtype>();
        SqlSession session=SqlSessionFactoryUtils.OpenSqlSession(true);
        IHangTypeDao mapper=session.getMapper(IHangTypeDao.class);
        list = mapper.selectHangType();
        SqlSessionFactoryUtils.colseSqlSession(session);
        return list;
    }

    public void text() {
        Logger log = Logger.getLogger("myTest");
        HangTypeDao math=new HangTypeDao();
        log.debug(math);
        log.info(math);
        log.warn(math);
        log.error(math);
    }
}
