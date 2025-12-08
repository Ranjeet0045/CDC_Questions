import java.util.Arrays;
import java.util.Stack;

public class Aesteroid_collision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (stack.isEmpty()) {
                stack.push(asteroids[i]);
            } else {
                if (asteroids[i] < 0 && stack.peek() > 0) {
                    if (Math.abs(asteroids[i]) > Math.abs(stack.peek())) {
                        stack.pop();
                        i--; 
                    } else if (Math.abs(asteroids[i]) == Math.abs(stack.peek())) {
                        stack.pop();
                        
                    }
                } 
                else {
                    stack.push(asteroids[i]);
                }
            }
        }

        int[] ans = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        int[] ans = asteroidCollision(asteroids);
        System.out.println(Arrays.toString(ans));
    }
}
