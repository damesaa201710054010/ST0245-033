public class Recursion2 {

//Metodo groupSum6, count6 y groumpSum tomado de: https://codingbatanswers.wordpress.com/recursion-2/
    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) {//C1
            return (target == 0);
        }

        int diff = target - (6 * count6(start, nums));//C2 + C3 + m
        if (groupSum(start, nums, diff)) {//C4 + 2**n
            return true;
        }
        return false;

    }
    
    /** 
     * Complejidad:
     * T(n) = C1 + C2 +C3 + m + 2**n
     * T(n) = C + n + 2**n
     * luego T(n) es O(2**n)
     */

    public int count6(int start, int[] nums) {
        int count = 0;//C1
        if (nums[start] == 6) {//C2
            count++;
            nums[start] = 0;
        }
        if (start + 1 < nums.length) {//C3
            count += count6(start + 1, nums);//C4 + T(n-1)
        }
        return count;//C5
    }
    
/**
 * Complejidad
 * T(n) = C1+ C2 + C3 + C4 + T(n-1) + C5
 * T(n) = C + T(n-1)
 * Luego T(n) es O(n)
 */

//this one (below) is the solution to groupSum but include it
//in groupSum6
    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) {//C1
            return (target == 0);//C2
        }
        if (groupSum(start + 1, nums, target - nums[start])) {//C3+T(n-1)
            return true;//C4
        }
        if (groupSum(start + 1, nums, target)) {//C5+T(n-1)
            return true;//C6
        }
        return false;
    }

    /**
     * Complejidad 
     * T(n) = C1+C3+C5+2[T(n-1)] 
     * T(n) = C+2[T(n-1)] 
     * luego T(n) es O(2**n)
     */
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {//C1
            return target == 0;//C2
        }
        return groupNoAdj(start + 1, nums, target) || groupNoAdj(start + 2, nums, target - nums[start]);//2[T(n-1)]
    }
    
    /**
     * Complejidad 
     * T(n) = C1+2[T(n-1)] 
     * luego T(n) es O(n)
     */

    public static void main(String[] args) {
    }

}
