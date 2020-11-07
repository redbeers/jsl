
public class Solution {

	public boolean solution(int x) {
      boolean answer = true;
      x=11;
      if(x<=10) {
    	 String num=Integer.toString(x);
    	 String[] nums = num.split("");
    	 int sum = Integer.parseInt(nums[0])+Integer.parseInt(nums[1]);
    	 if(sum % x != 0) 
    		 answer=false;
    	
      }
      
      return answer;
	}
}
