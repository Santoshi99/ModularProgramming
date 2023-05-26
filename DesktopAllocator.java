package com.desktopallocation.service;

public class DesktopAllocator {
       
	
	static Integer number = 0;
//	public DesktopAllocator(){
//		number++;
//	}
	
	public String allocateDesktopNumber(Integer rollNumber) {
		number++;
		String deskNo= "";
		
		if(rollNumber%2==0) {
			deskNo= number+"A";
		}
		else {
			
			deskNo= number+"B";
		}
		return deskNo;
	
	}
}
