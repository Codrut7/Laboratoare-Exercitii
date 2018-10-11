package Task.SortingTask;

/**
 * Abstract sorter has an abstract sort method .
 * Created by cordu on 10/11/2018.
 */
public abstract class AbstractSorter {
    private int[] vector;

    /**
     * When we instantiate a sublass the super() initiates the vector.
     */
    public AbstractSorter(int[] vector){
        this.vector = vector;
    }

    public int[] getVector() {
        return vector;
    }

    abstract void sort();
}
