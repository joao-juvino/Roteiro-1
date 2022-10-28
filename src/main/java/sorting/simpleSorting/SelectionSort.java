package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * The selection sort algorithm chooses the smallest element from the array and
 * puts it in the first position. Then chooses the second smallest element and
 * stores it in the second position, and so on until the array is sorted.
 */
public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (array == null)
			return;
		if (array.length == 0)
			return;
		if (leftIndex >= rightIndex)
			return;

		for (int j = leftIndex; j < rightIndex; j++) {
			int menor = j;

			for (int i = j + 1; i <= rightIndex; i++) {
				if (array[menor].compareTo(array[i]) > 0) {
					menor = i;
				}
			}

			Util.swap(array, menor, j);
		}
	}
}
