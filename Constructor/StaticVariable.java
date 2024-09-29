package Constructor;

public class StaticVariable {

	String studentName = "";

	static String collegeName = "Abhinav College";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariable obj = new StaticVariable();

		obj.studentName = "Mayuri Patil";

		StaticVariable obj2 = new StaticVariable();

		obj2.studentName = "Dipak Yadav";

		System.out.println("Student name is : " + obj.studentName + " And " + "College Name : " + collegeName);

		System.out.println("Student name is : " + obj2.studentName + " And " + "College Name : " + collegeName);

	}

}
