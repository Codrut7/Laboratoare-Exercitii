package Task.Container;

import Task.AbstractTask;
import javafx.concurrent.Task;

import java.util.ArrayList;

/**
 * Created by cordu on 10/11/2018.
 */
public abstract class SuperContainer implements Container {

    protected ArrayList<AbstractTask> tasks;

    public SuperContainer(){
        tasks = new ArrayList<>();
    }

    @Override
    public int size() {
        return tasks.size();
    }

    @Override
    public boolean isEmpty() {
        return tasks.isEmpty();
    }

}
