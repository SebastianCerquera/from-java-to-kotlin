package courseraWeek2;


public class UsingKotlinObjectFromJava {
    public static void main(String[] args) {
        JSingleton.INSTANCE.foo();
        KSingleton.INSTANCE.foo();
    }
}
