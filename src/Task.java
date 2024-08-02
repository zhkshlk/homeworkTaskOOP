public class Task {
    private String title;
    private String description;
    private int priority;
    private boolean status;
    private static int taskCounter = 0;

    public Task() {
    }

    public Task(String title, String description, int priority, boolean status) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
        taskCounter++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    public boolean getStatus() {
        return true;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus(boolean status) {
        return true;
    }

    public static void getTaskCount () {
        System.out.println(taskCounter);
    }
    @Override
    public String toString() {
        return "Task{ " +
                "title = '" + title + '\'' +
                ", description = '" + description + '\'' +
                ", priority = " + priority +
                ", status = " + status +
                '}';
    }
}
