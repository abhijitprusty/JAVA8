package ap.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterListUsingStreams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(40);
        list.add(60);
        list.add(80);
        list.add(70);
          List<Integer> output =  list.stream().filter(I-> I > 40).collect(Collectors.toList());
          System.out.println(output);
    }


}
