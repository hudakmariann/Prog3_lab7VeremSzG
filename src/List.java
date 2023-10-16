/*List Kiírja a verem tartalmát a szabványos kimenetre. Ne feledjük, hogy a
verem a Main.stack változónévvel érhető el.*/

import java.util.Iterator;

public class List implements Command {
	public void execute(String[] cmd) {
		
		
		Iterator<Integer> stackelement = Main.stack.iterator();
        while(stackelement.hasNext()) {
            System.out.println(stackelement.next());
        }
		
		 
		
	}
	
	
	

}
