package org.jqassistant.demo;

public @interface Module {

    String value();

    String[] dependsOn() default {};

}
