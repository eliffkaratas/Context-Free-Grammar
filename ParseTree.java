import java.util.ArrayList;
public class ParseTree {
public static Node root;
public static ArrayList<String> array = new ArrayList<String>();

public ParseTree(){
ParseTree.root = null;
}

public void insertLeftCFG(String[] terminals,String[][] non_terminals,String terminal){
	System.out.println("-----------------");
	//int length = terminals.length;
	System.out.println("Left subtree");
	Node newNode = new Node(terminal);
		if(root==null){
			root = newNode;
			root.data = terminals[0];
			System.out.println("ROOT: " + root.data);
			array.add(root.data);
		}
	Node current = root;
	Node parent = null;
	if(current.child[0] == null) {
		current.child[0] = newNode;
		current.child[0].data = non_terminals[0][0];
		System.out.println(current.child[0].data);
		array.add(current.child[0].data);	
	}
	//String[] x = current.child[0].data.split("+");
	current = current.child[0];
	parent = current;

	/*for(int i = 0; i < length*2; i++) {
		
		parent.child[i] = newNode;
		for(int j = 0; j < terminals.length; j++) {	
			if(x[0] == terminals[j]) {
				parent.child[i].data = non_terminals[i][j] + "+" + x[1];
			}
			if(x[1] == terminals[j]) {
				parent.child[i].data =  x[0] + "+" + non_terminals[i][j];
			}
		}
	    
		System.out.println(parent.child[i].data);
		array.add(parent.child[i].data);
	}*/
	
	parent.child[0] = newNode;
	parent.child[0].data = terminals[0] + "+" + non_terminals[1][0];
	System.out.println(parent.child[0].data + " ");
	array.add(parent.child[0].data);
	
	parent.child[1] = newNode;
	parent.child[1].data = terminals[1] + "+" + non_terminals[0][1];
	System.out.println(parent.child[1].data + " ");
	array.add(parent.child[1].data);
					
	parent.child[2] = newNode;
	parent.child[2].data = terminals[0] + "+" + non_terminals[1][1];
	System.out.println(parent.child[2].data);
	array.add(parent.child[2].data);
				    
	parent.child[3] = newNode;
	parent.child[3].data = non_terminals[0][0] + "+" + non_terminals[0][1];
	System.out.println(parent.child[3].data);
	array.add(parent.child[3].data);
				
	current = current.child[0].child[0];
	parent = current;

    parent.child[0] = newNode;
	parent.child[0].data = non_terminals[0][0] + "+" + terminals[2];
	System.out.println(parent.child[0].data);
	array.add(parent.child[0].data);
					
	parent.child[1] = newNode;
	parent.child[1].data = terminals[0] + "+" + non_terminals[2][0];
	System.out.println(parent.child[1].data);
	array.add(parent.child[1].data);
					
	parent.child[2] = newNode;
	parent.child[2].data = terminals[0] + "+" + non_terminals[2][1];
	System.out.println(parent.child[2].data);
	array.add(parent.child[2].data);
					
	parent.child[3] = newNode;
	parent.child[3].data = non_terminals[0][1] + "+" + terminals[2];
	System.out.println(parent.child[3].data);
	array.add(parent.child[3].data);
				
	current = current.child[0].child[1];
	parent = current;
	
    parent.child[0] = newNode;
	parent.child[0].data = non_terminals[1][0] + "+" + terminals[1];
	System.out.println(parent.child[0].data);
	array.add(parent.child[0].data);
					
	parent.child[1] = newNode;
	parent.child[1].data = terminals[1] + "+" + non_terminals[1][0];
	System.out.println(parent.child[1].data);
	array.add(parent.child[1].data);
					
	parent.child[2] = newNode;
	parent.child[2].data = non_terminals[1][1] + "+" + terminals[1];
	System.out.println(parent.child[2].data);
	array.add(parent.child[2].data);
					
	parent.child[3] = newNode;
    parent.child[3].data = terminals[1] + "+" + non_terminals[1][1];
	System.out.println(parent.child[3].data);
	array.add(parent.child[3].data);
				
	current = current.child[0].child[2];
	parent = current;
	
	parent.child[0] = newNode;
	parent.child[0].data = non_terminals[0][0] + "+" + non_terminals[1][1];
	System.out.println(parent.child[0].data);
	array.add(parent.child[0].data);

	parent.child[1] = newNode;
	parent.child[1].data = non_terminals[0][1] + "+" + non_terminals[1][1];
	System.out.println(parent.child[1].data);
	array.add(parent.child[1].data);
					
	parent.child[2] = newNode;
	parent.child[2].data = terminals[0] + "+" + terminals[2] + "*" + terminals[2];
	System.out.println(parent.child[2].data);
	array.add(parent.child[2].data);
					
	parent.child[3] = newNode;
	parent.child[3].data = non_terminals[0][0] + "*" + terminals[2] + "*" + terminals[2];
	System.out.println(parent.child[3].data);
	array.add(parent.child[3].data);
					
	parent.child[4] = newNode;
	parent.child[4].data =  non_terminals[0][0] + "*" + non_terminals[2][0];
	System.out.println(parent.child[4].data);
	array.add(parent.child[4].data);
					
	parent.child[5] = newNode;
	parent.child[5].data = non_terminals[0][0] + "*" + non_terminals[2][1];
	System.out.println(parent.child[5].data);
	array.add(parent.child[5].data);
	
	current = current.child[0].child[3];
	parent = current;
    parent.child[0] = newNode;
	parent.child[0].data = non_terminals[0][0] + "+" + terminals[1] + "+" + terminals[1];
	System.out.println(parent.child[0].data);
	array.add(parent.child[0].data);
					
	parent.child[1] = newNode;
	parent.child[1].data = terminals[0] + "+" + terminals[2] + "+" + terminals[1];
	System.out.println(parent.child[1].data);
	array.add(parent.child[1].data);
					
	parent.child[2] = newNode;
	parent.child[2].data = terminals[0] + "+" + terminals[1] + "+" + terminals[2];
	System.out.println(parent.child[2].data);
	array.add(parent.child[2].data);
					
	parent.child[3] = newNode;
	parent.child[3].data = terminals[0] + "+" + non_terminals[1][1] + "+" + terminals[1];
	System.out.println(parent.child[3].data);
	array.add(parent.child[3].data);
					
	parent.child[4] = newNode;
	parent.child[4].data = non_terminals[0][0] + "+" + non_terminals[1][1];
	System.out.println(parent.child[4].data);
	array.add(parent.child[4].data);
					
	parent.child[5] = newNode;
	parent.child[5].data = terminals[1] + "+" + terminals[1] + "+" + terminals[1];
	System.out.println(parent.child[5].data);
	array.add(parent.child[5].data);
				
}

public void insertRightCFG(String[] terminals, String[][] non_terminals,String terminal){
	System.out.println("-----------------");
	System.out.println("Right subtree");
	Node newNode = new Node(terminal);
	root = newNode;
	root.data = terminals[0];
	System.out.println("ROOT: " + root.data);
	array.add(root.data);
	
	Node current = root;
	Node parent = null;
	if(current.child[1] == null) {
		current.child[1] = newNode;
		current.child[1].data = non_terminals[0][1];
		System.out.println(current.child[1].data);
		array.add(current.child[1].data);
	}
	current = current.child[1];
	parent = current;
	
	parent.child[0] = newNode;
	parent.child[0].data = terminals[2];
	System.out.println(parent.child[0].data);
	array.add(parent.child[0].data);
				    
	parent.child[1] = newNode;
	parent.child[1].data = non_terminals[1][1];
	System.out.println(parent.child[1].data);
	array.add(parent.child[1].data);
	
	current = current.child[1].child[0];
	parent = current;
	
	parent.child[0] = newNode;
	parent.child[0].data = non_terminals[2][0];
	System.out.println(parent.child[0].data);
	array.add(parent.child[0].data);
				    
	parent.child[1] = newNode;
	parent.child[1].data = non_terminals[2][1];
	System.out.println(parent.child[1].data);
	array.add(parent.child[1].data);
					
	current = current.child[0].child[1];
	parent = current;
	
	parent.child[0] = newNode; 
	parent.child[0].data = non_terminals[1][0] + "*" + terminals[2];
	System.out.println(parent.child[0].data);
	array.add(parent.child[0].data);
				    
	parent.child[1] = newNode;
	parent.child[1].data = non_terminals[1][1] + "*" + terminals[2];
	System.out.println(parent.child[1].data);
	array.add(parent.child[1].data);
					
	parent.child[2] = newNode;
	parent.child[2].data = terminals[1] + "*" + non_terminals[2][1];
	System.out.println(parent.child[2].data);
	array.add(parent.child[2].data);
					
	parent.child[3] = newNode;
	parent.child[3].data = terminals[1] + "*" + non_terminals[2][0];
	System.out.println(parent.child[3].data);
	array.add(parent.child[3].data);
	
	System.out.println("-----------------");
	System.out.println("     ");
	System.out.println(array.size() + " childs.");
}

public boolean Search(String a) {
	int x = array.size();
	boolean flag = false;
	for(int i=0; i<x; i++) {
		if((array.get(i).equals(a)))
			flag = true;
	}
	return flag;
}

public void Print() {
	int x = array.size();
	for(int i=0;i<x;i++) {
		System.out.println(array.get(i));
	}
}
}