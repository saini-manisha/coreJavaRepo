import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Bird{
    int id;

}
class Eagle{
    public String breed;
    private  boolean canSwim;
    public void fly(){
        System.out.println("fly");
    }
//    @Depricated
    @Deprecated
    public void eat(){
        System.out.println("eat");
    }
}
public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
       // System.out.println("hello");
//        Class birdClass=Class.forName("Bird");
//       // System.out.println(birdClass);
//        System.out.println(Bird.class);
//        Bird birdObj=new Bird();
//        System.out.println(birdObj.getClass());
//        Class reflectionClass= Reflection.class;
//        //System.out.println(Modifier.toString(reflectionClass.getModifiers()));

       // Class eagleClass=Eagle.class;
//        System.out.println(eagleClass.getName());
//        System.out.println(Modifier.toString(eagleClass.getModifiers()));
//        Method[] methods=eagleClass.getMethods();
//        for(Method method:methods){
//            System.out.println(method.getName());
//            System.out.println(method.getDeclaringClass());
        Class eagleClass=Class.forName("Eagle");
        Eagle eagleObj=(Eagle)eagleClass.newInstance();
        Method flyMethod = eagleClass.getMethod("fly");
        flyMethod.invoke(eagleObj);
        eagleObj.eat();

        }
    }

