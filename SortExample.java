package sort.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class SortExample {

	public static void main(String[] args) {
		ArrayList <Emp> emp=new ArrayList<>();
		/*
		 * marks.add(12); marks.add(34); marks.add(6); marks.add(40); marks.add(10);
		 * System.out.println(marks); Collections.sort(marks);
		 * System.out.println(marks);
		 * 
		 */
		
		emp.add(new Emp("Jayshri","12345",13));
		emp.add(new Emp("Riyansh","54321",10));
		emp.add(new Emp("Ram","90876",5));
		emp.add(new Emp("Dipali","12456",40));
		emp.add(new Emp("Kanha","76543",6));
		System.out.println(emp);
		//comparator
		Collections.sort(emp,new IdComparator());
		//Comparable
		
		System.out.println(emp);
		//comparator
		Collections.sort(emp,new NameComapartor());
		System.out.println(emp);
		
		

		
	}

}
