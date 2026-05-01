package q02_advanced.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleReader {
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	// 17. 文字列の入力
	public String inputString() throws IOException {
		return reader.readLine();
	}

	// 18. 数値の入力
	public int inputNumber() throws IOException, NumberFormatException {
		String str = reader.readLine();
		return Integer.parseInt(str);
	}
}
