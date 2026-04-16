import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Sets_STL {
    static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        set.add(42); // o(1) -> average case , worst case -> o(n)
//        set.add(84);
//        set.add(96);
//        set.add(54);
//        set.add(36);
//        set.add(147);
//        System.out.println(set.size());
//        System.out.println(set.contains(25));
//        set.remove(84);
//        System.out.println(set.size());

//        System.out.println(set); // unordered set ans -> [96, 147, 84, 36, 54, 42]

        TreeSet<Integer> set = new TreeSet<>();
        set.add(42); // o(1) -> average case , worst case -> o(n)
        set.add(84);
        set.add(96);
        set.add(54);
        set.add(36);
        set.add(147);
        System.out.println(set);   // ordered set ans->[36, 42, 54, 84, 96, 147]
    }
}
