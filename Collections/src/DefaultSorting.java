import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DefaultSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(5);
		al.add(0);
		al.add(15);
		al.add(20);
		al.add(3);
		
	//By Default By Sort Function will Sort Integers in Asc order If we want sort in Desc order then we want use Comparator method Compare in this
		
		System.out.println("Before Sorting "+al);
		
		Collections.sort(al);
		
		System.out.println("After Sorting "+al);
		
		
		ArrayList<String>  al2 = new ArrayList<String>();
		
		al2.add("joy");
		al2.add("apple");
		al2.add("zebra");
		
		// By Default in Alphabetical Order if another order then use Comparator
		// If I give one letter small and other Capital Then Sort wont work in Alphabets either give small or Starting letter in Capital
		
		System.out.println("Before Sorting "+al2);
		
		Collections.sort(al2);
				
		System.out.println("After Sorting "+al2);
		
		

	}

}
