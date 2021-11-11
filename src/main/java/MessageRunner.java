import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("classpath:message-bean.xml");

        Message message = (Message) context.getBean("printMessage");
        message.setMessage("This is first object.");
        System.out.println(message.getMessage());

        Message oneMoreMessage = (Message) context.getBean("printMessage");
        System.out.println(oneMoreMessage.getMessage());
    }
}
