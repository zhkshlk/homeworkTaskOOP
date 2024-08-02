public class ComplexTask extends Task {
    private String subTasks;

    public ComplexTask () {}
    public ComplexTask(String subTasks) {
        this.subTasks = subTasks;
    }

    public ComplexTask(String title, String description, int priority, boolean status, String subTasks) {
        super(title, description, priority, status);
        this.subTasks = subTasks;
    }

    public String getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(String subTasks) {
        this.subTasks = subTasks;
    }

    @Override
    public String toString() {
        return "Task{ " +
                "title = '" + super.getTitle() + '\'' +
                ", description = '" + super.getDescription() + '\'' +
                ", priority = " + super.getPriority() +
                ", status = " + super.getStatus() +
                '}' + '\'' + "ComplexTask{" +
                "subTasks='" + subTasks + '\'' +
                '}';
    }
}
