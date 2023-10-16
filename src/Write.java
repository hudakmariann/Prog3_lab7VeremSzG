/*Write A verem tetején levő számot leveszi és kiírja a szabványos kimenetre*/

public class Write implements Command {
	public void execute(String[] cmd) {
		int number = Main.stack.pop();
		System.out.println(number);
	}

}
