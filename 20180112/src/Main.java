import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import javax.xml.stream.XMLStreamConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        XStream xStream=new XStream(new DomDriver());
        User user =new User("zhangSan","2");
        User user1 =new User("Lisi","2");
        User user2 =new User("1","2");
        List<User> users=new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        Person person=new Person(users);
//        xStream.toXML(person,new FileOutputStream("src/person.xml"));

        Person o = (Person) xStream.fromXML(new FileInputStream("src/person.xml"));
        System.out.println(o);
        List<User> users1 = o.getUsers();
        System.out.println(users1.toString());


    }
}
