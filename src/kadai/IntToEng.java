package kadai;

import java.util.Scanner;

public class IntToEng {
	// メインメソッド
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(translateEng(input));
	}
	
	// 数値を英訳する変換するメソッド
	static String translateEng(int n) {
		String a = "";
		String[] suuji = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
				"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen"};
		if(n < 20) {
			a = suuji[n]; // 0から19まで
		} else {
			String[] suuji2 = {"twenty", "thirty", "forty", "fifty", "sixty","seventy", "eighty", "ninety"};
			int b = n / 10; // 十の位	
			int c = n - b * 10;
			a = suuji2[b-2];
			if (c != 0) a = a + " " + suuji[c];
		}
		return a;
	}
}
