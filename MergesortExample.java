package javaprojects;

public class MergesortExample {
	void merge(int arr[], int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;i++)
			L[i] = arr[left + i];
		for(int j=0;j<n2;j++)
			R[j] = arr[mid+1+j];
		int i= 0,j= 0;
		int k=left;
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
	}
	void sort(int arr[],int left, int right) {
		if(left<right) {
			int mid = (right+left)/2;
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	static void printArray(int arr[]) {
		for(int num:arr) {
			System.out.println(num+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {15,18,25,35,6,12,5,3,8,7};
		System.out.println("original array:");
		printArray(arr);
		MergesortExample ms = new MergesortExample();
		ms.sort(arr,0,arr.length-1);
		System.out.println("Sorted Array");
		printArray(arr);
	}

}