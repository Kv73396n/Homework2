
public class Homwork2b 
{

	public static int[] merge(int[] a, int[] b)
	{

		int astart = 0;
		int bstart = 0;
		int cstart = 0;

		int aend = a.length - 1;
		int bend = b.length - 1;

		int[] c = new int[a.length + b.length];

	}


	private void mergeSort(int[] array, int a, int b) 
	{

		if (a < b) {

			//split the array into 2
			int center = (a + b) / 2;

			//sort the left and right array
			mergeSort(array, a, center);
			mergeSort(array, center + 1, b);

			//merge the result
			merge(array, a, center + 1, b);

		}
	}
//doesn't compile