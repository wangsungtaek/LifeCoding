package chapter1;

public class ArrayApp {

	public static void main(String[] args) {
		
		String[] users = new String[3];
		users[0] = "egoing";
		users[1] = "jin";
		users[2] = "wang";
		
		System.out.println(users[1]);
		System.out.println(users.length);
		
		int[] scores = {10, 100, 100};
		
		System.out.println(scores[1]);
		System.out.println(scores.length);
		
	}

}
