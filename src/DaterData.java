import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class DaterData {
	private ArrayList <DaterRecord> records;
	
	public DaterData() {
		records = new ArrayList<DaterRecord>();
	}

	public int getNumberOfRecords() {
		return records.size();
	}
	
	public DaterRecord getRecordNumber(int i){
		return records.get(i);		
	}
	
	
	public void loadDataFromFile(String filepath) {
		
		try{
			
			Scanner scanner = new Scanner(new FileReader(filepath));
			
			String line;
			DaterRecord record;
			
			scanner.nextLine();
			
			while (scanner.hasNextLine()){
				line = scanner.nextLine();
				String[] results = line.split(",");
				
				String firstName = (results[0]);
				String familyName = (results[1]);
				String gender = (results[2]);
				String eMail = (results[3]);
				String race = (results[4]);
				String company = (results[5]); 
				String city = (results[6]);
				String country = (results[7]);
				String smokes = (results[8]);
				String hasPets = (results[9]);
				String wantsKids = (results[10]);
				String hasKids = (results[11]);
				String jobTitle = (results[12]);
				String favColour = (results[13]);
				String age = (results[14]);
				
				
				record = new DaterRecord(firstName, familyName, gender, eMail, race, company, city, 
						 country, smokes, hasPets, wantsKids, hasKids, jobTitle, favColour, age);
				
				records.add(record);			
		}
		
		scanner.close();
		
	} catch (Exception e) {
		System.out.println("Error: " + e.getMessage() );
	}
	}
}


