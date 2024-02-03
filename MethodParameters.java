public class MethodParameters {
    public static void main(String[] args) {
        welcome("James", 32);
        welcome("Amy", 23);

    }
    static void welcome(String name, int age){
        System.out.println("Welcome, " + name + "!");
        System.out.println("Your age, " + age + "!");
    }
}
