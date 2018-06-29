package com.founder.scheduler;

import com.founder.job.dao.RfWaterMarkMapper;
import com.founder.job.entity.RfWaterMark;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TimerManager初始化
 * @Author: yang_yi1@founder.com.cn
 * @Date: Created in 17:10 2018/5/16
 */
@Component
@Order(value = 1)
public class SchedulerJobInit implements InitializingBean{
    @Autowired
    SchedulerManager schedulerManager;

    @Autowired
    RfWaterMarkMapper markMapper;

    public static List<RfWaterMark> list = new ArrayList<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        list = markMapper.queryApis();
        schedulerManager.run();
    }

}
