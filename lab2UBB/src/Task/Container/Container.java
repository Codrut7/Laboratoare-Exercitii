package Task.Container;

import Task.AbstractTask;

import java.util.ArrayList;

/**
 * Methods for the FIFO / LIFO data structures .
 * Created by cordu on 10/11/2018.
 */
public interface Container {
    AbstractTask remove();
    void add(AbstractTask task);
    int size();
    boolean isEmpty();
}
