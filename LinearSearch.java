package Algorithms;

public class LinearSearch {
	
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}
	
	public static void main (String[] args) {
		int[] list = {3, 10, 7, 6, 2, -3};
		System.out.println(linearSearch(list, 2));
	}
		

}
