class Solution {
    public int climbStairs(int n) {

        int twostepbefore=1;
        int onestepbefore=2;

        if(n<=2){
            return n;
        }
        
        for(int i =3; i<=n; i++){
            int current = twostepbefore + onestepbefore;
            twostepbefore= onestepbefore;
            onestepbefore= current;
        }
        return onestepbefore;
    }
}
