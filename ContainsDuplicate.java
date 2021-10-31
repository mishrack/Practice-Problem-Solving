//Contains Duplicate
import java.util.Arrays;
class ContainsDuplicate
{
	public static boolean checkDuplicates(int[] arr)
	{
		boolean duplicate = false ;
		Arrays.sort(arr) ;
		for(int i = 0 ; i < arr.length-1 ; i++)
		{
			if(arr[i] == arr[i+1])
				duplicate = true ;
			else 
				duplicate = false ;
		}
		return duplicate ;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,7,7} ;
		
		System.out.print("Contains duplicate : " + checkDuplicates(arr)) ;
	}
}