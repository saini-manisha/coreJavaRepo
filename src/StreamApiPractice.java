import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiPractice {

    public static void main(String[] args){
//       1.Filter evens
//        Input: List<Integer> nums = [1,2,3,4,5,6]
//        Output: [2,4,6]
        List<Integer> list= new ArrayList<>(List.of(1,2,3,4,5,6));

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
        System.out.println(sum);


    }
}
