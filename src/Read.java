/*Read Beolvas egy egész számot a szabványos bemenetről és a verem tetejére teszi.
Tipp: a beolvasáshoz használjuk ugyanazt a Scanner objektumot, amivel a parancsokat is olvassuk!*/

import java.util.Scanner;

public class Read implements Command {
	public void execute(String[] cmd) {
		Scanner input = new Scanner(System.in);
		int szam = input.nextInt();
		Main.stack.push(szam);
		input.close();

	}

}
