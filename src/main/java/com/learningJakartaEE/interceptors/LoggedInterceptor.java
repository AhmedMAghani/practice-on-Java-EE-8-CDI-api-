package com.learningJakartaEE.interceptors;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Bing the Interceptor annotation to this class
 * by using @Logged, @Interceptor and @Priority
 * to use the function it inplement as interceptor
 */
@Logged //binding annotarion of the class
@Interceptor //indecate that this class is an interseptor class
@Priority(Interceptor.Priority.APPLICATION) // used to activate
public class LoggedInterceptor {
    private final Logger logger;
    private String user = "Mago";

    @Inject
    public LoggedInterceptor(Logger logger) {
        this.logger = logger;
    }

    /**
     * this is the method than will be invoked when the @Logged Annotation is called
     * @param invocationContext
     * @return
     * @throws Exception
     */
    @AroundInvoke
    public Object LoggMethodCall(InvocationContext invocationContext) throws Exception {
        logger.log(Level.INFO,"User {0} Invoked {1} Method at {2}",new Object[]{user,invocationContext.getMethod().getName(), LocalDate.now()});
        return invocationContext.proceed();
    }

}
