public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(String.format("ФИО сотрудника — %s", fullName));
    }

    private static void task2() {
        System.out.println("Задача 2");

    }

    private static void task3() {
    }
}