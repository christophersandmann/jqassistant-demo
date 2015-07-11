package org.jqassistant.demo;

/**
 * Marks a package as a module
 */
public @interface Module {

    /**
     * The name of the module.
     * 
     * @return The name of the module.
     */
    String value();

    /**
     * The names of modules this module depends on.
     * 
     * @return The names of modules this module depends on.
     */
    String[] dependsOn() default {};

}
