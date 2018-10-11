package Task.SortingTask;

import Task.AbstractTask;

/**
 * This task sorts an array .
 * Created by cordu on 10/11/2018.
 */
public class SortingTask extends AbstractTask {
    private AbstractSorter abstractSorter;
    private int[] vector;
    private String strategy;

    public SortingTask(String taskId, String descriere, String strategy,int vector[]) {
        super(taskId, descriere);
        this.vector = vector;
        if(strategy.equalsIgnoreCase("BubbleSort")){
            this.abstractSorter = new BubbleSort(vector);
        }else{
            this.abstractSorter = new InsertionSort(vector);
        }
    }

    public int[] getVector() {
        return vector;
    }

    @Override
    public void execute() {
        abstractSorter.sort();
    }
}
