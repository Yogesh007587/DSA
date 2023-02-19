// Java program to solve fractional Knapsack Problem

// import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

// Greedy approach
class fractional_knapSack {
	
	// Function to get maximum value
	private static double getMaxValue(ItemValue[] arr,
									int capacity)
	{
		// Sorting items by value/weight ratio;
		Arrays.sort(arr, new Comparator<ItemValue>() {
			@Override
			public int compare(ItemValue item1,
							ItemValue item2)
			{
				double cpr1
					= new Double((double)item1.value / (double)item1.weight);
				double cpr2
					= new Double((double)item2.value / (double)item2.weight);

				if (cpr1 < cpr2)
					return 1;
				else
					return -1;
			}
		});

		double totalValue = 0d;

		for (ItemValue i : arr) {

			int curWt = (int)i.weight;
			int curVal = (int)i.value;

			if (capacity - curWt >= 0) {

				// this weight can be picked while
				capacity = capacity - curWt;
				totalValue += curVal;
			}
			else {

				// Item cant be picked whole
				double fraction
					= ((double)capacity / (double)curWt);
				totalValue += (curVal * fraction);
				capacity
					= (int)(capacity - (curWt * fraction));
				break;
			}
		}

		return totalValue;
	}

	// Item value class
	static class ItemValue {

		int value, weight;

		// Item value function
		public ItemValue(int val, int wt)
		{
			this.weight = wt;
			this.value = val;
		}
	}

	// Driver code
	public static void main(String[] args)
	{

		ItemValue[] arr = { new ItemValue(2, 4),
							new ItemValue(4, 6),
							new ItemValue(10, 8) };

		int capacity = 12;

		double maxValue = getMaxValue(arr, capacity);

		// Function call
		System.out.println(maxValue);
	}
}
