package FEB26MethodsAndLibraries;

public class C27RandomNumber {

        /*System.out.println((Math.random()));
        System.out.println((int)(Math.random()));
        System.out.println(((int)Math.random()*100));       // 0.838478  int oldugu icin result =0
        System.out.println((int)((Math.random()*1000)));*/

        public static void main(String[] args) {
         /*   int count=0;
            while(count<20){
                generatePass();
                count++;         * /
          */
        //String password =generatePassword();
          //  System.out.println(password);

            for (int i=0;  i<100;  i++)
                System.out.println(100 + (int)(Math.random()*100));
        }
    public static void generatePass(){
            for (int i = 0;   i<6;   i++){
                System.out.print((int)(Math.random()*10));
            }
        System.out.println();
    }
    public static String generatePassword(){
            String result="";
            for (int i=0;  i<6;  i++) {
                result += (int) (Math.random() * 10);
        }
            return result;
    }
}
