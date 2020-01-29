package duke.pack;

import java.util.ArrayList;

public class TaskList {
    protected ArrayList<Task> list;

    public TaskList() {
        list = new ArrayList<>();
    }

    public TaskList(ArrayList<Task> list) {
        this.list = list;
    }

    public void addTask(Task task) {
        list.add(task);
    }

    public Task deleteTask(int taskNum) {
        return list.remove(taskNum - 1);
    }

    public int getSize() {
        return list.size();
    }

    public ArrayList<Task> getList() {
        return list;
    }

    public Task markAsDone(int taskNum) {
        list.get(taskNum - 1).markAsDone();
        return list.get(taskNum - 1);
    }

    public void printList() {
        System.out.println("    Here are your tasks:");

        for (int i = 1; i <= list.size(); i++) {
            System.out.println("    " + i + ". " + list.get(i - 1));
        }
    }


}