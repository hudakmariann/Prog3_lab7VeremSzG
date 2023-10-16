//Pop Leveszi a verem tetejéről a legfelső elemet.

public class Pop implements Command {
	public void execute(String[] cmd) { //nem kene visszaadnia amit levett? de a Coomand execute-ja void. Akkor hogyan?
		Main.stack.pop();
	}

}
