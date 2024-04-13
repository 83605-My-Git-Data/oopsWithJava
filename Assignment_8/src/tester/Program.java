package tester;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.sunbeam.comparator.Student;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Student[] stdArr = new Student[6];
		
		stdArr[0] = new Student(4,"Digvijay","Vita",69.69);
		stdArr[1] = new Student(2,"Harshal","Nagpur",90.12);
		stdArr[2] = new Student(5,"Pratiksha","Wardha",96.22);
		stdArr[3] = new Student(1,"Rushikesh","Nashik",100.00);
		stdArr[4] = new Student(3,"Aditya","Ahmednagar",77.77);
		stdArr[5] = new Student(6,"Utkarsh","Prayagraj",88.34);
		
		int choice;
		
		do {
			System.out.println("Welcome");
			System.out.println("Press 0 : To exit");
			System.out.println("Press 1 : To Sort City(asc)");
			System.out.println("Press 2 : To Sort Marks(desc)");
			System.out.println("Press 3 : To Sort Name(asc)");
			
			choice  = sc.nextInt();
			
			switch (choice) {
			case 0:
			{
				System.out.println("Done");
				
			}
			
				
				break;
				
			case 1:
			{
				Comparator<Student> studentComparator = new ComparatorClassForStudent();
				
				Arrays.sort(stdArr,studentComparator);
				
				
				for(Student i :stdArr) {
					System.out.println(i);
				}
			}
			
				
				break;
				
			case 2:
			{ 
				class StudentMarks implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						int val = Double.compare(o2.getMarks(), o1.getMarks());
						return val;
					}
					
				}
				
				Comparator<Student> std = new StudentMarks();
				
				Arrays.sort(stdArr,std);
				

				for(Student i :stdArr) {
					System.out.println(i);
				}
				
				
			}
			
				
				break;

			case 3:
			{
				class StudentName implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						int val = o1.getName().compareTo(o2.getName());
						return val;
					}
					
				}
				
				Comparator<Student> std = new StudentName();
				
				Arrays.sort(stdArr,std);
				
				for(Student i :stdArr) {
					System.out.println(i);
				}
				
				
			}
			
				
				break;



			default:
				break;
			}
			
		} while(choice != 0);
	}
}
