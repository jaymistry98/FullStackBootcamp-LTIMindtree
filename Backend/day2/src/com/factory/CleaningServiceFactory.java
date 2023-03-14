package com.factory;

import com.cleaning.CleaningService;
import com.cleaning.MakingBed;
import com.cleaning.RoomCleaning;

public class CleaningServiceFactory {
	public static CleaningService createObject(char type){
		switch(type) {
		
		case 'r': return new RoomCleaning();
		case 'b': return new MakingBed();		
		}
		return null;
	}
}
