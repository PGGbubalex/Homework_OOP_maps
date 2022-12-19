import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Task3 {

    HashMap<String, Integer> taskMap = new HashMap<>();

    public void add(String key, Integer value) {
        if (taskMap.containsKey(key) && taskMap.containsValue(value)) {
            throw new RuntimeException(taskMap + " такой ключ уже есть и значения совпадают");
        }
        taskMap.put(key, value);
    }
}
