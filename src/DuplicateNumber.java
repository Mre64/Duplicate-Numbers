import java.util.ArrayList;
import java.util.LinkedList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/*
	Mre64
	6/12/14
	
	«The Internet is a great way to get on the net.»
		- Bob Dole, Republican presidential candidate 
*/
public class DuplicateNumber {
	public static ArrayList<Integer> holdValues = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		holdValues.add(1);
		holdValues.add(2);
		holdValues.add(2);
		holdValues.add(4);
		holdValues.add(5);
		holdValues.add(6);
		holdValues.add(2);
	
		Sort(holdValues);

	}
	static void Sort(ArrayList<Integer> input){
		LinkedList<Integer> copy = new LinkedList<Integer>();
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		input = holdValues;
		
		for(int i : holdValues){
			copy.add(i);
		}
		//System.out.println(copy.toString());
		while(!copy.isEmpty()){
			System.out.println(copy.toString());
			int store = copy.get(0);
			copy.removeFirst();
			for(int j = 0; j < 7; j++){
				//int store = holdValues.get(j);
				//System.out.print(holdValues.get(j));
				

//				System.out.println("remov " + copy.toString());
//				System.out.println("remov " + store);
				if(copy.contains(store)){
					System.out.println(store);

				}
				//copy.remove(j);
			}
			
			//copy.add(store);
			//+System.out.println("after " + copy.toString());
//			System.out.println("hold value: " + holdValues.get(j));
//			System.out.println("store value: " + store);
//			System.out.println("copy value: " + copy.get(j));
		}
	}

}
