package Task.MessageTask;

import Task.AbstractTask;

import java.util.Date;

import Task.AbstractTask;
/**
 * We execute this task to print a message .
 * Created by cordu on 10/11/2018.
 */
public class MessageTask extends AbstractTask {
    private String message;
    private String from;
    private String to;
    private Date date;

    /**
     * For a long constructor like this a builder DP is usually the way to go.
     * @param taskId
     * @param descriere
     * @param message
     * @param from
     * @param to
     */
    public MessageTask(String taskId, String descriere, String message, String from, String to) {
        super(taskId, descriere);
        this.message = message;
        this.from = from;
        this.to = to;
        date = new Date();
    }

    @Override
    public void execute() {
        System.out.println(super.toString()+"|message="+this.message+"|from="+this.from+"|to="+this.to+"|date="+this.date.toString());
    }
}
