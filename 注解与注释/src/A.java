import org.junit.Test;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class A {
    int a=10;

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                '}';
    }


    @Test
    public void  B(){
        String q="1";
        String w="1";
        String e="1";

    }

    public void C(){

    }
}
