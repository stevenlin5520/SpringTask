package com.steven.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 采用注解方式启动
 */
@Component("task2")
public class Task2 {

	//采用注解形式
	//每分钟的5-7秒每秒执行一次执行，21-25秒每秒执行一次
	@Scheduled(cron = "5-7,21-25 * * * * ?")
	public void print2(){
		System.out.println("注解形式--print2,"+new SimpleDateFormat("hh:mm:ss").format(new Date())+".......");
	}
}
