public class Main {
    public static void main(String[] args) {
        SimpleTask simpleTask = new SimpleTask(
                "Пи", "Вычислить число Пи", 3, true);
        ComplexTask complexTask = new ComplexTask(
                "Дифференцирование","Вычислить дифференцию", 6, false, "подзадача");
        Task.getTaskCount();
    }
}