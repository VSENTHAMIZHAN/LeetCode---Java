package LeetCode;
import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //creating an array list

        Arrays.sort(nums);
        //sorting the array

        //  i pointer from 0th index to before last 2 elements
        for(int i =0; i < nums.length -2 ; i++){
            // start and end pointer for the 2 sum
            int start =i+1;
            int end = nums.length -1;

            // checking element it came across is same then skip it
            if( i > 0 && nums[i ]== nums[i-1]){
                continue;
            }

            // start will not exceed end
            while( start < end){
                int sum = nums[i] + nums[start ]+ nums[end];
                //this is the sum it should be 0 to return the answer

                // it gets into this when sum is 0
                if(sum ==0){
                    //add this triplet to the ArrayList
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    // move front to next element
                    start++;
                    //move back from last element to check another triplet exist
                    end--;

                    //skipping duplicates for start, end pointer
                    // checks before element it came across start -----> end
                    while(start < end && nums[start ] == nums[start -1]){
                        start ++;
                    }
                    // check after element as it comes from end to start start <----- end
                    while(start < end && nums[end] == nums[end +1]){
                        end--;
                    }
                }
                //other edge cases for sum <0 or sum >0
                else if(sum <0){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return result;
    }
}
