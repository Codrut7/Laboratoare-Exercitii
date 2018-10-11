package Task.TaskRunner;

import Task.AbstractTask;
import Task.Container.Container;

import java.time.LocalTime;


/**
 * Created by cordu on 10/11/2018.
 */
public class PrinterTaskRunner extends AbstractTaskRunner {

    public PrinterTaskRunner(TaskRunner taskRunner,String strategy){
        super(taskRunner,strategy);
    }

    @Override
    public void executeOneTask() {
        Container x = getContainer();
        AbstractTask task = x.remove();
        System.out.println(LocalTime.now());
        task.execute();
    }
}
