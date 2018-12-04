package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Moral;
import com.liangyaofeng.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class MoralDao implements IMoralDao{
    public List<Moral> selectAllMoral() {
        List<Moral> list=new ArrayList<Moral>();
        SqlSession session=SqlSessionFactoryUtils.OpenSqlSession(true);
        IMoralDao mapper=session.getMapper(IMoralDao.class);
        list = mapper.selectAllMoral();
        SqlSessionFactoryUtils.colseSqlSession(session);
        return list;
    }

    public void text() {
        Logger log = Logger.getLogger("myTest");
        MoralDao math=new MoralDao();
        log.debug(math);
        log.info(math);
        log.warn(math);
        log.error(math);
    }
}
