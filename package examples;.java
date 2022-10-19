import java.util.ArrayList;

public class Examples {

    public static void main(String[] args) {
        int some[] = new int[4];
        ArrayList<Integer> some_din = new ArrayList<>(5);
        some_din.add(56);
        some_din.add(8);
        some_din.add(7);
        some_din.add(2);
        some_din.add(3);
        some_din.add(1);
        some_din.add(1);

        for (Integer x : some_din) {
            System.out.println(x);
        }
    }
}