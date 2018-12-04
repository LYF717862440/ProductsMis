package com.liangyaofeng.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtils {

    private static SqlSessionFactory factory;



    static {
        try {
            InputStream inputStream=Resources.getResourceAsStream("conf.xml");
            factory=new SqlSessionFactoryBuilder().build(inputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static SqlSession OpenSqlSession(boolean isAutoCommit){
        return getFactory().openSession(isAutoCommit);
    }


    /**关闭会话**/
    public static void colseSqlSession(SqlSession session){
        if(session!=null){
            session.close();
        }
    }




    public static SqlSessionFactory getFactory() {
        return factory;
    }

    public static void setFactory(SqlSessionFactory factory) {
        SqlSessionFactoryUtils.factory = factory;
    }



}
