package com.novus.dater.business;
import java.util.ArrayList;
import java.util.List;

import com.novus.dater.data.DaterRecord;

public class OrderRecords {
	
	public static String wantedNoKids = "true"; 
	public static String wantedMoreKids = "true";   // change to tostring.valueOf (parse)
	public static String wantedSmoker = "true";
	public static String wantedPets = "true";
	public static String wantedGender = "Male";
	
	public static String[] orderRecords( ArrayList daterData ){
			
			int noHasKids = 0;
            int noWantsKids = 0;
            int noSmokers = 0;
            int noHasPets = 0;
            int noFemale = 0;
            
            int perfectMatch = 0;
            List<String> matchesList = new ArrayList<String>();
            		
            
            DaterRecord[] strings = (DaterRecord[]) daterData.stream().toArray(DaterRecord[]::new);
          
            for( DaterRecord item : strings ){
            	
                if(wantedNoKids.equals(item.getHasKids())  ){
                	noHasKids++;               
                }
                
                if(wantedMoreKids.equals(item.getWantsKids())  ){
                	noWantsKids++;               
                }
                
                if(wantedSmoker.equals(item.getSmokes())  ){
                    noSmokers++;               
                }
                
                if(wantedPets.equals(item.getHasPets())  ){
                    noHasPets++;               
                }
                
                if(wantedGender.equals(item.getGender())  ){
                    noFemale++;               
                }              
                
                if (wantedNoKids.equals(item.getHasKids()) && 
                	wantedMoreKids.equals(item.getWantsKids()) && 
                	wantedSmoker.equals(item.getSmokes()) && 
                	wantedPets.equals(item.getHasPets()) &&
                	wantedGender.equals(item.getGender())
                	){
                	
                	perfectMatch++;
                	matchesList.add(item.getId());
                }
                  
            }
            
            System.out.println("\n" + noHasKids + " daters have kids");
            System.out.println(noWantsKids + " share your views on having more kids");
            System.out.println(noSmokers + " match your smokers preference");
            System.out.println(noHasPets + " daters your pets preference");
            System.out.println(noFemale + " daters are " + wantedGender + "\n");
            
            System.out.println(perfectMatch + " perfect matches! \n");
            
            String[] matchIDs = new String[(perfectMatch)];
            matchIDs = matchesList.toArray(matchIDs);
            
            return matchIDs;
	}
}
