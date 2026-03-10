package task_05;
public class InputProcessor {
	public static String asciiToBinary(String text) { // converts a string of Ascii characters into a binary string
		String binary = "";
		byte[] bytes = text.getBytes();
		for (int x = 0; x < bytes.length; x++) {
			String Char = Integer.toBinaryString(bytes[x]);
			while (Char.length() < 8) { // adds 0's until the binary character has 8 bits (1 byte)
				Char = "0" + Char;
			}
			binary += Char;
		}
		return binary;
	}
	public static String binaryToAscii(String text) { // converts a binary string into a string of Ascii characters
		String s = "";
		for (int x = 0; x < text.length() / 8; x++) {
			String binChar = text.substring(x * 8, x * 8 + 8); // splits the binary string into it's binary characters
			int binNum = Integer.parseInt(binChar, 2);
			s += (char)(binNum);
		}
		return s;
	}
	public static boolean isPalindrome(String text) { // tests to see if a string is a palindrome
		if (text.length()%2 == 1) { // removes the middle character if the string is of odd length
			text = text.substring(0, text.length() / 2) + text.substring(text.length() / 2 + 1);
		}
		String front = text.substring(0, text.length() / 2);
		String back = text.substring(text.length() / 2);
		String backReversed = "";
		for (int x = 0; x < back.length(); x++) {
			backReversed = back.charAt(x) + backReversed;
		}
		return front.equals(backReversed);
	}
}