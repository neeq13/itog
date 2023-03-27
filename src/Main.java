import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("2");
        list.add("world");
        list.add(":-)");

        for (String str: list){
            if (str.length() <= 3){
                System.out.println(str);
            }
        }
    }
}
