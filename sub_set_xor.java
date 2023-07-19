import java.util.Scanner;
class sub_set_xor{
    public static void main(String argg[]){
        input in=new input();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Scanning int");
        int arr[] =new int[num];
        arr=in.scan(arr);
        in.printer(arr);
    }
}
class input{
    
    int[] scan(int []arr){

        int len=arr.length;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    void printer(int []arr){
        int len =arr.length;
        for (int i=0;i<len;i++){
            System.out.print(arr[i]+"    ");
        }
        System.out.println();
    }

}