package common.util;

public class SortingAlgorithm {
	public static void mergeSort(int left, int right, int[] array, int[] helper){
		if(left<right){
			int mid = (left+right)/2;
			mergeSort(left, mid, array, helper);
			mergeSort(mid+1, right, array, helper);
			merge(left, mid, right, array, helper);
			
			for(int i=left;i<=right;++i){
				array[i]=helper[i];
			}
		}
		
	}
	
	private static void merge(int left, int mid, int right, int[] array, int[] helper){
		int lInd = left, rInd = mid+1, index = left;
		while(lInd<=mid&&rInd<=right){
			if(array[lInd]<array[rInd]){
				helper[index]=array[lInd++];				
			}
			else {
				helper[index]=array[rInd++];				
			}
			++index;
		}
		for(int i = lInd;i<=mid;++i){
			helper[index++]=array[i];
		}
		for(int i = rInd;i<=right;++i){
			helper[index++]=array[i];
		}
	}

}
