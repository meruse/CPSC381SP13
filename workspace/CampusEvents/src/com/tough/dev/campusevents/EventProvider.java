package com.tough.dev.campusevents;

import java.util.ArrayList;

public class EventProvider {
	
	public static String[] allEvents = {};
	public static String[] clubEvents = {};
	
	public static void loadEvents(){
		String[] events = {"Event 0","Event 1","Event 2","Event 3","Event 4","Event 5","Event 6","Event 7"};
		allEvents=new String[events.length];
		ArrayList<String> clubEventsBuilder = new ArrayList<String>();
		for(int i =0; i< events.length; i++){
			allEvents[i]=events[i];
			if(isClubEvent(events[i]))
				clubEventsBuilder.add(events[i]);
		}
		clubEvents = new String[clubEventsBuilder.size()];
		for(int i=0 ; i< clubEventsBuilder.size(); i++)
			clubEvents[i]=clubEventsBuilder.get(i);
		
	}
	public static boolean isClubEvent(String s){
		int eventNum =Integer.parseInt(s.charAt(s.length()-1)+"");
		if(eventNum %3 != 0)
			return true;
		return false;
	}
	public static String[] getAllEvents(){
		return allEvents;
	}
	public static String[] getClubEvents(){
		return clubEvents;
	}

}
