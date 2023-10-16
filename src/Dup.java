/*A verem tetején levő elemet megduplázza. Ha a verem tartalma az
alábbi (jobbra a később berakott): [3;2;1], akkor a parancs után a verem
tartalma ez lesz: [3;2;1;1]*/
public class Dup implements Command {
	public void execute(String[] cmd) {
		int number = Main.stack.getFirst();
		Main.stack.push(number);
		
	}

}
