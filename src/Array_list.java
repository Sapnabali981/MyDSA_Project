import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		/*
		 * Array are basically static in nature so once we are assigning the values in an array
		 * we cannot change them or increase the size as per the requirement
		 * so in order to overcome this problem we have a another feature in collection framework
		 * called as arrayList
		 */
		/*
		 * using arraylist we can change the size of an array or shrink the size as well as per the requirement
		 */
		ArrayList <Integer> list=new ArrayList<>(10);
		/*
		 * while creating arraylist object we need to pass the size of an arraylist as well
		 * here specified size is 10 so following 10 elements of an integer type can be stored inside an Arraylist
		 * to add a element in an array we will make use of add function
		 */
		list.add(12);
		list.add(12);
		list.add(14);
		list.add(14);
		System.out.println(list);
		/*
		 * in order to remove certain element from an array list we can do that as well
		 */
		list.remove(1);
		System.out.println(list);
		/*
		 * in order to check whether specified element is present in an given array or not
		 */
		//it returns boolean value
		System.out.println(list.contains(14));
		/*
		 * in order to set / update any index value of an arraylist we will make use of set function
		 */
		list.set(2,4);
		System.out.println(list);
	}
}
