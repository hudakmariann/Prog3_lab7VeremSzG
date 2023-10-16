/*A verem tetején levő 2 számot leveszi a veremről és az összegüket teszi a
verem tetejére.
Pl. ha a verem tartalma (2 az utoljára betett érték): [4;3;2], akkor a
művelet után ez lesz: [4;5]*/

public class Add  implements Command{
	public void execute(String[]cmd) {
		int op1 = Main.stack.pop();
		int op2 = Main.stack.pop();
		int res = op1 + op2;
		Main.stack.push(res);
	}

}
