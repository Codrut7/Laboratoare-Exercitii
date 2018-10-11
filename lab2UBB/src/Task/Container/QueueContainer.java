package Task.Container;

import Task.AbstractTask;

import java.util.ArrayList;

/**
 * Created by cordu on 10/11/2018.
 */
public class QueueContainer extends SuperContainer {
    @Override
    public AbstractTask remove() {
        ArrayList<AbstractTask> list = super.tasks;
        return list.remove(0);
    }

    @Override
    public void add(AbstractTask task) {
        ArrayList<AbstractTask> list = super.tasks;
        list.add(task);
    }
}
