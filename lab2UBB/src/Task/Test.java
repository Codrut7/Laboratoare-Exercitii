package Task;

import Task.MessageTask.MessageTask;
import Task.TaskRunner.StrategyTaskRunner;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * test
 * Created by cordu on 10/11/2018.
 */
public class Test {
    public static void main(String arg[]){
        AbstractTask[] abstractTasks = new AbstractTask[100];
        StrategyTaskRunner strategyTaskRunner = new StrategyTaskRunner("FIFO");
        for(int i = 0 ; i < 5 ; i++){
            abstractTasks[i] = new MessageTask(Integer.toString(i),"laborator pentru persoana"+ i,"mesaj"+i,"cineva","altcineva");
            strategyTaskRunner.addTask(abstractTasks[i]);
        }
        strategyTaskRunner.executeAll();
    }
}
