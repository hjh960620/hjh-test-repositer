/**
 * 
 */
package com.example.demo.controller;

import com.example.demo.domain.OssUser;
import com.example.demo.task.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * @author Administrator
 *
 */
@RestController
public class Tester {

	@Autowired
	AsyncTask asyncTask;
	
	@RequestMapping(value = "/test")
	public String test() {
		return "hello world!!11111111";
	}

	@RequestMapping(value = "/astest")
	public void asyncTaskTest() throws Exception {

		long star = System.currentTimeMillis();

		Future<Boolean> a = asyncTask.task1();
		Future<Boolean> b = asyncTask.task2();
		Future<Boolean> c = asyncTask.task3();

		//判断三个任务是否完成，没完成循环之三个任务完成后再退出
		while (!a.isDone() || !b.isDone() || !c.isDone()) {
			if (a.isDone() && b.isDone() && c.isDone()) {
				break;
			}
		}

		long end = System.currentTimeMillis();
		long time = end - star;
		OssUser user = new OssUser();
		user.setId(1111);
		user.setIsAdmin("0");

		System.out.println("任务完成，总耗时：" + (end - star) + "毫秒");

	}


}
