class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {//input 1100110
        int max =0;// this count the max consecutive of ones
        int count =0;// this count the ones
        for(int i=0;i<nums.length;i++){//go through the nums
            if(nums[i] == 1){//if equal to 1 to count to 2
                count++;
                if(count > max){// here put it in max so 2 in max
                    max = count;
                }
            }else{//else there is a zero is going break the streak and reset to zero
                count =0;
            }
        }
        return max;// here it return the max streak which is 2
    }
}
