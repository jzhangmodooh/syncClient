package com.modooh.syncClient;
/**  
 * @author Jeremy Zhang  
 *  
 */
import org.apache.log4j.BasicConfigurator;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class syncScheduler{
	public static void main(String[] args) {  
		   BasicConfigurator.configure(); 
	       SchedulerFactory schedulerfactory=new StdSchedulerFactory();  
	       Scheduler scheduler=null;  
	       try{  
//via schedulerFactory get scheduler  
	           scheduler=schedulerfactory.getScheduler();  
	             
//creat jobDetail instance  
	           JobDetail job=JobBuilder.newJob(roundCheck.class).withIdentity("job1", "jgroup1").build();  
	    
//send Http request every 5 secs  
	              Trigger trigger=TriggerBuilder.newTrigger().withIdentity("simpleTrigger", "triggerGroup")  
	              .withSchedule(CronScheduleBuilder.cronSchedule("0/5 0/1 * * * ?"))  
	              .startNow().build();   
	             
//register job and trigge 
	           scheduler.scheduleJob(job, trigger);  
	             
//start schduler
	           scheduler.start();      
	           System.out.println(scheduler.isStarted());
	       }catch(Exception e){  
	           e.printStackTrace();  
	       }  	         
	}  
}  
