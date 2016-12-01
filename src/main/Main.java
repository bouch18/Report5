/**
 * Created by e165745 on 2016/11/30.
 */
public class Main  {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("ぬるぽ");
            e.printStackTrace();
        }
    }
}
