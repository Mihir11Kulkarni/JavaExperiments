import java .util.*;
public class CollectionSorting
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(23);
		al.add(45);
		al.add(53);
		al.add(12);
		al.add(65);
		al.add(68);
		al.add(88);
		al.add(42);
		System.out.println("list without sort           "+al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("list with reverce sort      "+al);
		Collections.sort(al);
		System.out.println("list after Ascending sort   "+al);
	}
}