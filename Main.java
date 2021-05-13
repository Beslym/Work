package geekbrains.lesson_Guess_HomeWork;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static int[] newArrayAfter4(int[] arrayWith4) throws RuntimeException {
        int indexOf4=-1;
        for (int i = arrayWith4.length-1; i>=0 ; i--) {
            if(arrayWith4[i]==4) {
                indexOf4=i+1;
                break;
            }
        }
        if ((indexOf4==-1)||(arrayWith4.length==0)) throw new RuntimeException("Массив не содержит не одной цифры 4 либо пустой");
        else {
            return Arrays.copyOfRange(arrayWith4, indexOf4, arrayWith4.length);
        }

    }
    public static boolean checkArray1And4(int[] array) {
        boolean count1=false;
        boolean count4=false;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==1) {
                count1=true;
            }
            else if (array[i]==4) {
                count4=true;
            }
            else return false;
        }

        return(count4&&count1);
    }
}
