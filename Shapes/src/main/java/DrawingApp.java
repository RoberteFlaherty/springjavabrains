import models.Circle;
import models.Shape;
import models.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

    public static void main(String[] args)
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/Spring.xml");
        //Triangle triangle = (Triangle)context.getBean("triangle");

        Shape shape = (Shape)context.getBean("circle");
        shape.draw();
        context.registerShutdownHook();
        System.out.println( context.getMessage("greeting", null, "Default greeting", null));

    }
}
