package com.example.demo;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedular {
			
	@Scheduled(cron="0 * 15 * * ?")
	public void scheduleTask() {
		SimpleDateFormat d=new 
				SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
		String date=d.format(new Date());
		System.out.println(date);		
	}
}
