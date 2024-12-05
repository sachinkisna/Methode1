public class Main{
    public static void main(String[] arg){
        System.out.println("Hare Krishna");
        starPrint();
    }
    public static void starPrint(){
        int i;
        for(i=0; i<6; i++){

            System.out.print("*");
            int h;
            for (h=0;h<i;h++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}