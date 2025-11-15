import javax.print.attribute.standard.PresentationDirection;
import java.util.ArrayList;
import java.util.List;
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





    }
}
