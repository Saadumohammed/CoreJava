
public class polymethodoverloading {

 public void studentinfo(String NAME) {
	System.out.println("Student Name : " + NAME);
 }
 public void studentinfo(int id) {
	System.out.println("Student ID  : " + id);
}
 public void studentinfo(String DOB, int id) {
	System.out.println("Student DOB : " + DOB);
}
 public static void main(String[] args) {
	polymethodoverloading result = new polymethodoverloading();
	result.studentinfo("Mohammed Sadiq");
	result.studentinfo(1024);
	result.studentinfo("29/05/2022", 0);
}
}


