
public class Assignment1_Que8 {
	public static void bubbleSort(int number[]) {
		 
		int n = number.length;
 
		for (int i = 0; i < n - 1; i++) {
 
			for (int j = 0; j < n - i - 1; j++) {
				if (number[j] > number[j + 1]) {
					int temp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = temp;
				}
			}
		}
 
	}
 
	public static void main(String[] args) {
		int[] number = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 84, 47 };
 
		System.out.println("Array before sorting");
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i] + " ");
 
		}
		System.out.println();
 
		bubbleSort(number);
		System.out.println("Array aafter bubble sort");
		for (int i = 0; i < number.length; i++)
			System.out.println(number[i] + " ");
 
	}


}
