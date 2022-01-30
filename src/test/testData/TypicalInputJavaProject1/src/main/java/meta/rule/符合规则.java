package meta.rule;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD,
        ElementType.METHOD,ElementType.PARAMETER,
        ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE,
ElementType.ANNOTATION_TYPE, ElementType.PACKAGE,
ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(符合多个规则.class)
public @interface 符合规则 {
    String value() default "";//规则的编号
    String how() default "";//如何违反了规则
}
