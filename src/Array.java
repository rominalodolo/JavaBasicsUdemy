import java.util.Arrays;
import java.util.Collections;

public class Array  {
    static int array[] = new int[5];

    static char arrayChar[] = {'h', 'e', 'l', 'l', 'o'};

    static void reverse(Integer array[]){
        Collections.reverse(Arrays.asList(array));
        System.out.println("Reverse of String is: " + Arrays.asList(array);
    }


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


        Integer [] array = {};
        System.out.println("Original Array:" + Arrays.asList(array));
        reverse(array);
    }

}
