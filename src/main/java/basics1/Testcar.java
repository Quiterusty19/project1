package basics1;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Testcar {
	
	ClassPathResource resource=new ClassPathResource("ioc2.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	Car car=(Car) beanFactory.getBean("mycar");
	car.drive();	
	
     

}
