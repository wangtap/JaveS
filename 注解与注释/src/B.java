import java.lang.annotation.*;

@Target({ElementType.ANNOTATION_TYPE})
//@Documented
//@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface B {
    int paraml() default 0;
    String param2() default " ";



}
