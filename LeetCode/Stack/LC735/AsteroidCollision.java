package LeetCode.Stack.LC735;

import java.util.Stack;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int x : asteroids) {
            if (x > 0) {
                // asteroid going in right direction, let it simply go
                st.push(x);
            } else {
                x = x * -1;
                // this asteroid going in left direction, if there are any previous asteriods
                // going right direction, collision happens
                while (!st.isEmpty()) {
                    if (st.peek() < 0) {
                        // if prev is neg, then prev is also going in left direction,
                        // so no collision happens as curr is also moving in left direction
                        break;
                    } else if (x == st.peek()) {
                        st.pop();
                        x = -1;
                        break;
                    } else if (st.peek() < x) {
                        st.pop();
                    } else if (x < st.peek()) {
                        x = -1;
                        break;
                    }
                }

                if (x != -1)
                    st.push(-x);

            }
        }

        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}