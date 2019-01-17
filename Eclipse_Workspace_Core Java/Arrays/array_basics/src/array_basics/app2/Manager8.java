package array_basics.app2;

import java.util.Arrays;
import java.util.Comparator;

class Person{
	String name;
	int age;
	double weight;
	
	Person(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nName: "+name+", Age: "+age+", Weight: "+weight;
	}
	
	static class SortBasedOnName implements Comparator{
		
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			Person p1 = (Person)o1;
			Person p2 = (Person)o2;
			return p1.name.compareTo(p2.name);
		}
	}
	
	static class SortBasedOnAge implements Comparator{
		
		@Override
		public int compare(Object o1, Object o2) {
			Person p1 = (Person)o1;
			Person p2 = (Person)o2;
			
			return p1.age - p2.age;
		}
	}
	
	static class SortBasedOnWeight implements Comparator{
		@Override
		public int compare(Object o1, Object o2) {
			Person p1 = (Person)o1;
			Person p2 = (Person)o2;
			
			return (int) (p1.weight - p2.weight);
		}
	}
}

public class Manager8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] pObj = {new Person("Mahantesh", 29, 78),
						 new Person("Sagar", 20, 90),
						 new Person("Micheal", 60, 40)};
		
		System.out.println(Arrays.toString(pObj));
		Arrays.sort(pObj, new Person.SortBasedOnName());
		System.out.println(Arrays.toString(pObj));
		
		System.out.println("--------------------------");
		
		Arrays.sort(pObj, new Person.SortBasedOnAge());
		System.out.println(Arrays.toString(pObj));
		
		System.out.println("--------------------------");
		
		Arrays.sort(pObj, new Person.SortBasedOnWeight());
		System.out.println(Arrays.toString(pObj));
		
		System.out.println("--------------------------");
		
	}

}
