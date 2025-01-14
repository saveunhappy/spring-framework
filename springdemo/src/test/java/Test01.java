import com.imooc.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("欢迎你强大的spring框架");
		System.out.println("hello world");
		String xmlPath = "D:\\dev\\spring-framework\\springdemo\\src\\main\\resources\\spring\\spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
		welcomeService.sayHello("强大的spring框架");
	}
}
