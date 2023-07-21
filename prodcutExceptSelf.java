class prodcutExceptSelf{
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        product pro =new product();
        num=pro.productExceptSelf(num);
        System.out.println("Result");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+",  ");
        }
    }
}
class product{
    int [] productExceptSelf(int nums[]){
        int len=nums.length;
        int res[]=new int[len];
        int prefixProduct[]=new int[len];
        int suffixProduct[]=new int[len];
        int i=1,j=len-2;
        prefixProduct[0]=nums[0];
        suffixProduct[len-1]=nums[len-1];
        for(;i<len;i++,j--){
            prefixProduct[i]=prefixProduct[i-1]*nums[i];
            suffixProduct[j]=suffixProduct[j+1]*nums[j];
        }
        res[0]=suffixProduct[1];
        res[len-1]=prefixProduct[len-2];
        for(i=0;i<nums.length;i++){
            System.out.println(suffixProduct[i]+"    "+prefixProduct[i]);
        }
        for(i=1;i<len-1;i++){
            System.out.println(i+"     "+prefixProduct[i-1]+"    "+suffixProduct[i+1]);
            res[i]=prefixProduct[i-1]*suffixProduct[i+1];
        }
        return res;
    }
}