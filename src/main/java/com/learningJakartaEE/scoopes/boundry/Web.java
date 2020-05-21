package com.learningJakartaEE.scoopes.boundry;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @Stereotype means that this annotation is actually a group of annotation
 * wish could be a pre-defined or custom annotation
 */
@Stereotype
@RequestScoped //mean it is a request scooped bean meaning it will only instantiated only when HTTP request is proceed
@Named //means CDI will inject "using @inject annotation" dependency by name "in other words the class can be accessed by name through HTML"
@Retention(RetentionPolicy.RUNTIME) //this annotation is used at runtime
@Target(ElementType.TYPE) //specifies where tha annotation will be used
public @interface Web {
}
