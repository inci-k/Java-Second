package FEB29Arrays;

public class D5Exam1 {
    public static void main(String[] args) {
        methodA();
    }
    public static void methodA(){
        methodB(65);
    }
    public static void methodB(int a){
        for(int i=65;  i<70;  i++){
            System.out.print((char)a);
        }
    }
}
