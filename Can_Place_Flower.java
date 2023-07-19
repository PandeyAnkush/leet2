//605 Can Place Flowers
public class Can_Place_Flower {
    public static void main(String[] args) {
        int []flowerbed = {0,0,1,0,1};
        int n = 1;
        PlaceFlower cf =new PlaceFlower();
        System.out.println(cf.canPlaceFlowers(flowerbed,n));
    }
}
class PlaceFlower{
    public boolean canPlaceFlowers(int[] flowerbed, int n){
        Boolean flag=true;
        int len=flowerbed.length,count=0;
        if(len<n){return false;}
        if(len==1){if(flowerbed[0]==0)return true; else return false;}
        for(int i=1;i<len-1;i++){
            if((flowerbed[i-1]!=1)&&(flowerbed[i+1]!=1)&&(flowerbed[i]==0)){
                flowerbed[i]=1;
                count++;
                System.out.println(count+"  "+i);
            }
        }
        //boundaery cases
        if(flowerbed[0]==0 && flowerbed[1]==0){count++;}
        if(flowerbed[len-1]==0 && flowerbed[len-2]==0){count++;}
        if(count<n){return false;}
        return flag;
    }
}
