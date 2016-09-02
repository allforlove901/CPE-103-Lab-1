import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
   public static void main(String[] args) {
      final int START_VALUE = 1000;
      final int INCREMENT = 10;
      final int RUNS = 4;
      
      int numElements = START_VALUE;
      ArrayList<Integer> list = new ArrayList<Integer>();
      
      for (int i = 0; i < RUNS; i++) {
         for (int j = 0; j < numElements; j++) {
            list.add(j);
         }
         Collections.shuffle(list);
         
         Integer[] array = list.toArray(new Integer[0]);
         
         long prevTime = System.currentTimeMillis();
         BubbleSort(array);
         long nextTime = System.currentTimeMillis();
         
         System.out.printf("%d milliseconds taken to sort %d elements.\n", 
               nextTime - prevTime, numElements);
         
         list.clear();
         numElements *= INCREMENT;
      }
   }
   
   
   //Method to sort the integers in a list in increasing order
   public static void BubbleSort(Integer[] array) {
	   
	   for(int i = 0; i < array.length; i++){
		   for(int j = 0; j < array.length-1; j++){
			   if (array[j] > array[j+1]){
				   int stored = array[j];
				   array[j] = array[j+1];
				   array[j+1] = stored;
			   }//close if
		   }//close j-for
	   }//close i-for
   }
}