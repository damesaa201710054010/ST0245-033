    public class Recursion2 {
    //Ejercicio 1:
    //Para los metodos de groupSum6, count6, splitArray, totalSum y los dos metodos de groupSum
    //Tomados de:
    //Coding Bat Answers (Desconocida) Recursion-2 (Desconocida)[Source code].
    //https://codingbatanswers.wordpress.com/recursion-2/
    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return (target == 0);
        }
    
        int diff = target - (6 * count6(start, nums));
        if (groupSum(start, nums, diff)) {
            return true;
        }
        return false;
    
    }

    public int count6(int start, int[] nums) {
        int count = 0;
        if (nums[start] == 6) {
            count++;
            nums[start] = 0;
        }
        if (start + 1 < nums.length) {
            count += count6(start + 1, nums);
        }
        return count;
    }
    
    
    //Ejercicio 2:
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {//C1
            return target == 0;//C2
        }
        return groupNoAdj(start + 1, nums, target) || groupNoAdj(start + 2, nums, target - nums[start]);//2[T(n-1)]
    }
    
    //Ejercicio 3:
    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return (target == 0);
        }
    
        int cin = target - (countM5(start, nums));
        if (groupSum(start, nums, cin)) {
            return true;
        }
        return false;
    
    }
    
    public int countM5(int start, int[] nums) {
        int count = 0;
        if (nums[start]%5 == 0) {
            count+=nums[start];
            nums[start] = 0;
            if (start + 1 < nums.length) {
                  if (nums[start+1] == 1) {
                        nums[start+1] = 0;
                  }
              
            }
        }
        if (start + 1 < nums.length) {
            count += countM5(start + 1, nums);
        }
        return count;
    }
 
    //Ejercicio 4
    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return (target == 0);
        }
        tomarRep(start, nums, target);
        System.out.println(target);
    
        if (groupSum(start, nums, target)) {
            return true;
        }
        return false;
    
    }

    public int tomarRep(int start, int[] nums, int target) {
        int cont = 0;
        boolean hayR = false;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                if (nums[i + 1] == nums[i]) {
                    cont += nums[i];
                    nums[i] = 0;
                    hayR = true;
                    System.out.println("tomando: " + nums[i]);
                } else if (hayR) {
                    nums[i] = cont + nums[i];
                    System.out.println("Contador: " + cont);
                    hayR = false;
                    cont = 0;
                    System.out.println("tomando: " + nums[i]);
                }
            }
        }
        return cont;
    }
 
    //Ejercicio 5:
    public boolean splitArray(int[] nums) {
    if(nums.length == 1)
      return false;
    if(nums.length == 0)
      return true;
    int total = totalSum(nums , nums.length);
    if(total % 2 == 0)
    {
      if(groupSum(0, nums.length, nums, total/2))
         return true;
    }
    return false;
    
    }
 
    public int totalSum(int [] nums, int n)
    {
    if (n == 1)
        return nums[0];
    else
        return totalSum(nums, n-1) + nums[n-1];
    }
    
    //Funciones que sirve para los ejercicios
    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return (target == 0);
        }
        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }
        if (groupSum(start + 1, nums, target)) {
            return true;
        }
        return false;
    }

	//Esta funcion solo sirve de auxiliar para el metodo splitArray
    public boolean groupSum(int start, int end, int[] nums, int target) {
    if (start >= end)
     if(target == 0)
        return true;
     else return false;
    if (groupSum(start + 1, end, nums, target - nums[start])) return true;
    if (groupSum(start + 1, end, nums, target)) return true;
    return false;
    
    } 
}
