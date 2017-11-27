package humberd.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class NotNullArgsAspect {

    @Pointcut("execution(@humberd.NotNullArgs * *(..))")
    public void notNullArgs() {
    }

//    @Before("notNullArgs()")
//    public void preventNotNullArgs(JoinPoint joinPoint) {
//        String methodName = joinPoint.getSignature().getName();
//
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        String[] parameterNames = signature.getParameterNames();
//        Class[] parameterTypes = signature.getParameterTypes();
//
//        for (int i = 0; i < joinPoint.getArgs().length; i++) {
//            if (joinPoint.getArgs()[i] == null) {
//                throw new IllegalArgumentException("Method (" + methodName + ") requires not null arguments, but instead the argument [" + parameterNames[i] + "] of type {"+ parameterTypes[i]+"} is null");
//            }
//        }
//    }
}
