/*

c) Készítsünk a főprogramban (a main metódus elején) egy inicializáló kódrészletet, ahol
a) létrehozunk egy HashMap<String, Command> tároló objektumot (map) a parancsok
tárolásához
b) létrehozunk minden osztályból egy példányt, pl.:
Command c = new Exit();
c) a példányokat hozzáadjuk az osztály kisbetűs nevével a HashMap-hez, pl.:
map.put("exit", c);
Vegyük észre, hogy a két fenti sort össze is vonhatjuk, pl.:
map.put("exit", new Exit());
d) A parancsfeldolgozó ciklusunk ne a megszokott if-else-if... listából álljon, hanem a fenti map-
et használja, valahogy így:
String line = sc.nextLine();
String[] cmd = line.split("˽"); // szóközt tartalmazó string
Command c = map.get(cmd[0]);
c.execute(cmd);
Vegyük észre, hogy a fenti megoldással kényelmesen, a parancsbeolvasó rutin módosítása nélkül
tudjuk új paranccsal bővíteni a rendszerünket. Ehhez csak az kell, hog */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	static ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

	public void push(Integer d) {
		stack.push(d);
	} // elhelyez egy Integer-t a verem tetején.

	public Integer pop() {
		Integer result = new Integer(stack.pop());
		return result;
	} // leveszi és visszaadja a verem tetején levő elemet

	public Integer peek() {
		Integer result = new Integer(stack.peek());
		return result;
	} // a helyén hagyja, de visszaadja a verem tetején levő elemet

	public Iterator<Integer> iterator() {
		return stack.iterator();
	}// : iterálást biztosít a verem elemein.

	public int size() {
		return stack.size();
	}// : visszaadja a veremben levő elemek számát

	public boolean isEmpty() {
		return stack.isEmpty();
	}// : megadja, hogy a verem üres-e

	public static void main(String[] args) {

		HashMap<String, Command> map = new HashMap<String, Command>();
		map.put("exit", new Exit());
		map.put("list", new List());
		map.put("pop", new Pop());
		map.put("push", new Push());
		map.put("read", new Read());
		map.put("write", new Write());
		map.put("dup", new Dup());
		map.put("add", new Add());

		try (Scanner sc = new Scanner(System.in)) {
			String line;
			while (true) {// (line = sc.nextLine() != null) {
				if (sc.nextLine() == null) {
					sc.close();
					break;
					}
				else {
					line = sc.nextLine();
					
					String[] cmd = line.split(" "); // szóközt tartalmazó string
					System.out.println("cmd[0] = " + cmd[0]);
					Command c = map.get(cmd[0]);
					c.execute(cmd);
				}
				
			}
		}

		catch (Exception e) {
		
			e.printStackTrace();
		}
		

	}
}
