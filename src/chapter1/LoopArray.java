package chapter1;

public class LoopArray {

	public static void main(String[] args) {
		
		String[] users = new String[3];
		users[0] = "eging";
		users[1] = "wang";
		users[2] = "king";
		
		for(int i=0; i<users.length; i++) {
			System.out.println("<li>"+users[i]+"</li>");
		}
	}

}
