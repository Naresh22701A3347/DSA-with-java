package javaprojects;

	public class ConstantTimeEx {
		public static void printFirstElement(int [] arr) {
			if(arr.length>0) {
				System.out.println("First element is:"+arr[0]);
			}else {
				System.out.println("Array is empty");
			}
		}
		public static void main(String[] args) {
			int[] nums= {10,20,30,400,3502,29,3,50,1,2,3,4,5,5,2,23,1,112,1000,123456};
			printFirstElement(nums);
		}

	}

