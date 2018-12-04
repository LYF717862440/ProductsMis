package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Color;
import com.liangyaofeng.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ColorDao implements IColorDao{

    public List<Color> selectAllColor() {
        List<Color> list=new ArrayList<Color>();
        SqlSession session=SqlSessionFactoryUtils.OpenSqlSession(true);
        IColorDao mapper=session.getMapper(IColorDao.class);
        list = mapper.selectAllColor();
        SqlSessionFactoryUtils.colseSqlSession(session);
        return list;
    }

    public void text() {
        Logger log = Logger.getLogger("myTest");
        ColorDao math=new ColorDao();
        log.debug(math);
        log.info(math);
        log.warn(math);
        log.error(math);
    }
}
