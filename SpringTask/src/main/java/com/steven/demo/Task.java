package com.steven.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 在配置文件中创建bean来启动
 * @author Windows
 *
 */
public class Task {

	public void excuteTask(){
		System.out.println("20秒的时候启动"+new SimpleDateFormat("hh:mm:ss").format(new Date())+"..........");
	}
	
	public void print(){
		System.out.println("print,"+new SimpleDateFormat("hh:mm:ss").format(new Date())+".....");
	}
	
}
