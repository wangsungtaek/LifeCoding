package chapter1;

public class AuthApp3test {

	public static void main(String[] args) {
		String[][] users = {
				{"eging", "1111"},
				{"king", "2222"},
				{"wang", "3333"}
		};
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean checkId = false;
		boolean checkPass = false;
		
		for(int i=0; i<users.length; i++) {
			String[] current = users[i];
			if(current[0].equals(inputId)) {
				checkId = true;
				if(current[1].equals(inputPass)) {
					checkPass = true;
					break;
				} 
			} 
		}
		
		System.out.println("Hi.");
		if(checkId) {
			if(checkPass) {
				System.out.println("Master");
			} else {
				System.out.println("Password none");
			}
		} else {
			System.out.println("ID none");
		}
		
	}

}
