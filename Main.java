package Maps_Hashes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		Map myMap = new HashMap();
		// unordered map with unique keys
		// lets add values to myMap
		myMap.put("user1", 1);
		myMap.put("user2", "dog");
		myMap.put(2, "user3");
		System.out.println(myMap);
		
		// if we want the value associated with "user1"
		System.out.println(myMap.get("user1"));
		// maps are fast because they dont keep track of the order which information is added
		// but most of the time order matters
		Map mytreeMap = new TreeMap();
		mytreeMap.put("user1", 1);
		mytreeMap.put("user2", "dog");
		// in order to order all keys have to be in the same data type in this case strings 
		//mytreeMap.put(2, "user3") this entry would cause an error because we can't order strings and integer
		System.out.println(mytreeMap);
		// or can we?
		Map mylinkedMap = new LinkedHashMap();
		// this LinkedHashMap preserves the order in which we add values to mylinkedMap
		mylinkedMap.put("user1", 1);
		mylinkedMap.put("user2", "dog");
		mylinkedMap.put(2, "user3");
		
		System.out.println(mylinkedMap);
		
		// check if a specific value exists in mylinkedMap
		System.out.println(mylinkedMap.containsValue("dog"));
		
		// check if a specific key exists in mylinkedMap
		System.out.println(mylinkedMap.containsKey(2));
		
		// lets se what values do we have in mylinkedMap
		System.out.println(mylinkedMap.values());
		
		// lets have some fun now. We will have an array of strings and we want to create a map that takes each string as a key
		// and how many times it appears in the array as value
		
		// create an array of strings
		String[] myArray = new String[20];
		myArray[0] = "z";
		myArray[1] = "c";
		myArray[2] = "x";
		myArray[3] = "b";
		myArray[4] = "b";
		myArray[5] = "q";
		myArray[6] = "e";
		myArray[7] = "r";
		myArray[8] = "s";
		myArray[9] = "d";
		myArray[10] = "p";
		myArray[11] = "e";
		myArray[12] = "g";
		myArray[13] = "e";
		myArray[14] = "f";
		myArray[15] = "b";
		myArray[16] = "p";
		myArray[17] = "r";
		myArray[18] = "r";
		myArray[19] = "s";
		
		
		// first lets start looking at what happens when we try to count a specific element in myArray
		
		int count = 0;
		String letter = "s";
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == letter) {
				count++;
			}
		}
		System.out.println(count);
		
		// we know we can count how many times a specific letter appears in myArray
		// now lets count all of them at once
		
		// now lets define a map
		
		Map myarrayMap = new HashMap();
		
		// lets loop through the array: at each iteration each word is compared with all others
		for (int i = 0; i < myArray.length; i++) {
			String s = myArray[i];
			int strCount = 0;
			for (int j = 0; j < myArray.length; j++){
				if (s == myArray[j]) {
					strCount++;
					myarrayMap.put(myArray[i],strCount);
				}
			}
		}
		System.out.println("two loops " + myarrayMap);	
		
		// there's another way, more direct way, because looping once is more efficient than looping twice
		// and hopefully the result is the same
		
		// lets create a new map
		Map myarrayMap2 = new HashMap();
		
		// loop through myArray
		for (String w:myArray) {
			if (myarrayMap2.containsKey(w)) { // if the map has key
				int oc = (int) myarrayMap2.get(w); // check the count value
				myarrayMap2.put(w, oc+1); // add it one
				}
			else {
				myarrayMap2.put(w, 1); // else add that key to the map and give it value 1
				}
		}
		System.out.println("one loop " + myarrayMap2);
		
		// what if we dont have an array of letters/words but i have a piece of text and i want to do a mapping of the letters?
		
		String text = "I'm learning JAVA to try and be more attractive for any recruiter that sees my github profile. Being unemployed"
				+ "doesn't mean playing the Waiting Game indefinitely until being hired by someone with a giving the benefit of doubt ability"
				+ "as I read somewhere on Linkedin if you hire the wrong person both learn something thats what the experimental period is for";
		
		// lets create the map
		
		Map mytextMap = new HashMap();
		
		// lets do the mapping of the letters that appear in this piece of text
		// the text is in a string form, so we will use a method to convert String to array
		for (char c:text.toCharArray()) {
			if (c !=' ') { // we aren't interested on knowing how many blank spaces there are
				if (mytextMap.containsKey(c)){
					int number = (int) mytextMap.get(c);
					mytextMap.put(c, number+1);
				}
				else {
				mytextMap.put(c, 1);
				}
			}
		}
		System.out.println(mytextMap);
		// notice that a distinction between lower case and upper case characters occurs
		// but we can go around this easily by turning all the text to lower case or upper case
		
		
		
		
	}
}
