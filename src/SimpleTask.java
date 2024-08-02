public class SimpleTask extends Task {
    public SimpleTask() {
    }

    public SimpleTask(String title, String description, int priority, boolean status) {
        super(title, description, priority, status);
    }

    @Override
    public String toString() {
        return "Task{ " +
                "title = '" + super.getTitle() + '\'' +
                ", description = '" + super.getDescription() + '\'' +
                ", priority = " + super.getPriority() +
                ", status = " + super.getStatus() +
                '}';
    }
}
