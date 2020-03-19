package test;

import org.junit.internal.Classes;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD,TYPE})
@Retention(RUNTIME)
@Documented
public @interface javafs {
    int[] value();
}