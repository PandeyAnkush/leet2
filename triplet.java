public class triplet {
    public static void main(String[] args) {
        int nums[]={6,7,1,2}; //{1,2,3,4,5};   //[5,4,3,2,1]   ,   [2,1,5,0,4,6]
        increasingTriplet it=new increasingTriplet();
        System.out.println(it.increasingTriplet(nums));
    }
}
class increasingTriplet{
     boolean increasingTriplet(int[] nums) {
        boolean flag=false;
        int len=nums.length;
        int min[]=new int[len];
        int max[]=new int[len];
        int tempMax= Integer.MIN_VALUE ,tempMin=Integer.MAX_VALUE;
        min[0]=tempMin;
        max[len-1]=tempMax;
        for(int i=1,j=len-2;i<len;i++,j--){
            if(nums[i-1]<min[i-1]){
                min[i]=nums[i-1];
                tempMin=nums[i-1];
            }
            else{
                min[i]=tempMin;
            }
            if(nums[j+1]>max[j+1]){
                max[j]=nums[j+1];
                tempMax=nums[j+1];
            }
            else{
                max[j]=tempMax;
            }
        }
        
        // for(int i=0;i<len;i++){
        //     System.out.println(i+"   "+min[i]+"   "+"   "+max[i]);
            
        // }
        for(int i=0;i<len;i++){
            System.out.println(i+"    "+min[i]+"   "+nums[i]+"   "+max[i]);
            if((min[i]<nums[i])&&(nums[i]<max[i])){
                flag=true;
                break;
            }
        }

        return flag;
    }
}
