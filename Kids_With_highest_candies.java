//1431
import java.util.*;
public class Kids_With_highest_candies {
    public static void main(String[] args) {
        int []candies={4,2,1,1,2};
        int extraCandies=1;
        Candycal cc= new Candycal();
        System.out.print(cc.kidsWithCandies(candies,extraCandies));
    }
}
class Candycal{
    List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> result = new ArrayList<Boolean>();
        int max=candies[0],i;
        for(i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(i=0;i<candies.length;i++){
            if(candies[i]>=(max-extraCandies)){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;

    }
}