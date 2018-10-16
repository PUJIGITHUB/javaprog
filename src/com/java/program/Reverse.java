package com.java.program;

public class Reverse {

	public static void main(String[] args) {
		String str = "He#llo@121#";
		char output[] = str.toCharArray();
		int index1 = str.length();

		for (int i = 0; i < str.length(); i++) {
			char value = str.charAt(i);
			if (output[i] == '@' || output[i] == '#') {
				continue;
			} else {
				index1 = index1 - 1;
			}
			while (output[index1] == '@' || output[index1] == '#') {
				index1 = index1 - 1;
			}
			output[index1] = value;
		}
		System.out.println(output);
	}
}
/*}

return new string(output);
	
}*/



