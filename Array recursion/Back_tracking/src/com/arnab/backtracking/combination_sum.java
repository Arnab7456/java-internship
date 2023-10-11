package com.arnab.backtracking;
import java.util.*;
public class combination_sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findcombination(0,candidates,target,ans, new ArrayList <>());
        return ans;

    }
    private void findcombination(int ind , int [] arr, int target , List<List<Integer>> ans , List<Integer>ds){
        if(ind == arr.length){
            if(target ==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findcombination(ind,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        findcombination(ind+1,arr,target,ans,ds);
    }
}
