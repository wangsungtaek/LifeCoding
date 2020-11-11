package chapter1;

public class AuthApp {

	public static void main(String[] args) {

		String id = "wang";
		String pass = "1111";
		String inputId = args[0];
		String inputPass = args[1];
		
		System.out.println("Hi.");
		
		//if(id == inputId)
		if(inputId.equals(id) && inputPass.equals(pass)) {
			System.out.println("Master");
		} else {
			System.out.println("Who are you ?");
		}
				
	}

}
