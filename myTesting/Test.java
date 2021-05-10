package geekbrains.lesson_Guess_HomeWork.myTesting;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
    int priority() default 1;
}
