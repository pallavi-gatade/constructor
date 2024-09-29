package Constructor;

class Super {
	Super() {
		System.out.println("line number 5");
	}

	Super(String a) {
		this();
		System.out.println("line number 9");
	}
}

public class SuperKeywordTest extends Super {

	SuperKeywordTest() {

		super("Java");
		System.out.println("line number 18");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywordTest obj1 = new SuperKeywordTest();

	}
}
