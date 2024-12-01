package leetcode;
import java.util.Arrays;
import java.util.Stack;
public class leetMethods {
    public int[] twoSum(int[] nums, int target){
        int[] arr = new int[10];
        arr = nums;
        int[] result = new int[2];
        boolean flag=false;

        for(int i= 0; i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]== target){
                    result[0]=i;
                    result[1]=j;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }

        return result;
    }

    public boolean isPalindrome(int x){
        Stack<Character> stk = new Stack<Character>();
        String str= String.valueOf(x);
        String revValue="";
        for(char ch : str.toCharArray()){
            stk.push(ch);
        }
        while(!stk.isEmpty()) {
            revValue = revValue + stk.pop();
        }
        if(String.valueOf(x).equals(revValue))
        {
            return true;
        }
        else{
            return false;
        }
        /*OR Using string Builder
        StringBuilder sb = new StringBuilder(""+ x);
        StringBuilder revsb = new StringBuilder(sb).reverse();
        if(sb.toString().equals(revsb.toString()))
            return true;
        return false;
         */

    }
    public int romanToInt(String s) {
        int sum=0;
        char ch2=' ';

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            if(s.length()-1!=i){
                ch2 = s.charAt(i+1);
            }

            if(ch == 'I'){
                if(ch2=='V'){
                    sum = sum + 4;
                    i++;
                }
                else if(ch2 =='X'){
                    sum = sum + 9;
                    i++;
                }
                else{
                    sum = sum + 1;
                }
            }
            else if(ch == 'X'){
                if(ch2=='L'){
                    sum = sum + 40;
                    i++;
                }
                else if(ch2 =='C'){
                    sum = sum + 90;
                    i++;
                }
                else{
                    sum = sum + 10;
                }
            }
            else if(ch == 'C'){
                if(ch2=='D'){
                    sum = sum + 400;
                    i++;
                }
                else if(ch2 =='M'){
                    sum = sum + 900;
                    i++;
                }
                else{
                    sum = sum + 100;
                }
            }
            else if(ch == 'V'){
                sum = sum + 5;
            }
            else if(ch == 'L'){
                sum = sum + 50;
            }
            else if(ch == 'D'){
                sum = sum + 500;
            }
            else if(ch == 'M'){
                sum = sum + 1000;
            }
        }
        return sum;
    }

    public String longestCommonPrefix(String[] strs) {
        /*String pref="";
        if(strs.length == 3) {
            String str1 = strs[0];
            String str2 = strs[1];
            String str3 = strs[2];

            char ch1, ch2, ch3;
            int strLength = strs[0].length();
            if (strLength > strs[1].length()) {
                strLength = strs[1].length();
            } else if (strLength > strs[2].length()) {
                strLength = strs[2].length();
            }

            for (int i = 0; i < strLength; i++) {
                ch1 = strs[0].charAt(i);
                ch2 = strs[1].charAt(i);
                ch3 = strs[2].charAt(i);
                if (ch1 == ch2 && ch2 == ch3) {
                    pref = pref + ch1;
                } else {
                    break;
                }

            }
        }

        return pref;*/

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; // Initialize prefix with the first string

        // Iterate through characters of the first string
        for(int i =0; i<prefix.length();i++){
            char c= prefix.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i == strs[j].length() || strs[j].charAt(i)!=c){
                    return prefix.substring(0,i);
                }
            }
        }
        return prefix;
    }

    public boolean isValid(String s){
        return true;
    }

    public int removeDuplicates(int[] nums){
       Stack<Integer> stack= new Stack<Integer>();
        //int arrSize = nums.length;
            for(int item: nums){
                if(!stack.contains(item)){
                    stack.push(item);
                }
            }

            for(int stk: stack) {
                System.out.println("Stack: "+stk);
            }

            int arrSize = stack.size();
            System.out.println("Array size: "+arrSize);
            int[] expectedNums = new int[arrSize];

            int i=0;
            for(int stk: stack){
                expectedNums[i] =stk;
                i++;
            }

         for(i=0;i< nums.length;i++){
             nums[i]=0;
         }

        for ( i = 0; i < arrSize; i++) {
            nums[i] = expectedNums[i];
        }

        /*int k = 1; // Initialize the second pointer
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) { // Check if current element is unique
                nums[k] = nums[i]; // Place it at the next position of unique elements
                k++; // Increment the unique elements count
            }
        }*/


           /* int k = arrSize;
        System.out.println("Array size: "+k+" Expected Length: "+expectedNums.length);
        //assert k == expectedNums.length;
        for (i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i] : "nums[i]: "+nums[i]+" expectedNums[i]: "+expectedNums[i];
        }
        System.out.println("rev array:"+ Arrays.toString(expectedNums));*/

        System.out.println("expectedNums:"+ Arrays.toString(expectedNums));
        System.out.println("nums:"+ Arrays.toString(nums));

        return arrSize;
    }

    public int removeElement(int[] nums, int val){

        return 2;
    }

}
