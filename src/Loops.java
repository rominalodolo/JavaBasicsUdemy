import org.w3c.dom.ls.LSOutput;

public class Loops {
    // init (i=1)
    // condition(i<=20)
    //increment(i=i+1)
    public static void main(String[] args) {
        for(int i=30;i<=20;i++){
            System.out.println(i + " ");
        }
        System.out.println(" ");
        int x = 30;
        while(x<=20){
            System.out.println(x + " ");
            x++;
        }
        System.out.println(" ");
        int y=30;
        do{
            System.out.println(y + " ");
            y++;
        }
        while(y <= 20);
    }
}
