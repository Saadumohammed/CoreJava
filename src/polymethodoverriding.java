
public class polymethodoverriding {

	public void Studentdetails(String NAME) {
		System.out.println("Student Name : " + NAME);
	}
	public void Studentdetails(long address) {
		System.out.println("Address : " + address);
	}
	public void Studentdetails(int pincode) {
		System.out.println("Pincode Number : " + pincode);
	}
	public void Studentdetails(int age,boolean a) {
		System.out.println("AGE : " + age);
	}
	public void Studentdetails(String gender, int m) {
		System.out.println("Gender  : " + gender);
		
	}
	public static void main(String[] args) {
		polymethodoverriding r = new polymethodoverriding();
		r.Studentdetails("Mohammed Sadiq");
		r.Studentdetails(9,true);
		r.Studentdetails("M", 0);
		r.Studentdetails("no 21/22, Muthamizh Nagar, Kodungaiyur");
		r.Studentdetails(600106);
	}
}
