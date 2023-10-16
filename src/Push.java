
public class Push implements Command{
	public void execute(String[] cmd) {
		 try {
	            int number = Integer.parseInt(cmd[1]);
	            Main.stack.push(number);            
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid integer input");
	        }
		
		
	}

}
