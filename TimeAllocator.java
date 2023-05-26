package com.infy.timeallocation.service;

public class TimeAllocator {
    
	public String allocaeTimeSlot(String desktopNumber) {
		
		if(desktopNumber.charAt(1)=='A') {
			return "Morning 9 AM";
		}
		else if (desktopNumber.charAt(1)=='B') {
			return "Afternoon 1 PM";
		}
		return null;
}
}