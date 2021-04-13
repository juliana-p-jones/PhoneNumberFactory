package designpatterns;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws Exception{

        //============ Singleton ===============
        System.out.println("============ Singleton ===============");
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        System.out.println(singletonRuntime);
        Runtime anotherInstance = Runtime.getRuntime();
        if(singletonRuntime == anotherInstance){
            System.out.println("They are the same instance");
        }

        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);
        DbSingleton anothernotherInstance = DbSingleton.getInstance();
        //this is printing the same address in memory
        System.out.println(anothernotherInstance);
        System.out.println();


        //========= BuilderPattern  ==========
        System.out.println("========= BuilderPattern  ==========");
        System.out.println();


        //=========  PrototypePattern  ============
        System.out.println("=========  PrototypePattern  ============");
        String sql = "select * from movies where title = ?";
        List<String> parameters = new ArrayList<>();
        parameters.add("Star wars");
        Record record = new Record();
        PrototypePattern firstPrototypePattern = new PrototypePattern(sql, parameters, record);
        System.out.println(firstPrototypePattern.getRecord());
        System.out.println(firstPrototypePattern.getSql());
        System.out.println(firstPrototypePattern.getParameters());
        //THE ACTION- here we clone firstPrototypePattern and get back the same stuff for secondPrototypePattern
        PrototypePattern secondPrototypePattern = firstPrototypePattern.clone();
        parameters.add("Ghostbusters");
        System.out.println(secondPrototypePattern.getParameters());
        System.out.println();


        // =============  Factory  ============
        System.out.println();
        Calendar cal = Calendar.getInstance();
        //prints out the Gregorian Calendar
        System.out.println(cal);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println();

        //==========  AbstractFactory  =========
        System.out.println("==========  AbstractFactory  =========");
        String xml ="<document><body><stock>AAPL</stock></body></document>";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();
        Document doc = factory.parse(bais);

        doc.getDocumentElement().normalize();

        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

        System.out.println(abstractFactory.getClass());
        System.out.println(factory.getClass());
        System.out.println();
    }
}
