package Practice10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveLastElement {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < 3; i++) {
            if(!arrayList.isEmpty()) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        System.out.println("删除后的数组为：" + arrayList);
    }
}
