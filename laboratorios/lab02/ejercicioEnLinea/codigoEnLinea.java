public class codigoEnLinea {

//EJERCICIOS ARRAY 2:
    public int countEvens(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                c++;
            }
        }
        return c;
    }

    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return max - min;
    }

    public int centeredAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
            sum += nums[i];
        }
        return ((sum - min) - max) / (nums.length - 2);
    }

    public int[] evenOdd(int[] nums) {
     int count = 0;
     int [] nums2 = new int[nums.length];
     for(int i = 0; i < nums.length; i++)
	 {
	     if(nums[i] % 2 == 0)
		 {
		     nums2[count] = nums[i];
		     count++;
		 }
	 }
     for(int j = 0; j < nums.length; j++)
	 {
	     if(nums[j] % 2 != 0)
		 {
		     nums2[count] = nums[j];
		     count++;
		 }
	 }
     return nums2;
    }
    


    public boolean sum28(int[] nums) {
	int sum = 0;
	for(int i = 0; i < nums.length; i++)
	    {
		if(nums[i] == 2)
		    {
			sum = sum + 2;
		    }
	    }
	if(sum == 8)return true;
	return false;
    }

    
//EJERCICIOS ARRAY 3:
    public int maxSpan(int[] nums) {
        int maxS = 0;
        int maxR = 0;
        int span = 1;
        for (int i = 0; i < nums.length; i++) {
            span = 1;
            maxR = 1;
            for (int j = i + 1; j < nums.length; j++) {
                span = span + 1;
                if (nums[i] == nums[j]) {
                    if (span > maxR) {
                        maxR = span;
                    }
                }
            }
            if (maxR > maxS) {
                maxS = maxR;
            }
        }
        return maxS;
    }
    

    public int[] fix34(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (int j = 1; j < nums.length; j++) {
                    if (nums[j] == 4 && nums[j - 1] != 3) {
                        temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }
    
    
    public int[] fix45(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 5) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4) {
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
        return nums;
    }

    
    public boolean canBalance(int[] nums) {
        for (int cS = 0; cS < nums.length; cS++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < cS; i++) {
                sum1 = sum1 + nums[i];
            }
            for (int j = cS; j < nums.length; j++) {
                sum2 = sum2 + nums[j];
            }
            if (sum1 == sum2) {
                return true;
            }
        }
        return false;
    }

    
    public boolean linearIn(int[] outer, int[] inner) {
        int contv = 0;
        for (int i = 0; i < inner.length; i++) {
            for (int j = 0; j < outer.length; j++) {
                if (outer[j] == inner[i]) {
                    contv++;
                    break;
                }
            }
        }
        return contv == inner.length;
    }   
    
}
