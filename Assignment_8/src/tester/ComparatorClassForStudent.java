package tester;

import java.util.Comparator;

import com.sunbeam.comparator.Student;

public class ComparatorClassForStudent implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int value  =  o1.getCity().compareTo(o2.getCity());
		
		return value;
	}
	
	
	
	

}
