import javax.print.attribute.standard.PresentationDirection;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApiPractice {

    public static void main(String[] args){
//       1.Filter evens
//        Input: List<Integer> nums = [1,2,3,4,5,6]
//        Output: [2,4,6]
        List<Integer> list= new ArrayList<>(List.of(5,3,8,1));

        List<Integer> evens=list.stream().filter(item->item%2==0).collect(Collectors.toList());
//        System.out.println(evens);
//        2. Square each number (map)
//        Input: [1,2,3,4]
//        Output: [1,4,9,16]

        List<Integer>square=list.stream().map(item->item*2).collect(Collectors.toList());
//        System.out.println(square);
//        3. Sum of list (reduce)
//        Input: [1,2,3,4]
//        Output: 10
        int sum=list.stream().reduce(0,(acc,item)->acc+item);
//        System.out.println(sum);
//        4. Product of list (reduce)
//        Input: [2,3,4]
//        Output: 24

        int product=list.stream().reduce(1,(acc,item)->acc*item);
//        System.out.println(product);

//        5. Count elements > 10
//        Input: [5,12,18,3,20]
//        Output: 3

//        long c=list.stream().filter(item->item>10).count();
//        System.out.println(c);
//
//        6. Find max value (using streams)
//        Input: [3,9,2,15,7]
//        Output: 15
        int maxVal=list.stream().reduce(Integer.MIN_VALUE,(acc,item)->Math.max(acc,item));
//        System.out.println(maxVal);
//        7. Find min value (using streams)
//        Input: [3,9,2,15,7]
//        Java 8 Stream api practice questions 1
//        Output: 2
        int minVal=list.stream().reduce(Integer.MAX_VALUE,(acc,item)->Math.min(acc,item));
        //System.out.println(minVal);
//        8. Collect distinct values
//        Input: [1,2,2,3,3,3]
//        Output: [1,2,3] (order not guaranteed unless sorted)
//        System.out.println(list.stream());

        List<Integer> distinct=list.stream().distinct().collect(Collectors.toList());

        //System.out.println(distinct);
//        9. Sort list ascending
//        Input: [5,3,8,1]
//        Output: [1,3,5,8]
        List<Integer> sorted=list.stream().sorted((a,b)->b-a).collect(Collectors.toList());
       // System.out.println(sorted);
//        11. First N elements (limit)
//        Input: [10,20,30,40,50] , N=3
//        Output: [10,20,30]

        List<Integer> list1=List.of(10,20,30,40,50);
        int N=3;
        List<Integer> firstN= list1.stream().limit(N).collect(Collectors.toList());
        //System.out.println(firstN);
//        12. Skip first N elements
//        Input: [10,20,30,40] , skip=2
//        Output: [30,40]
        List<Integer> skipFirstN=list1.stream().skip(N).collect(Collectors.toList());
        //System.out.println(skipFirstN);

//        13. Convert list of strings to uppercase (map)
//                Input: ["a","bcd","e"]
//        Output: ["A","BCD","E"]
        List<String> list2=List.of("a","bcd","e");
//        List<String> uppercaseList=list2.stream().map((item)->item.toUpperCase()).collect(Collectors.toList());
//        System.out.println(uppercaseList);
//
//        14. Join strings with delimiter
//        Input: ["a","b","c"] , delimiter=","
//        Output: "a,b,c"

        List<String> list3= Arrays.asList("a","b","a","c","a","a","a");
//        String delimiter=",";
//        String result= list3.stream().collect(Collectors.joining(delimiter));
//        System.out.println(result);

//        15. Count frequency of a specific element
//        Input: ["a","b","a","c","a"] , element="a"
//        Output: 3

//        long count=list3.stream().filter((item)->item.equals("a")).count();
//        System.out.println(count);

//        16. Find any element matching predicate
//
//        Input: [1,2,3,4] , predicate: >3
//        Output: Optional[4] (or 4)

        List<Integer> list4=Arrays.asList(1,2,3,4);
//        Optional<Integer> result=list4.stream().filter(n->n>3).findAny();
//        System.out.println(result);
//
//        17. Check if all match predicate
//        Input: [2,4,6] , predicate: even
//        Output: true
//        boolean ans= list4.stream().allMatch(n->n%2==0);
//        System.out.println(ans);
//        18. Check if any match predicate
//        Input: [1,3,4] , predicate: even
//        Output: true
//        boolean ans=list4.stream().anyMatch(n->n%2==0);
//        System.out.println(ans);

//        19. Check if none match predicate
//        Input: [1,3,5] , predicate: even
//        Output: true

//        List<Integer> list5=Arrays.asList(1,3,5);
//        boolean ans=list5.stream().noneMatch(n->n%2==0);
//        System.out.println(ans);
//        20. Map strings to their lengths
//        Input: ["apple","pie","a"]
//        Output: [5,3,1]
//        List<String> list6= Arrays.asList("apple","pie","a");
//        List<Integer> ans=list6.stream().map(item->item.length()).collect(Collectors.toList());
//        System.out.println(ans);

//        21. Flatten list of lists (flatMap)
//                Input: [[1,2],[3,4],[5]]
//        Output: [1,2,3,4,5]

//        List<List<Integer>> list7=Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4),Arrays.asList(5));
//        List<Integer> result=list7.stream().flatMap(inner->inner.stream()).collect(Collectors.toList());
//        System.out.println(result);

//        22. Filter nulls from list
//        Input: [1,null,2,null,3]
//        Output: [1,2,3]












    }
}
