import java.util.*;
public class queue8 {
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();//deque is an inteface
        d.addFirst(1);
        d.addFirst(2);
        d.addLast(5);
        System.out.println(d);

    }
}
