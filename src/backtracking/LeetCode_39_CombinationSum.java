package backtracking;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_39_CombinationSum {


	public static void main(String[] args) {
		List<List<Integer>> res = new ArrayList();
		int[] candidates = {2,3,6,7};
		int[] candidates1 = {2,3,5};
		//combinationSum(candidates, 7, res, 0, 0, new ArrayList<>());
		combinationSum(candidates1, 8, res, 0, 0, new ArrayList<>());
		
		System.out.println(res);

	}
	
	public static void combinationSum(int[] candidates, int target, List<List<Integer>> res, int start, int sum, List<Integer> curr) {
        if(start >= candidates.length) {
        	return;
        }
        if(sum == target) {
        	List<Integer> temp = new ArrayList();
        	for(int t : curr) {
        		temp.add(t);
        	}
        	res.add(temp);
        	return;
        }else if(sum > target) {
        	return;
        }else {
        	curr.add(candidates[start]);
        	combinationSum(candidates, target, res, start, sum + candidates[start], curr);
        	curr.remove(curr.size() - 1);
            
            combinationSum(candidates, target, res, start + 1, sum, curr);
        }
        
    }

}
