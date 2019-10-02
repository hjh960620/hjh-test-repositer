package com.example.demo.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * Author Hu junhao
 * Create 2019/10/2
 * 定义异步任务
 */
@Component
public class AsyncTask {

    //声明为异步方法
//    @Async
    public Future<Boolean> task1() throws Exception {
        long star = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("任务一耗时：" + (end - star) + "毫秒");
        return new AsyncResult<>(true);
    }

    //    @Async
    public Future<Boolean> task2() throws Exception {
        long star = System.currentTimeMillis();
        Thread.sleep(800);
        long end = System.currentTimeMillis();
        System.out.println("任务一耗时：" + (end - star) + "毫秒");
        return new AsyncResult<>(true);
    }

    //    @Async
    public Future<Boolean> task3() throws Exception {
        long star = System.currentTimeMillis();
        Thread.sleep(500);
        long end = System.currentTimeMillis();
        System.out.println("任务一耗时：" + (end - star) + "毫秒");
        return new AsyncResult<>(true);
    }
}
