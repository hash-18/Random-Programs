import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class String_Programs {


    public static void main(String[] args) {

//        String s="AbCdEfGhIjKl";
//        Boolean isIsogram=true;
//        char ch[]=s.toCharArray();
//    Set<Character> cs=new HashSet<>();
//        for (char c:ch)
//        {
//            if(!cs.add(c)) {
//                isIsogram = false;
//                break;
//            }
//        }
//
//        if(!isIsogram)
//        System.out.println("Not an Isogram");
//        else System.out.println("Isogram");

//
//        String s="Aaaabcdefghjio";
//        char[] ch=s.toCharArray();
//
//        System.out.println(Stream.of(ch).mapToObj(che->(Character)che).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

        List<Integer> l= List.of(1,2,3,4,5,6,7,8,9,10);
        int sum = l.stream().filter(n -> n % 2 == 0).mapToInt(value -> value).sum();
        System.out.println(sum);
        System.out.println(l.stream().filter(n -> n % 2 == 0).reduce(0,(a,b)->a+b));


        List<String> s=List.of("Mayank", "Mac", " Cam","SpringBoot","Learning");
        List<String> list1=s.stream().filter(ele->ele.length()>6).collect(Collectors.toList());
        System.out.println(list1);
        List<String> list2=s.stream().map(ele->ele.toUpperCase()).collect(Collectors.toList());
        System.out.println(list2);
        List<String> s1=List.of();
        double v = s1.stream().mapToInt(ele -> ele.length()).average().orElse(0);
        System.out.println(v);

        System.out.println(l.stream().max(Comparator.reverseOrder()));


    }


}

