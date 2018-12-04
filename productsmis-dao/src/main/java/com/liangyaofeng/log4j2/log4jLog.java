package com.liangyaofeng.log4j2;

import com.liangyaofeng.dao.ProductsDao;
import org.apache.logging.log4j.LogManager;
import org.apache.log4j.Logger;

public class log4jLog {
    public static void main(String[] args) {
//        Logger logger = LogManager.getLogger(log4jLog.class);
        Logger log =Logger.getLogger("myTest");
        ProductsDao productsDao=new ProductsDao();

        log.debug(productsDao);
//        logger.info("Info Level");
//        logger.warn("Warn Level");
//        logger.error("Error Level");
    }

}
