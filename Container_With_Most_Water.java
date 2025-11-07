class Solution {
    public int maxArea(int[] height) {
       int n=height.length;
       int l=0,r=n-1;
       int res=0,v;
       while(l!=r){
        if(height[l]==height[r]){
            v=(r-l) * height[r];
            if(height[l+1]>height[r-1]) r--;
            else l++;
        }
        else if(height[l]>height[r]){
            v=(r-l) * height[r--];
        }
        else{
            v=(r-l) * height[l++];
        }
        res = Math.max(res,v);
       }
       return res;
    }
}
