
public class IfElseSwitch {
    public static void main(String[] args) {
        // Finding the largest of two numbers
        int x;
        x = 1;
        if(x==1){
            System.out.println("One");
        }else if(x==2) {
            System.out.println("Two");
        }else{
            System.out.println("I don't know the number.");
        }

        System.out.println("I am learning Switch.");
        switch(x){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("I don't know the number.");
        }

        int num1, num2;
        num1 = 10;
        num2 = 13;
        if (num1>num2)
        {
            System.out.println(num1 + " is the largest!");
        }else if(num2>num1){
            System.out.println(num2 + " is the largest!");
        }else {
            System.out.println("The numbers are the same.");
        }


    }
}
