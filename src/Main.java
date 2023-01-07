import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array ={2,-4,0, 4,-10,5};
        for (int i= 0; i< array.length; i++){
            for (int j =i+1 ; j< array.length; j++ ){
                if (array[i]>array [j]){
                    int ch = array[i];
                    array[i] = array[j];
                    array[j] =ch;

                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}