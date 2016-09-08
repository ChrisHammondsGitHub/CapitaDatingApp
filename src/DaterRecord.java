
public class DaterRecord {
	
	private String firstName, familyName, gender, 
				   eMail, race, company, city, 
				   country, jobTitle, favColour, 
				   smokes, hasPets, hasKids, wantsKids, age; 
	
	

	public DaterRecord(String firstName, String familyName, String gender, String eMail,
					   String race, String company, String city, String country, String smokes,  
					   String hasPets, String wantsKids, String hasKids, String jobTitle, String favColour, String age) {
		
		this.firstName = firstName;
		this.familyName = familyName;
		this.gender = gender;
		this.eMail = eMail;
		this.race = race;
		this.company = company;
		this.city = city;
		this.country = country;
		this.smokes = smokes;
		this.hasPets = hasPets;
		this.wantsKids = wantsKids;
		this.hasKids = hasKids;
		this.jobTitle = jobTitle;
		this.favColour = favColour;
		this.age = age;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getFavColour() {
		return favColour;
	}

	public void setFavColour(String favColour) {
		this.favColour = favColour;
	}
	
	public String getSmokes() {
		return smokes;
	}

	public void setSmokes(String smokes) {
		this.smokes = smokes;
	}

	public String getHasPets() {
		return hasPets;
	}

	public void setHasPets(String hasPets) {
		this.hasPets = hasPets;
	}

	public String getHasKids() {
		return hasKids;
	}

	public void setHasKids(String hasKids) {
		this.hasKids = hasKids;
	}

	public String getWantsKids() {
		return wantsKids;
	}

	public void setWantsKids(String wantsKids) {
		this.wantsKids = wantsKids;
	}
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String toString(){
		return firstName + " " + familyName + " is a " + age + " year old " + race + " " + gender + " living in " + city + ", " + country + ".\n" + 
			   firstName + " works for " + company + " as a " + jobTitle + ".\n\n" +
			   
			   firstName + "'s favourite colour is " + favColour + ".\n" +
			   firstName + " smokes: " + smokes + "\n"  +
			   firstName + " likes/has pets: " + hasPets + "\n" +
			   firstName + " has kids: " + hasKids + "\n" +
			   firstName + " wants (more) kids: " + wantsKids + "\n\n" +
			   
			   firstName + "'s email is "+ eMail;
	}
	

	
}
