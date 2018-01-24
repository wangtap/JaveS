import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Method a=Class.forName("B").getDeclaredMethod("a");
        B annotation = a.getAnnotation(B.class);
        System.out.println(annotation.param2());
        System.out.println(annotation.paraml());
    }
}
