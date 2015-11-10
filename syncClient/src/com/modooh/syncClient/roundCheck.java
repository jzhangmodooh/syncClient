package com.modooh.syncClient; 

import org.quartz.Job;  
import org.quartz.JobExecutionContext;  
import org.quartz.JobExecutionException;  
	/**  
	 * Job Logic
	 * @author Jeremy Zhang  
	 *  
	 */  
	public class roundCheck implements Job {  
	  
	    @Override  
	    public void execute(JobExecutionContext arg0) throws JobExecutionException {  
//			int [] machineTime = new int[3];
//			Calendar c = Calendar.getInstance();
//			int hour = c.get(Calendar.HOUR_OF_DAY); 
//			int minute = c.get(Calendar.MINUTE); 
//			int second = c.get(Calendar.SECOND); 
//			machineTime[0] = hour;
//			machineTime[1] = minute;
//			machineTime[2] = second;
//			if(machineTime[0] == 0&&machineTime[1] ==0){
//				LANSync http = new LANSync();
//				System.out.println("Testing - Send Http GET request to change a time line");
//				try {
//					http.sendGet();
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
			LANSync http = new LANSync();
//			System.out.println("Testing - Send Http GET request to change a time line");
			try {
				http.sendGet();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }  
}
