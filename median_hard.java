import java.util.Scanner;
public class median_hard {
    public static void main(String[] args) {
        input in=new input();
        Scanner sc=new Scanner(System.in);
        //int len1=sc.nextInt();
        // //System.out.println("Scanning int");
        // int num1[] =new int[len1];
        // num1=in.scan(num1);
        // in.printer(num1);
        // int len2=sc.nextInt();
        // int num2[]=new int[len2];
        // in.scan(num2);
        // in.printer(num2);
        int num1[]={};
        int num2[]={2,3};
        median md=new median();
        System.out.println(md.medianCalculator(num1,num2));

    }
    
}
class median{
    double medianCalculator(int []nums1, int []nums2){
        ////System.out.println("In Function");
        int len1=nums1.length;
        int len2=nums2.length;
        boolean isOdd=true,isFirst=true;
        double medLeft=0,medRight=0,median=0;
        int med,medCounter=0,i=0,j=0;
        if((len1+len2)%2==0){   isOdd=false;   }
        //System.out.println(isOdd+"   isOdd flag value");
        med=(len1+len2+1)/2;
        //System.out.println(med+"   is med value");

        for(;i<len1 && j<len2;){

            if(nums1[i]<nums2[j]){
                medCounter++;
                //System.out.println(medCounter+"   is medCount value");
                i++;
                isFirst=true;
            }
            else{
                medCounter++;
                //System.out.println(medCounter+"  is medCount value in else");
                j++;
                isFirst=false;
            }
            if(medCounter==med){
                if(isFirst==true){ 
                    medLeft=nums1[i-1];
                }
                else{
                    medLeft=nums2[j-1];
                }
                if(isOdd==false){
                    if((i<len1)&&(j<len2)){
                        if(nums1[i]<nums2[j]){
                            medRight=nums1[i];
                            //System.out.println(medRight+"   is med value");
                        }else{
                            medRight=nums2[j];
                        }
                    }else if(i>=len1){
                        medRight=nums2[j];
                    }
                    else{
                        medRight=nums1[i];
                    }
                    median=(medLeft+medRight)/2;
                }else {
                    median=medLeft;
                }
                return median;
            }
        }
        int k,num[],len;
        if(i>=len1){
            k=j;
            num=nums2;
            len=len2;
            //System.out.println("In if loop");
        }
        else{
            k=i;
            num=nums1;
            len=len1;
            //System.out.println("In if else");
        }
        //System.out.println(k+"  k "+med+"  med "+medCounter+" medCounter  ");
        medLeft=num[k+med-medCounter];
        if(isOdd==false){
            medRight=num[k+med-medCounter-1];
            median=(medLeft+medRight)/2;
        }
        else {
            median=medLeft;
        }

        return median;
    }
}
    




// for all program inpunt and printer function
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
        //System.out.println(arr.length);
        for (int i=0;i<len;i++){
            //System.out.print(arr[i]+"    ");
        }
        //System.out.println();
    }

}
