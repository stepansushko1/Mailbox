package client;
import lombok.Getter;
import lombok.Setter;
import java.util.LinkedList;

@Setter @Getter
public class Client {
    private int id;
    private String name;
    private int age;
    private Gender sex;
    private String email;

    public Client(String name, int age, Gender sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = ClientID.getCounter();
        LinkedList<Integer> arr = new LinkedList<>();

    }
}