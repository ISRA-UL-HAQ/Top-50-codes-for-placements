public class Reversenum {
    public static void main(String[] args) {
        int num =12345;
        int reversenum=0;
        while(num!=0){
            int lastdigit=num%10;/*last digit*/
            reversenum= reversenum*10+lastdigit;
            num=num/10;/*remove last digit*/
            
        }
        System.out.println("the reverse number is "+""+reversenum);
    }
    
}
