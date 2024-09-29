package Constructor;

class ParentClass {

	ParentClass() {
		this("Test", false);
		System.out.println("no-arg constructor of ParentClass");
	}

	ParentClass(String a, boolean b) {
		System.out.println(" 2 arg constructor of ParentClass");
	}

	ParentClass(String a, boolean b, long ll) {
		this();
		System.out.println(" 3 arg constructor of ParentClass");
	}
}

public class ThisAndSuperKeyword extends ParentClass {

	ThisAndSuperKeyword(int bbbb, String jjjj) {
		super("Test", false, 999999);
		System.out.println("2 arg constructor of ThisVsSuperTest1");
	}

	public static void main(String[] args) {
		// ParentClass pp = new ParentClass("Java", true, 999);
		ThisAndSuperKeyword tt = new ThisAndSuperKeyword();
		// 5 11 8 16
	}

	ThisAndSuperKeyword() {
		this(100, "Java");
		System.out.println("No arg constructor of ThisVsSuperTest1");
	}
}
