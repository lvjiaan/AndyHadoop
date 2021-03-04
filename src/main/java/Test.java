import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.min;

/**
 * @Describe:
 * @Author£ºlvja
 * @Date£º2021/3/3 16:18
 * @Modifier£º
 * @ModefiedDate:
 */
public class Test {
    public static void main(String[] args) {
        String input1 = args[0].toString();
        String input2 = args[1].toString();
        String regex=args[2].toString();
        String[] list1 = input1.split(regex);
        String[] list2 = input2.split(regex);
        int size =min(list1.length,list2.length);
        for(int i=0; i<size; i++) {
            try {
                List<String> relist =new ArrayList<String>();
                relist.add(list1[i]);
                relist.add(list2[i]);
                System.out.println(relist);
            } catch (Exception e) {
                continue;
            }
        }
    }
}
