public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling ob=new ExceptionHandling();
        try{
            ob.method1();
        }
        catch(ClassNotFoundException excepObj){
            System.out.println(excepObj.getMessage());
        }
    }
    public void method1() throws ClassNotFoundException {
       throw new ClassNotFoundException("exception throwing");
    }

}
