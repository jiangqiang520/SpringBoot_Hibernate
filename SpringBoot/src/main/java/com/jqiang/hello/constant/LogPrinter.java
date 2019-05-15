package com.jqiang.hello.constant;

public class LogPrinter {

	public static final String LOG_REQ = "              -------------------------------request begin-------------------------------              ";
	public static final String LOG_RET = "              -------------------------------request return-------------------------------              ";
	
	
	public static  void printRequestLog() {
		System.out.println(LOG_REQ);
	}
	
	
	public static void printResponseLog() {
	    System.out.println(LOG_RET);
	}
	

}
