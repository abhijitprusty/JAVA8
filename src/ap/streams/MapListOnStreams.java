package ap.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapListOnStreams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(40);
        list.add(60);
        list.add(80);
        list.add(70);
        System.out.println(list.stream().count());
          List<Integer> output =  list.stream().map(I-> I * 2).collect(Collectors.toList());
          System.out.println(output);


        int sum = list.stream().reduce(0, (x,y) -> x+y);
        System.out.println(sum);
    }


}
