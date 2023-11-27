package multipleOf3or5;

public class Solution {
    public int solution(int num) {
     return recur(1,num,0);
    }

    private int recur (int num,int target,int sum){
        if(num >= target) return sum;
        return recur(num + 1,target, num % 3 == 0 || num % 5 == 0 ? sum + num : sum);
    }
}
