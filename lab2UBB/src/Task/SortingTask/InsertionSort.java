package Task.SortingTask;
/**
 * QuickSort
 * Created by cordu on 10/11/2018.
 */
public class InsertionSort extends AbstractSorter{

    public InsertionSort(int[] vector) {
        super(vector);
    }

    @Override
    void sort() {
        int[] arr = super.getVector();
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}
