package com.example.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author Hu junhao
 * Create 2019/10/2
 * 任务类
 */
@Component
public class TestTask {
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //定义每过3秒执行该任务
//    @Scheduled(fixedDelay = 3000)
//    public void reportTime(){
//        System.out.println("当前时间："+dateFormat.format(new Date()));
//    }

    //定义每5秒执行一次
//    @Scheduled(cron = "0/5 * * * * ? ")
    public void reportTime2() {
        System.out.println("当前时间：" + dateFormat.format(new Date()));
    }
}
