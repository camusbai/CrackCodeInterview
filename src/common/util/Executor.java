package common.util;

public class Executor {

	public static void main(String[] args) {
		//Sorting algorithm test
		int[] array = new int[]{9,3,5,1,2,3,8,2,5,0,-2,-6,7};
		//MergeSort
		int[] helper = new int[array.length];
		SortingAlgorithm.mergeSort(0, array.length-1, array, helper);
		for(int i:array){
			System.out.print(i+",");
		}

	}

}
