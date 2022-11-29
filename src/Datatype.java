public class Datatype {

	public void data(String name, long english, long tamil, long socialscience, long computerscience) {
		long sum = english+tamil+socialscience+computerscience;
		String s= "Name of the student  : " + name;
		String n= "Total marks :" + sum ;
		String o = " Average Marks :" + sum/4;
		
		System.out.println(s+n+o);
	}
	
	public static void main(String[] args) {
	 Datatype result = new Datatype();
		 result.data(" Mohammed Sadiq  ", 100, 100, 100, 100);
		 result.data(" Shujath hussain  ", 99, 98, 99, 99);
		 result.data(" RAFI  ", 88, 91, 81, 94);
		 result.data(" Murugan   ", 92, 99, 93, 95);
		
	}
}
