import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		String terminal = "";
		ParseTree p = new ParseTree();
		/*String[] satirArray3 = new String[3];
		String[] satirArray4 = new String[3];*/
		String[] terminals = new String[3];
		String[] input1;
		String[] input3;
		String[] input4 = null;
		String[][] non_terminals = {{"E+T","T"},{"F","T*F"},{"(E)","a"}};
		int i = 0;
		File file = new File("C:\\Users\\casper\\Desktop\\TheoryOfComputation\\CFG_1.txt");
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(file));
		String satir = reader.readLine();
		while (satir!=null) {
			String[] satirArray = satir.split(">");
			terminals[i] = satirArray[0];
			/*String[] satirArray2 = satirArray[1].split("|");
			satirArray3[i] = satirArray2[0];
			satirArray4[i] = satirArray2[1];*/
 			satir = reader.readLine();
			i++;
		}
		p.insertLeftCFG(terminals,non_terminals,terminal);
		p.insertRightCFG(terminals,non_terminals,terminal);
		
		System.out.print("ENTER STRING: ");
		Scanner inputString= new Scanner(System.in);
		String result = inputString.next();
		
		if(p.Search(result) == true) {
			System.out.println("ACCEPT");
		}
		else if(p.Search(result) == false && result.contains("+")) {
			input1 = result.split("\\+");
			if(!p.Search(input1[0])) {
				System.out.println("REJECT");
			}
			else
				System.out.println("ACCEPT");
		}
		else if(p.Search(result) == false && result.contains("//(") && result.contains("//)")) {
			input3 = result.split("//(");
			input4 = input3[1].split("//)");
			if(!p.Search(input4[0])) {
				System.out.println("REJECT");
			}
		}
		else if(result.contains("//(")){
			if(!result.contains("//)")) {
				System.out.println("REJECT");
			}
		}
		else if(result.contains("//)")){
			if(!result.contains("//(")) {
				System.out.println("REJECT");
			}
		}
		else if(!(result.contains("*") && result.contains("+"))) {
				System.out.println("REJECT");
		}
	}
}
