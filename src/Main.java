public class Main {
    char var;// default value will assign in class data variable only not in the local variable
    public static void main(String[] args) {
        Main m=new Main();
        System.out.println(m.var);
//        int x;
//        System.out.println(x);// this line is giving error because x is local varialbe and it is not initialized with default value, default value will be assigned to the data member varialble only
    }
}