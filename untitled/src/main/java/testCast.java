import java.util.HashMap;

public class testCast {
    public static void main(String[] args) {
        int a = 5;int v=0;
        if ((v=(a >> 1))<1 )
            System.out.println("a>0");
        else if (a > 1)
            System.out.println("a>1");
        else
            System.out.println("a>2");
        if (a>4)
            System.out.println(v);
    }
}