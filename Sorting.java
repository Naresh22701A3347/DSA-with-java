package demo;

public class Sorting {

	public static void main(String[] args) {
		int[] numbers = {5,2,4,1,3,9,7,6,8};
		for(int i=0;i<numbers.length -1;i++) {
			for(int j=0;j<numbers.length-1;j++) {
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		System.out.println("sortedlist");
		for(int num : numbers) {
			System.out.println(num + " ");
		}

	}

}
