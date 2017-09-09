public class codigoEnLinea {

//EJERCICIOS ARRAY 2:
    public int countEvens(int[] nums) {
        int c = 0;//C1
        for (int i = 0; i < nums.length; i++) {//C2 + C3*n
            if (nums[i] % 2 == 0) {//C4*n
                c++;
            }
        }
        return c;//C5
    }
    
/**
 * Complejidad:
 * T(n) = C1 + C2 + C3*n + C4*n + C5
 * T(n) = C + (C3+C5)*n
 * T(n) es O(n)
 */

    public int bigDiff(int[] nums) {
        int max = nums[0];//C1
        int min = nums[0];//C2
        for (int i = 0; i < nums.length; i++) {//C3 + C4*n
            max = Math.max(max, nums[i]);//C5*n
            min = Math.min(min, nums[i]);//C6*n
        }
        return max - min;//C7
    }

/**
 * Complejidad:
 * T(n) = C1 + C2 + C3*n + C4*n+C5*n + C7
 * T(n) = C + (C3+C4+C5)*n
 * T(n) es O(n)
 */

    public int centeredAverage(int[] nums) {
        int max = nums[0];//C1
        int min = nums[0];//C2
        int sum = 0;//C3
        for (int i = 0; i < nums.length; i++) {//C4 + C5*n
            max = Math.max(max, nums[i]);//C6*n
            min = Math.min(min, nums[i]);//C7*n
            sum += nums[i];//C8*n
        }
        return ((sum - min) - max) / (nums.length - 2);//C9
    }
    
/**
 * Complejidad:
 * T(n) = C1 + C2 + C3 + C4 + C5*n + C6*n + C7*n + C8*n + C9
 * T(n) = C + (C5+C6+C7+C8)*n
 * T(n) es O(n)
 */

    
//EJERCICIOS ARRAY 3:
    public int maxSpan(int[] nums) {
        int maxS = 0;//}
        int maxR = 0;// }C1
        int span = 1;//}
        for (int i = 0; i < nums.length; i++) {//C2 + C3*n
            span = 1;//C4*n
            maxR = 1;//C5*n
            for (int j = i + 1; j < nums.length; j++) {//C6*n + C7*n*(n-(i+1))
                span = span + 1;//C8*n*(n-(i+1))
                if (nums[i] == nums[j]) {//C9*n*(n-(i+1))
                    if (span > maxR) {
                        maxR = span;
                    }
                }
            }
            if (maxR > maxS) {//C10*n*(n-(i+1))
                maxS = maxR;
            }
        }
        return maxS;//C11
    }
    
/**
 * Complejidad:
 * T(n) = C1 + C2 + C3*n + C4*n + C5*n + C6*n + C7*n*(n-(i+1)) + C8*n*(n-(i+1)) + C9 
 * + C10*n*(n-(i+1)) + C11
 * T(n) = C + C3*n + C4*n + C5*n + C6*n + C7*n*(n-(i+1)) + C8*n*(n-(i+1)) + C10*n*(n-(i+1))
 * T(n) = C + C(n) + C(n)(n-(i+1))
 * T(n) = C + C(n) + Cn**2 -Cn*i - Cn
 * Sabemos que i <= n, luego
 * T(n) es O(n**2)
 */

    public int[] fix34(int[] nums) {
        int temp = 0;//C1
        for (int i = 0; i < nums.length; i++) {//C2 + C3*n
            if (nums[i] == 3) {//C4*n
                for (int j = 1; j < nums.length; j++) {//C5*n + C6*n*(n-1)
                    if (nums[j] == 4 && nums[j - 1] != 3) {//C7*n*(n-1)
                        temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;//C8
    }
    
/**
 * Complejidad:
 * T(n) = C1 + C2 + C3*n + C4*n + C5*n + C6*n*(n-1) + C7*n*(n-1) + C8
 * T(n) = C + C4*n + C5*n + C6*n*(n-1) + C7*n*(n-1)
 * T(n) = C + C(n) + C(n)(n-1)
 * T(n) = C + C(n) + Cn**2 -C(n)
 * T(n) es O(n**2)
 */
    
    public int[] fix45(int[] nums) {
        int temp = 0;//C1
        for (int i = 0; i < nums.length; i++) {//C2 + C3*n
            if (nums[i] == 5) {//C4*n
                for (int j = 0; j < nums.length; j++) {//C5*n + C6*n*n
                    if (nums[j] == 4) {//C7*n*n
                        if (j + 1 < nums.length) {
                            temp = nums[j + 1];
                        }
                        if (temp != 5) {
                            temp = nums[j + 1];
                            nums[j + 1] = nums[i];
                            nums[i] = temp;
                            break;
                        }
                    }
                }
            }
        }
        return nums;//C8
    }
    
/**
 * Complejidad:
 * T(n) = C1 + C2 + C3*n + C4*n + C5*n + C6*n*n + C7*n*n + C8
 * T(n) = C + C3*n + C4*n + C5*n + C6*n*n + C7*n*n
 * T(n) = C + C*n + C*n*n
 * T(n) = C + C*n + Cn**2
 * T(n) es O(n**2)
 */
    
    public boolean canBalance(int[] nums) {
        for (int cS = 0; cS < nums.length; cS++) {//C1 * C2*n
            int sum1 = 0;//C3*n
            int sum2 = 0;//C4*n
            for (int i = 0; i < cS; i++) {//C5*n + C6*n*m
                sum1 = sum1 + nums[i];
            }
            for (int j = cS; j < nums.length; j++) {//C7*n + C8*n*k
                sum2 = sum2 + nums[j];
            }
            if (sum1 == sum2) {//C9*n
                return true;
            }
        }
        return false;//C10
    }
    
/**
 * Complejidad:
 * T(n) = C1 + C2*n + C3*n + C4*n + C5*n + C6*n*m + C7*n + C8*n*k + C9*n + C10
 * T(n) = C + C*n + C6*n*m + C8*n*k
 * Supongamos que m+k = n/2, luego
 * T(n) = C + C*n + C*n*(n/2)
 * T(n) = C + C*n + C(n**2)/2
 * T(n) es O(n**2)
 */
    
    public boolean linearIn(int[] outer, int[] inner) {
        int contv = 0;//C1
        for (int i = 0; i < inner.length; i++) {//C2 + C3*n
            for (int j = 0; j < outer.length; j++) {//C4*n + C5*n*m
                if (outer[j] == inner[i]) {//C6*n*m
                    contv++;
                    break;
                }
            }
        }
        return contv == inner.length;//C7
    }

/**
 * Complejidad:
 * T(n) = C1 + C2 + C3*n + C4*n + C5**n*m + C6*n*m + C7
 * T(n) = C + C3*n + C4*n + C5*n*m + C6*n*m
 * T(n) = C + C*n + C*n*m
 * T(n) = C + C*n + C*n*m
 * T(n) es O(n*m)
 */   
    
}
