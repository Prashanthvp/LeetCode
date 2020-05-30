package am;

import java.util.Stack;

public class RLString {	

	void validateString(String str) {

		Stack<Character> st = new Stack<Character>();		

		char[] arr = str.toCharArray();

		int count = 0;

		boolean flag = false;

		for (char a:arr) {			
			if (!st.isEmpty() && st.peek() == a)
				st.push(a);
			else if (st.isEmpty()) {
				st.push(a);
				flag = false;
			} else {
				st.pop();
				flag = true;
			}

			if (st.isEmpty() && flag)
				count++;
		}

		System.out.print(count++);
	}


	public static void main(String[] args) {

		RLString r = new RLString();

		String str = "RLLLLRRRLR";

		r.validateString(str);

	}

}
