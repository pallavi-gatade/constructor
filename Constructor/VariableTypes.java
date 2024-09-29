package Constructor;


public class VariableTypes {

	String instanceVariable = "Java";

	static String staticVariable = "Static Variable";

	void variables() {

		String localVariable = "Test1";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariableTypes variableTypes = new VariableTypes();
		variableTypes.instanceVariable = "instance java";
		System.out.println(variableTypes.instanceVariable);


	}

}
