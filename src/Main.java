
public class Main {

	public static void main(String[] args) {
		
		DaterData daterData = new DaterData();
		daterData.loadDataFromFile("/Users/chrishammond/Documents/Eclipse/Workspace/CapitaJava1/src/DaterData34.csv" );
		
		System.out.println("Number of records in database: " + daterData.getNumberOfRecords());
		try{
		System.out.println(daterData.getRecordNumber(randomNo()));
		}
		catch(Exception e){
			System.out.println("Something went wrong... " + e);
			
			if ((daterData.getNumberOfRecords()) == 0){
				System.out.println("DB empty or not found");
			}
		}
	}
	
	public static int randomNo(){ 
	int random = (int)(Math.random()*1000);
	System.out.println("Randomly selected record number: " + random);
	System.out.println();
	return random;
	}

}