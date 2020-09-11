package MiraFT;

public class UTS1 {
	public static void main(String[] args) {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#-";
		char aChar = s.charAt(12); //M
		char bChar = s.charAt(8); //I
		char cChar = s.charAt(17); //R
		char dChar = s.charAt(0); //A
		char eChar = s.charAt(s.length() - 1);
		char fChar = s.charAt(5); //F
		char gChar = s.charAt(20); //U
		char hChar = s.charAt(9); //J
		char iChar = s.charAt(19); //T
		char jChar = s.charAt(13); //N
		System.out.println("Nama \t : " + aChar + bChar + cChar + dChar + eChar + fChar + gChar + hChar + bChar + eChar + iChar + cChar + bChar + dChar + jChar + dChar);
	}
}
