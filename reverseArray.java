import java.util.Arrays;
public class reverseArray {

	public static void main(String[] args) {
		
		int[] arr = {5,6,7,8,9,6};
		for (int i=0; i<arr.length /2; i++)
		{
			int t = arr[i];
			arr[i] = arr[arr.length - 1 -i];
			arr[arr.length - 1 - i] =  t;
		}
		
		System.out.println(" " + Arrays.toString(arr));

	}

}
