package Constructor;

class TestSuper {

	String color = "white";

	public TestSuper(String color) {
		System.out.println(color);
	}
}

class Dog extends TestSuper {

	String color = "black";

	public Dog() {

		super("red");
		System.out.println("prints color of Dog class : " + color); // prints color of Dog class
	}
}

public class defaultConst {
	public static void main(String args[]) {
		Dog d = new Dog();
//		d.printColor();
	}
}
