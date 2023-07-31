package week2.day2;

public class ContainsNearbyDuplicate {

	public static boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length && j<=i+k;j++)
            {
                if(nums[j]==nums[i])
                    return true;
            }
        return false;
    }
    
    public static void main(String args[])
    {
         int[] nums={1,0,1,1};
        int k=1;
        System.out.println(containsNearbyDuplicate(nums,k) );
    }
}
