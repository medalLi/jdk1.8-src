package medal.myTest;

import java.util.HashSet;

/**
 * @author medal
 * @create 2019-05-14 9:57
 **/
public class test01 {
    public static void main(String[] args) {
        HashSet<String>  hs = new HashSet<>();
        hs.add("hello");
        for (String line : hs) {
            System.out.println(line);
        }
    }
}
