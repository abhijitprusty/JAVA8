package ap.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingUsingStreams {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);l.add(20);l.add(5);l.add(53);l.add(22);l.add(41);
        System.out.println(" actual list = "+ l);

        Stream intStream = l.stream();
        System.out.println(" count is " + intStream.count());

        //print in default order
        List<Integer> l2 = l.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(" in nature order = " + l2);

        //print in reverse order
        List<Integer> l3 = l.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(" in reverse order = " + l3);

    }
}
