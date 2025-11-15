package Greedy;

public class Lemonade_change {

    public static boolean lemonadeChange(int[] bills) {
        int count5 = 0;
        int count10 = 0;

        for(int i=0; i<bills.length; i++){
            if(bills[i] == 5) {
                count5++;
            }
            else if(bills[i] == 10){
                if(count5 == 0) return false;
                else{
                    count5--;
                    count10++;
                }
                
            }
            else{
                if(count10 != 0 && count5 != 0){
                    count10--;
                    count5--;
                }
                else if(count10 == 0 && count5 >= 3){
                    count5 = count5 - 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] bills = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        boolean ans = lemonadeChange(bills);
        System.out.println(ans);
    }
}
