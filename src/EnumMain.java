public class EnumMain {
    public static void main(String[] args){
        for(EnumSample sample:EnumSample.values()){
            System.out.println(sample.ordinal());
        }
    }
}
