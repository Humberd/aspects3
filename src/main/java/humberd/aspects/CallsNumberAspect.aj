package humberd.aspects;

import humberd.MessageCommunicator;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public aspect CallsNumberAspect {
    private Map<String, Integer> MessageCommunicator.count = new HashMap<>();

    public Integer MessageCommunicator.getNumberOfCalls(String methodName) {
        Integer times = count.get(methodName);
        if (times == null) {
            return 0;
        }
        return times;
    }

    public void MessageCommunicator.increment(String methodName) {
        count.putIfAbsent(methodName, 0);
        count.put(methodName, count.get(methodName) + 1);
    }

    pointcut classMethods(): execution(* MessageCommunicator.*(..)) && ! execution(* MessageCommunicator.increment(..))  && ! execution(* MessageCommunicator.getNumberOfCalls(..));

    before(): classMethods() {
        MethodSignature signature = (MethodSignature) thisJoinPoint.getSignature();
        Method method = signature.getMethod();
        MessageCommunicator target = (MessageCommunicator) thisJoinPoint.getTarget();
        target.increment(method.getName());
    }

}
