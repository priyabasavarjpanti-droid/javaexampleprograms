/*
 1. Write a Java program to iterate through all elements in a linked list starting at
the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj =listobj.listIterator(1))
 */
package myapp6;
import java.util.*;
public class s6 {
	 	public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<String> ls = new ArrayList<>();
			ls.add("Orange");
			ls.add("green");
			ls.add("pink");
			ls.add("red");
			ls.add("Blue");
//			int n=3;
			String Str="green";
			System.out.println(ls);
			System.out.println("Removing the nth Element:"+ls.remove(Str));
			System.out.println(ls);
		}
}
