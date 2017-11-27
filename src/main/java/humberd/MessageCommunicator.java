package humberd;

public class MessageCommunicator {
    public void deliver(String message) {
        System.out.println(message);
    }

    @NotNullArgs
    public void deliver(String user, String message) {
        System.out.println(user + ", " + message);
    }

    public void setDelivery(String message) {
        System.out.println("Setting delivery" + message);
    }

    public String getDelivery() {
        System.out.println("Getting delivery" + "foo");
        return "foo";
    }
}

//package humberd.aspects;
//
//        import humberd.MessageCommunicator;
//        import org.aspectj.lang.reflect.MethodSignature;
//
//        import java.lang.reflect.Method;
//        import java.util.HashMap;
//
//public aspect CallsNumberAspect {
////    private HashMap<String, Integer> MessageCommunicator.count = new HashMap<>();
//
////    public Integer MessageCommunicator.getNumberOfCalls(String methodName) {
////        return count.get(methodName);
////    }
////
////    public void MessageCommunicator.increment(String methodName) {
////        int currentValue = count.putIfAbsent(methodName, 0);
////        count.put(methodName, currentValue + 1);
////    }
//
////    pointcut classMethods(): execution(* MessageCommunicator.*(..));
////
////    before(): classMethods() {
////        MethodSignature signature = (MethodSignature) thisJoinPoint.getSignature();
////        Method method = signature.getMethod();
////        MessageCommunicator target = (MessageCommunicator) thisJoinPoint.getTarget();
////        target.increment(method.getName());
////    }
//
//        }
