import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

public class customann {
    @MyAnnotation("Custom Annotation")
    public void annmethod() {
        System.out.println("This method is annotated");
    }

    public static void main(String[] args) throws Exception {
        customann obj = new customann();
        obj.annmethod();

        Method method = obj.getClass().getMethod("annmethod");
        MyAnnotation ann = method.getAnnotation(MyAnnotation.class);
        System.out.println("Annotation Value: " + ann.value());
    }
}
