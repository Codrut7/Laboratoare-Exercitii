package Task.SortingTask;

/**
 * Created by cordu on 10/11/2018.
 */
public class BubbleSort extends AbstractSorter {

    public BubbleSort(int[] vector) {
        super(vector);
    }

    /**
     * Bubblesort implementation
     */
    @Override
    void sort() {
        int[] array = super.getVector();
        for(int i = 0 ; i < array.length - 1  ; i++){
            if(array[i] > array[i+1]){
                int temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
            }
        }
    }
}
