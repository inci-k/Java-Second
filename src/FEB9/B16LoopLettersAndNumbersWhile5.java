package FEB9;

public class B16LoopLettersAndNumbersWhile5 {
    public static void main(String[] args) {
        int number = 1;
        char letter;
        int count;
        while (number<6){
            count=1;
            letter='a';
            System.out.print(number);
        while(count<5){
            System.out.print("\t"+letter);
            count++;
            letter++;
        } 
            System.out.println();
        number++;
        }
    }
}