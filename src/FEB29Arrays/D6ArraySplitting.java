package FEB29Arrays;

public class D6ArraySplitting {
    public static void main(String[] args) {

    int myArray[] = {1,2,3,4,5,6,7,8,9};
    int arrayLen = myArray.length;

    //to find in the middle
    int half=arrayLen/2+1;

    int [] firstHalf = new int[half];
      for(int i=0;  i<half;  i++){
        firstHalf[i]=myArray[i];
      }
    int [] secondHalf = new int[myArray.length-half];
      int index=0;
      for(int i=half;  i<myArray.length;   i++){
          secondHalf[index]=myArray[i];
          index++;
      }
        System.out.println("First Array");
      for (int i=0;   i<firstHalf.length;  i++){
          System.out.println(firstHalf[i]);
      }
        System.out.println("Second Half");
      for (int i=0;  i<secondHalf.length;  i++){
          System.out.println(secondHalf[i]);
      }
    }
}
