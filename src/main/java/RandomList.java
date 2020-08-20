import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList {

    public static List<Integer> buildRandomList(int size, int limit){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(limit));
        }
        return list;
    }
}
