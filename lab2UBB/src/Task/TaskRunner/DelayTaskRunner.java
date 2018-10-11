package Task.TaskRunner;

import Task.AbstractTask;
import Task.Container.Container;

/**
 * Created by cordu on 10/11/2018.
 */
public class DelayTaskRunner extends AbstractTaskRunner {

    public DelayTaskRunner(TaskRunner taskRunner,String strategy){
        super(taskRunner,strategy);
    }
    @Override
    public void executeOneTask() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Container x = getContainer();
        AbstractTask task = x.remove();
        task.execute();
    }
}
