package Task.TaskRunner;

import Task.AbstractTask;
import Task.Container.*;

import java.awt.*;
import java.awt.Container;
import Task.*;

/**
 * Created by cordu on 10/11/2018.
 */
public class StrategyTaskRunner implements TaskRunner {
    Task.Container.Container container;

    public StrategyTaskRunner(String strategy){
        TaskContainerFactory factory = TaskContainerFactory.getInstance();
        container = factory.createContainer(strategy);
    }
    @Override
    public void executeOneTask() {
        AbstractTask task = container.remove();
        task.execute();
    }

    @Override
    public void executeAll() {
        while(container.size()>0){
            this.executeOneTask();
        }
    }

    @Override
    public void addTask(AbstractTask t) {
        container.add(t);
    }

    @Override
    public boolean hasTask() {
        if (container.size()==0){
            return false;
        }
        return true;
    }
}
