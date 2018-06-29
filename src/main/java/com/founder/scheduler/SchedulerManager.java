package com.founder.scheduler;

import com.founder.job.RefreshWatermarkJob;
import org.apache.log4j.Logger;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.stereotype.Service;

import java.util.Date;


/**
 * @Description: 任务管理
 * @Author: yang_yi1@founder.com.cn
 * @Date: Created in 9:51 2018/5/16
 */
@Service
public class SchedulerManager {

    private static Logger logger = Logger.getLogger(SchedulerManager.class);

    public void run() throws SchedulerException {
        //1.获取Scheduler工厂类
        SchedulerFactory sf = new StdSchedulerFactory();
        //2.获取Scheduler类
        Scheduler scheduler = sf.getScheduler();
        //3.启动调度
        scheduler.start();
        logger.info("Scheduler服务已启动...");
        //4.获取Job实例
        JobDetail jb = JobBuilder.newJob(RefreshWatermarkJob.class)
                .withDescription("定时刷新水印")
                .withIdentity("定时刷新水印","定时任务")
                .build();

        //5.定义触发器
        Trigger t = TriggerBuilder.newTrigger()
                .withDescription("")
                .withIdentity("刷新水印的触发器","定时触发器")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 0 0 * * ? *"))//每天凌晨0点
//                .withSchedule(CronScheduleBuilder.cronSchedule("0/10 * * * * ? *"))//间隔十秒刷新
                .build();
        //6.将任务和触发器装载进scheduler
        scheduler.scheduleJob(jb,t);
    }

}
