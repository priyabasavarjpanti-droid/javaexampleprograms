
/*
 5. Write a java program for getting different colors through ArrayList interface and delete
nth element from the ArrayList object by using remove by index
 */
package myapp5;
import java.util.*;
public class s5 {
 		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<String>	ls = new LinkedList<>();
			ls.add("Orange");
			ls.add("geen");
			ls.add("pink");
			ls.add("red");
			ls.add("Blue");
			Iterator iterator = ls.listIterator(2);
			while (iterator.hasNext()) {
			System.out.println(iterator.next());
			}
		}

}
