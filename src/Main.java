import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Loan());
        list.add("Hello World");
        list.add(new Circle());

        for(Object o:list) {
            System.out.println(o.toString());
        }
    }
}
