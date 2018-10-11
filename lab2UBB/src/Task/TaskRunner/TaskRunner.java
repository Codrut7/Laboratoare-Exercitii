package Task.TaskRunner;

import Task.AbstractTask;

/**
 * Created by cordu on 10/11/2018.
 */
public interface TaskRunner {
    void executeOneTask(); // executa un task din colecţia de task-uri de executat
    void executeAll(); // executǎ toate task-urile din colecţia de task-uri.
    void addTask(AbstractTask t); //adaugǎ un task în colecţia de task-uri de executat
    boolean hasTask(); //verifica daca mai sunt task-ri de executat
}
