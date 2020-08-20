import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getLogger();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (int i : list) {
            if (i < treshold) logger.log("Элемент " + i + " не подходит");
            else {
                logger.log("Элемент " + i + " подходит");
                result.add(i);
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + list.size());

        return result;
    }

}