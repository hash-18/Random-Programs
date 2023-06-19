import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Random {
    public static void main(String[] args) {
       // System.out.println(reverseString("Mayank"));
        letterFreqInDesc();

    }


        public static void setSum()
        {
            List l = new ArrayList(List.of(1, 2,3,3,4, 8, 6,6, 10, 9, 5, 7));
            //System.out.println(Arrays.toString(arr));
            System.out.println(l);
            int sum = 12;
            Set<Integer> s = new HashSet<>(l);

           // l.stream().filter(ele -> s.contains((sum - (int) ele))).map(i -> i + " " + (sum - (int) i)).forEach(System.out::println);
            l.stream().filter(ele -> s.contains((sum - (int) ele)) && s.remove((ele))).map(i -> i + " " + (sum - (int) i)).forEach(System.out::println);

        }
       // Map<Integer, Integer> m=l.stream().filter(ele->s.contains((sum-(int)ele))).collect(Collectors.toMap(Function.identity(), i->(sum-(int)i)));
        //System.out.println(m);
        public static void countVowels()
        {
            Set<Character> vSet = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));
            String name = "Mayank";
            name.chars().forEach((ch -> System.out.print((char) ch + " ")));
            System.out.println(name.chars().filter(ch -> vSet.contains((char) ch)).count());
        }

       //int count= (int) Stream.of(name.toCharArray()).filter(ele->vset.contains(ele)).count();
       // System.out.println(Stream.of(count));

        public static void countWords()
        {
        String str="Hello World hello";

        List<String> ls=List.of(str.toLowerCase().split(" "));
        System.out.println(ls);
        Map<String, Long> cMap=ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(cMap);



    }

    public static void countLettersInAWord()
    {
        String str="Hello World hello";

        List<String> ls=List.of(str.toLowerCase().split(" "));
        System.out.println(ls);
        ls.stream().map(ele->ele+ " "+ele.length()).forEach(ele->System.out.println(ele));
        System.out.println(ls.stream().mapToInt(ele->ele.length()).count());
        Map<String, Long> cMap=ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(cMap);
    }

    public static void dupElementInAGivenString()
    {
        String name="Mayank Pandey";
        System.out.println(Arrays.toString(name.split("")));
        Set<String> unique=new HashSet<>();
        List<String> duplicate=Arrays.stream(name.toUpperCase().split("")).filter(ele->!unique.add(ele)).distinct().collect(Collectors.toList());
    System.out.println(duplicate);
    }

    public static void firstNonRepeatElement() {
        String name = "MayankPandey";
        System.out.println(Arrays.toString(name.split("")));
        Set<String> unique = new HashSet<>();
        String s1=Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
        System.out.println(s1);

        //The O/P is incorrect bcoz in HashMap we donot preserve insertion order.
        //To preserve that - use Linked HashMap.
        String s2=Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
        System.out.println(s2);
    }

    public static void secondHighestNumber()
    {
        int arr[]= new int[]{1, 4, 2, 6, 8, 9, 11,11, 5, 8};
        int n=Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(n);
    }

    public static void longestString()
    {
        String[] str={"C","java","Spring","GoLanga"};
        System.out.println(Arrays.stream(str).sorted((a,b)->b.length()-a.length()).findFirst().get());
    }


    public static String reverseString(String s)
    {
        if(s.length()==1)
            return s;
        return reverseString(s.substring(1,s.length()))+s.charAt(0);
    }

    public static void countNumberOfWords()
    {
        String s= " Hi, this is a sentence ";
        List<String> l1=List.of(s.trim().split(" "));
        System.out.println(l1.size());
    }

    public static void letterFreqInDesc()
    {
        String s="Banana";
      Map<String, Long> map= List.of(s.toLowerCase().split(""))
               .stream().collect(Collectors.groupingBy
                       (Function.identity(),Collectors.counting()));
      map.entrySet().stream().sorted((o1,o2)-> o2.getValue().compareTo(o1.getValue())).forEach(o->System.out.println(o));
    }
}
