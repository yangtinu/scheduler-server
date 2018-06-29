package com.founder.api.service;

import com.founder.job.dao.RfWaterMarkMapper;
import com.founder.scheduler.SchedulerJobInit;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Description: api接口service层
 * @Author: yang_yi1@founder.com.cn
 * @Date: Created in 9:17 2018/5/18
 */
@Service
public class ApiService {

    @Autowired
    RfWaterMarkMapper markMapper;

    private static Logger logger = Logger.getLogger(ApiService.class);

    /**
     * 重新从数据库加载数据
     */
    public void reload() {
        SchedulerJobInit.list = markMapper.queryApis();
        logger.info("重载数据成功...");
    }
}
