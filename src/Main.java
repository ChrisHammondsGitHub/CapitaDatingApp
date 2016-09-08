
public class Main {

	public static void main(String[] args) {
		
		DaterData daterData = new DaterData();
		daterData.loadDataFromFile("/Users/chrishammond/Documents/Eclipse/Workspace/CapitaJava1/src/DaterData3.csv" );
		
		System.out.println("Number of records in database: " + daterData.getNumberOfRecords());
		System.out.println(daterData.getRecordNumber(randomNo()));
		
	}
	
	public static int randomNo(){ 
	int random = (int)(Math.random()*1000);
	System.out.println("Randomly selected record number: " + random);
	System.out.println();
	return random;
	}

}