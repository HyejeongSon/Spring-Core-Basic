package hello.core.scan.filter;

import java.lang.annotation.*;

// type - class 레벨
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
