
import java.util.Arrays;
import java.util.Stack;

public class Smaller_on_left {

    //Will give TLE for larger input:

    public static int[] Smallestonleft(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];

        ans[0] = -1;

        for(int i=1; i<n; i++){
            int num = arr[i];
            int j = 0;
            while(j < i){
                if(arr[j]<num && stack.isEmpty()){
                    stack.push(arr[j]);
                }
                else if(arr[j]<num && !stack.isEmpty()){
                    if(arr[j]>stack.peek()){
                        stack.pop();
                        stack.push(arr[j]);
                    }
                }
                j++;
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = stack.pop();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = {3,5,4,2,2,5,5,4,2,5};
        int[] ans = Smallestonleft(arr,n);
        System.out.println(Arrays.toString(ans));
    }
}
