class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> ret=  new ArrayList<Integer>();
    if(matrix.length==0 || matrix[0].length==0) return ret;
    int b = matrix.length-1, r = matrix[0].length-1, t=0,l=0;
    while(t<=b && l<=r){
      for(int j=l;j<=r;j++)
        ret.add(matrix[t][j]);
      t++;
      for(int i=t;i<=b;i++)
        ret.add(matrix[i][r]);
      r--;
      for(int j=r;j>=l && t<=b;j--)
        ret.add(matrix[b][j]);
      b--;
      for(int i=b;i>=t && l<=r;i--)
        ret.add(matrix[i][l]);
      l++;
    }
    return ret;
    }
}
