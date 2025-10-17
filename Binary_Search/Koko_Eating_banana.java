package Binary_Search;

public class Koko_Eating_banana {

    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int left = 1;
        int right = piles[0];
        for(int i=1; i<n; i++){
            if(piles[i] > right){
                right = piles[i];
            }
        }

        while(left < right){
            int mid = left + (right - left)/2;
            if(canEat(h,mid,piles)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }

        return Math.min(left,right);
    }
    public static boolean canEat(int h,int mid,int[] piles){
        int count = 0;
        for(int i=0; i<piles.length; i++){
            count += (piles[i] + mid -1)/mid;
        }
        return count <= h;
    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;

        int ans = minEatingSpeed(piles,h);
        System.out.println(ans);
    }
}
