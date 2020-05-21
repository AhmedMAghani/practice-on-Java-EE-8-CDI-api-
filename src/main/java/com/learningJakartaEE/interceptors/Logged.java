package com.learningJakartaEE.interceptors;

import javax.interceptor.InterceptorBinding;
import java.lang.annotation.*;

/**
 * Interceptor annotation for logger
 * used to be added to method to be intercepted by it's class
 */
@InterceptorBinding
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Inherited
@Documented
public @interface Logged {
}
