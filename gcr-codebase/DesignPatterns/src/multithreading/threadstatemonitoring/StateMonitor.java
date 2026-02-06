package multithreading.threadstatemonitoring;

import java.time.LocalTime;

public class StateMonitor {
      public static void getState(Thread t) {
    	  System.out.println("["+t.getName()+"] Task-"+t.getId()+" is in "+t.getState()+" at "+LocalTime.now());
      }
}