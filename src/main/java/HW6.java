import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HW6 {
    private static HashMap< Integer, Object> hashMap = new HashMap<>();
    public static void add(Integer numbers) {
        hashMap.put(numbers,numbers);

    }
    private static String getString(){

        return hashMap.keySet().toString();

    }

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        add(7);
        add(5);
        add(6);
        add(8);
        System.out.println(hashMap.keySet());

        Iterator<Integer> iterator = hashMap.keySet().iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

    }


}
