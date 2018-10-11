package Task.TaskRunner;

import Task.AbstractTask;
import Task.Container.Container;
import Task.Container.TaskContainerFactory;

/**
 * Created by cordu on 10/11/2018.
 */
public abstract class AbstractTaskRunner implements TaskRunner {
    private Container container;
    private TaskRunner taskRunner;

    public AbstractTaskRunner(TaskRunner taskRunner,String strategy){
        this.taskRunner = taskRunner;
        TaskContainerFactory factory = TaskContainerFactory.getInstance();
        container = factory.createContainer(strategy);
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

    public Container getContainer() {
        return container;
    }
}
