class Pair<K,V>{
    private K key;
    private V value;
    Pair(K key, V value){
        this.key=key;
        this.value=value;

    }
}

public class GenericClass {
    public static void main(String[] args){
        Pair<String,String> p=new Pair<>("abc","manisha");

    }
}
