package Task;

/**
 * General task .
 * Created by cordu on 10/11/2018.
 */
public abstract class AbstractTask {
    private String taskId;
    private String descriere;

    public AbstractTask(String taskId, String descriere) {
        this.taskId = taskId;
        this.descriere = descriere;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    @Override
    public String toString(){
        return "id="+this.taskId+"|"+"descriere="+this.descriere;
    }

    public abstract void execute();
}
