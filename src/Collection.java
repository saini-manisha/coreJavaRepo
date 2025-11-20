import java.util.*;

public class Collection {
    public static void main(String[] args){
        List<Integer> values=new ArrayList<>();
        values.add(2);
        values.add(4);
        Stack<Integer> stack=new Stack<>();
        stack.add(8);
        stack.add(9);
        values.addAll(stack);
        System.out.println(values);
        System.out.println(stack);

        System.out.println("contain all? "+ values.containsAll(stack));
        stack.remove(Integer.valueOf(8));
        System.out.println("contain all? "+ values.containsAll(stack));
        values.clear();

        System.out.println(values);


    }
}
