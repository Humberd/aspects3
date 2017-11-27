package humberd;

public class Main {
    public static void main(String[] args) {
        MessageCommunicator messageCommunicator = new MessageCommunicator();
        messageCommunicator.deliver("test message 1");
        messageCommunicator.deliver("Joe", "test message 2");
        messageCommunicator.deliver("Joe", null);
        messageCommunicator.setDelivery("mydelivery");
        messageCommunicator.getDelivery();

        System.out.println("------------------------------------------------");
        printMethodInvoke(messageCommunicator, "deliver");
        printMethodInvoke(messageCommunicator, "setDelivery");
        printMethodInvoke(messageCommunicator, "foobar");
    }

    public static void printMethodInvoke(MessageCommunicator obj, String methodName) {
        System.out.println("Method (" + methodName + ") was invoked: " + obj.getNumberOfCalls(methodName) + " times");

    }
}