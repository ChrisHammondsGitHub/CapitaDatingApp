package com.novus.dater.business;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.novus.dater.data.DaterRecord;

public class DaterData {
	private ArrayList <DaterRecord> records;
	
	public DaterRecord record;
	
	public DaterData() {
		records = new ArrayList<DaterRecord>();
	}

	public int getNumberOfRecords() {
		return records.size();
	}
	
	public DaterRecord getRecordNumber(int i){
		return records.get(i);		
	}	
	
	public ArrayList<DaterRecord> getRecords() {
		return records;
	}

	public void setRecords(ArrayList<DaterRecord> records) {
		this.records = records;
	}

	public void loadDataFromFile(String filepath) {
		
		try{
			
			Scanner scanner = new Scanner(new FileReader(filepath));
			
			String line;
			//DaterRecord record;
			
			scanner.nextLine();
			
			while (scanner.hasNextLine()){
				line = scanner.nextLine();
				line = line.replace(", ", " - ");
				String[] results = line.split(",");
				
				String id = (results[0]);
				String firstName = (results[1]);
				String familyName = (results[2]);
				String gender = (results[4]);
				String eMail = (results[3]);
				String race = (results[5]);
				String company = (results[6]); 
				String city = (results[7]);
				String country = (results[8]);
				String smokes = (results[9]);
				String hasPets = (results[10]);
				String wantsKids = (results[11]);
				String hasKids = (results[12]);
				String jobTitle = (results[13]);
				String favColour = (results[14]);
				String age = (results[15]);
				
				
				record = new DaterRecord(id, firstName, familyName, gender, eMail, race, company, city, 
						 country, smokes, hasPets, wantsKids, hasKids, jobTitle, favColour, age);
				
				records.add(record);			
		}
		
		scanner.close();
		
	} catch (Exception e) {
		System.out.println("Error: " + e.getMessage() );
	}
	}
}


