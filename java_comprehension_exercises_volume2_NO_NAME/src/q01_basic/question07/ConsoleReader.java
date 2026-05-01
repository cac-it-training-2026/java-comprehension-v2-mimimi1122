package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleReader {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public int inputNumber() throws IOException, NumberFormatException {
		int number = Integer.parseInt(reader.readLine());
		return number;
	}
}
