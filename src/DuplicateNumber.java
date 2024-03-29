/*
	Mre64
	6/12/14
	
	�The Internet is a great way to get on the net.�
		- Bob Dole, Republican presidential candidate 
*/
import java.util.ArrayList;
import java.util.LinkedList;

public class DuplicateNumber {
	public static ArrayList<Integer> holdValues = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		holdValues.add(1);
		holdValues.add(2);
		holdValues.add(3);
		holdValues.add(4);
		holdValues.add(5);
		holdValues.add(6);
		holdValues.add(2);
		holdValues.add(8);
		holdValues.add(2);
		holdValues.add(10);
		
		Sort(holdValues);

	}
	static void Sort(ArrayList<Integer> input){
		// create a copy of the ArrayList with a LinkedList
		LinkedList<Integer> copy = new LinkedList<Integer>();
		// fill copy with origional contents
		for(int i : holdValues){
			copy.add(i);
		}
		/*
		   we will be checking if copies exist by copying 
		   the first element of the copy LinkedList, erasing 
		   the first element, and checking the list against that.
		*/
		//ensure List is not empty while checking
		while(!copy.isEmpty()){
			//copy value of first element
			int store = copy.get(0);
			//remove first element
			copy.removeFirst();
			//check against store
			if(copy.contains(store))
				System.out.println(store);
		}
	}
}
