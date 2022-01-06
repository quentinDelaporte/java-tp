import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class removeDoublon {
    public static void main(String[] args) {
        List list = new ArrayList<>(Arrays.asList(1,5,4,8,7,7,5,9,4,6,8,4,2,3,5,1));

        Set<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println(list);
    }
}
