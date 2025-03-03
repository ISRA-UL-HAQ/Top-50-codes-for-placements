import java.util.Scanner;
public class replace {
    public static void main(String[] args) {
    Scanner object=new Scanner(System.in); 
    System.out.println("enter the array");
     int []arr=new int[object.nextInt()];
     System.out.println("enter the "+arr.length+"elements are");
     for(int i=0;i<=arr.length-1;i++){
        arr[i]=object.nextInt();
     } 
        System.out.println("display the array elements");
        for(int x:arr){
            System.out.print(x+" ");
        }
        replaceDemo re=new replaceDemo();
  void doreplace(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
        if(arr[i]<=0){
            arr[i]=0;
        }
    }
    return arr;
    }

 }
}
