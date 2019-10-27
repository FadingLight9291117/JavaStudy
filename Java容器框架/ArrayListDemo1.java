import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * JavaTest
 */
public class ArrayListDemo1
{
	public static void main(String[] args)
	{

		int[] a = { 5, 3, 23, 65, 7, 89 };
		ArrayList<Integer> list = new ArrayList<Integer>() 
		{{
			 for (int var : a) 
			 {
				 add(var);
			 }
		 }};
		Collections.sort(list, (o, t) -> t - o);
		list.forEach(System.out::println);
	}
}
