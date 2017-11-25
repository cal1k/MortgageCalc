
public class user {
		private String yourName;
		private String yourAddress;
		private String yourEmail;
		private String yourPhoneNumber;
		private String yourIncome;
		private String yourEmployer;
	
		public void setName(String name) {
			yourName = name;
			}
		public String getName() {
			return yourName;
			}
		
		public void setAddress(String address) {
			yourAddress = address;
			}
		public String getAddress() {
			return yourAddress;
			}
		
		public void setEmail(String email) {
			yourEmail = email;
			}
		public String getEmail() {
			return yourEmail;
			}
		
		public void setPhoneNumber(String phoneNumber) {
			yourPhoneNumber = phoneNumber;
			}
		public String getPhoneNumber() {
			return yourPhoneNumber;
			}
		
		public void setIncome(String income) {
			yourIncome = income;
			}
		public String getIncome() {
			return yourIncome;
			}
		
		public void setEmployer(String employer) {
			yourEmployer = employer;
			}
		public String getEmployer() {
			return yourEmployer;
			}
		
		public void finalInfo() {
			System.out.printf("Welcome %s at %s %s %s %s", getName(), getAddress(), getEmail(), getPhoneNumber(), getEmployer(), getIncome());
			}
}
