import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.PriorityBlockingQueue;

public class Collection {
    public static void main(String[] args){
//        List<Integer> values=new ArrayList<>();
//        values.add(2);
//        values.add(4);
//        Stack<Integer> stack=new Stack<>();
//        stack.add(8);
//        stack.add(9);
//        values.addAll(stack);
//        System.out.println(values);
//        System.out.println(stack);
//
//        System.out.println("contain all? "+ values.containsAll(stack));
//        stack.remove(Integer.valueOf(8));
//        System.out.println("contain all? "+ values.containsAll(stack));
//        values.clear();
//
//        System.out.println(values);
//        Integer a=3;
////        Integer b=2;
////        System.out.println(a+b);
//
//        ArrayDeque<Integer> arrayDequeAsQueue=new ArrayDeque<>();
//        // insertion
//        arrayDequeAsQueue.addLast(1);
//        arrayDequeAsQueue.addLast(5);
//        arrayDequeAsQueue.addLast(10);
//
//        // deletion
//
//        int element=arrayDequeAsQueue.removeFirst();
//        System.out.println(element);
//
//        // LIFO
//
//        ArrayDeque<Integer> arrayDequeAsStack=new ArrayDeque<>();
//        arrayDequeAsStack.addFirst(1);
//        arrayDequeAsStack.push(5);
//        arrayDequeAsStack.addFirst(10);
//
//        int removedElem= arrayDequeAsStack.removeFirst();
//        System.out.println(removedElem);
//
//        // priorityBlockingQueue
//
//        PriorityBlockingQueue<Integer> pq=new PriorityBlockingQueue<>();
//        pq.add(5);
//        pq.add(2);
//        System.out.println(pq.peek());
//
//        // concurrentLnkedDeque
//
//        ConcurrentLinkedDeque<Integer> ob= new ConcurrentLinkedDeque<>();
//        ob.add(2);
//        ob.add(1);
//
//        System.out.println(ob.remove());
//
//
//        System.out.println("*******************************");
//
//        List<Integer> list1= new ArrayList<>();
//
//        // add(int index,Element e)
//        list1.add(0, 100);
//        list1.add(1,200);
//        list1.add(2,300);
//
//        // addAll(int index,Collection c)
//
//        List<Integer> list2=new ArrayList<>();
//        list2.add(0,400);
//        list2.add(1,500);
//        list2.add(2,600);
//
//        list1.addAll(2,list2);
//        list1.forEach((Integer val)-> System.out.print(val+" "));
//
//        // replaceAll(UnaryOperator op)
//
//        list1.replaceAll((Integer val)-> -1* val);
//
//        System.out.println("after replace all");
//
//        list1.forEach((Integer val)-> System.out.print(val+" "));
//
//        // sort (Comparator c)
//
//        list1.sort((Integer val1,Integer val2)->val2-val1);
//
//        System.out.println("after sorting in increasing order");
//        list1.forEach((Integer val)-> System.out.print(val+" "));
//
//        // get(int index)
//
//        System.out.println("vlaue present at index 2 is "+ list1.get(2));
//
//        // set(int index,Element e)
//
//        list1.set(2,-400);
//
//        System.out.println("after set method");
//
//        list1.forEach((Integer val)-> System.out.print(val+" "));
//
//        // remove(int index)
//
//        list1.remove(2);
//        System.out.println("after removing");
//        list1.forEach((Integer val)-> System.out.print(val+" "));
//
//        // indexOf(Object a)
//
//        System.out.println("Index of -200 integer object is : "+ list1.indexOf(-200));
//
//        //
//
//        ListIterator<Integer> listIterator1= list1.listIterator(list1.size());
//
//        // traversig backward direction
//
//        while(listIterator1.hasPrevious()){
//            int previousVal=listIterator1.previous();
//            System.out.println("traversing backard "+ previousVal+" nextIndex "+ listIterator1.nextIndex()+" previous index "+ listIterator1.previousIndex());
//
//            if(previousVal==-200){
//                listIterator1.set(-50);
//            }
//
//        }
//
//        list1.forEach((Integer val)-> System.out.println("after add "+ val));
//
//        List<Integer> subList = list1.subList(1,4);
//        subList.add(-900);
//        subList.forEach((Integer val)-> System.out.println("sublist: "+val));
//
//
//        System.out.println("**********************");
//        list1.forEach((Integer val)-> System.out.print(" "+val));
//
//        // traversing forward direction
//        ListIterator<Integer> listIterator2 = list1.listIterator();
//        while(listIterator2.hasNext()){
//            int val=listIterator2.next();
//            System.out.println("traversing forward: "+val + " nextIndex: "+listIterator2.nextIndex()+" previous index "+listIterator2.previousIndex());
//
//            if(val==-200){
//                listIterator2.add(-100);
//            }
//        }
//        list1.forEach((Integer val)-> System.out.println("after add: "+val));
//
//        List<Integer>list=new CopyOnWriteArrayList<>();
//        list.add(0,100);
//        System.out.println(list.get(0));
//
//        LinkedList<Integer> list3=new LinkedList<>();
//        //using deque functionality
//        list3.addLast(200);
//        list3.addLast(300);
//        list3.addLast(400);
//        list3.addFirst(100);
//        System.out.println(list3.getFirst());
//
//        // using list functionality
//        LinkedList<Integer> list4=new LinkedList<>();
//        list4.add(0,100);
//        list4.add(1,300);
//        list4.add(3,400);
//        list4.add(1,200);
//        System.out.println(list4.get(1)+" add "+ list4.get(2));
//
//        Vector<Integer> obj = new Vector<>();
//        obj.add(0,200);
//        System.out.println(obj.get(0));

        Map<Integer,String>rolNumberVsNamMap=new HashMap<>();
        rolNumberVsNamMap.put(null,"Test");
        rolNumberVsNamMap.put(8,null);
        rolNumberVsNamMap.put(1,"a");






















    }
}
