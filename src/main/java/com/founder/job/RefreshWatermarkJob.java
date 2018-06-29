package com.founder.job;

import com.founder.common.util.HttpUtil;
import com.founder.job.entity.RfWaterMark;
import com.founder.scheduler.SchedulerJobInit;
import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @Description: 刷新水印任务
 * @Author: yang_yi1@founder.com.cn
 * @Date: Created in 16:07 2018/5/16
 */
public class RefreshWatermarkJob implements Job {

    private static Logger logger = Logger.getLogger(RefreshWatermarkJob.class);

    @Override
    public void execute(JobExecutionContext jec) {
        try{
            logger.info("开始刷新水印...");
            List<RfWaterMark> list = SchedulerJobInit.list;
            list.stream().forEach(api -> {
                String url = "http://"+api.getIp()+":"+api.getPort()+"/"+api.getFwmc()+api.getApi();
                try {
                    HttpUtil.sendPost(url,"params={"+api.getParams()+"}");
                    logger.info("刷新成功：" + api.getIp());
                }catch (Exception e){
                    logger.info("刷新失败" + api.getIp());
                }
            });
        }catch (Exception e){
            logger.info("刷新失败");
        }
    }
}
