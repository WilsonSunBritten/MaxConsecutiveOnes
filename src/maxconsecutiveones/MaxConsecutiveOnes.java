/*
 * Given a binary array, find the maximum number of consecutive ones
 */
package maxconsecutiveones;

/**
 *
 * @author Wilson Britten
 */
public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] testArray = {0,0,1,1,1,0,1,1,0,1,1,1,1,0,0,1,0,0,1};
    }
    
    //Values may be assumed to only be ones and zeros.
    public static int findMaxConsecutiveOnes(int[] values){
        int currentMax = 0;
        int max = 0;
        for (int index = 0; index < values.length; index++) {
            currentMax = values[index] == 0 ?  0 : currentMax + 1;
            max = Math.max(max, currentMax);
        }
        return max;
    }
    
    /*Notes on solution: Very simple O(n) solution. I don't believe a 
    better O solution exists. Possible to cut execution short by checking the
    remaining length of the array against the current max to see if further 
    searching is worthwhile, but in many cases the extra conditional would take 
    more overall execution time than would be saved.
    
    */
}
