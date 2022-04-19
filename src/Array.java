import java.util.Arrays;
import java.util.Collections;

public class Array  {
    static int array[] = new int[5];

    static char arrayChar[] = {'h', 'e', 'l', 'l', 'o'};

    static void reverse(Integer myArray[])
    Collections.reverse(Arrays.asList(myArray));
    System.out.println("Reverse of String is: " + Arrays.asList(myArray);

    public static void main(String[] args) {

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        for (int i=0; i<=4; i++){
            System.out.println(array[i]);
        }
        String StringHello = new String(arrayChar);
        System.out.println(StringHello);
        System.out.println("Length of String is: " + StringHello.length());



        reverse(array);
    }

}
