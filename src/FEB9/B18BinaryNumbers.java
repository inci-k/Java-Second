package FEB9;

public class B18BinaryNumbers {
    public static void main(String[] args) {
        for(int i=0; i<2;   i++){
            for(int j=0;  j<2;   j++){
                for(int k=0;   k<2;   k++){
                    System.out.println(""+i+j+k);       //if we don't use "" becomes a math operation
                }
            }
        }
    }
}