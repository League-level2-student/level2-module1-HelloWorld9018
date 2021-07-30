package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList <String> myStrings = new ArrayList<String>();
		//2. Add five Strings to your list
		myStrings.add("zero");
		myStrings.add("one");
		myStrings.add("two");
		myStrings.add("three");
		myStrings.add("four");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i<myStrings.size(); i++) {
			System.out.println(myStrings.get(i));
		}
		
		System.out.println("");
		
		//4. Print all the Strings using a for-each loop
		for(String s: myStrings) {
			System.out.println(s);
		}
		
		System.out.println("");
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i<myStrings.size(); i++) {
			if(i%2 == 0 && i!= 0) {
				System.out.println(myStrings.get(i));
			}
		}
		System.out.println("");
		//6. Print all the Strings in reverse order.
		for(int i = myStrings.size(); i>0; i--) {
			System.out.println(myStrings.get(i-1));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println("");
		for(int i = 0; i<myStrings.size(); i++) {
			if(myStrings.get(i).contains("e")) {
				System.out.println(myStrings.get(i));
			}
		}
		
	}
}
