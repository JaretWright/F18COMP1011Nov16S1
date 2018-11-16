import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetExperiment {
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("golf",
                "biking","skiing","boating", "boating"  );
        HashSet<String> favThings = new HashSet<>();
        favThings.addAll(list);

//        HashSet<String> favThings2 = (HashSet) Arrays.asList("golf",
//                "biking","skiing","boating", "boating"  );

        System.out.println(favThings);


    }
}
