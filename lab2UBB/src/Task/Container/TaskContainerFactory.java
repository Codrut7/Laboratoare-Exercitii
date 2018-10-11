package Task.Container;

/**
 * Created by cordu on 10/11/2018.
 */
public class TaskContainerFactory implements Factory {
    private static TaskContainerFactory instance;

    private TaskContainerFactory(){
    }
    @Override
    public Container createContainer(String strategy) {
        if(strategy.equalsIgnoreCase("FIFO")){
            return new QueueContainer();
        }else{
            return new StackContainer();
        }
    }

    public static TaskContainerFactory getInstance(){
        if(instance==null){
            instance = new TaskContainerFactory();
        }
        return instance;
    }
}
