import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiPractice {

    public static void main(String[] args){
// 1       Filter evens
//        Input: List<Integer> nums = [1,2,3,4,5,6]
//        Output: [2,4,6]
        List<Integer> list= new ArrayList<>(List.of(1,2,3,4,5,6));

        List<Integer> evens=list.stream().filter(item->item%2==0).collect(Collectors.toList());
        System.out.println(evens);
    }
}
