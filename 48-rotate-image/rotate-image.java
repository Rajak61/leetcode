class Solution {
    public void rotate(int[][] matrix) {
        //Theory -https://www.youtube.com/watch?v=Ux058jpRB9Y&ab_channel=NikhilLohia
        //https://www.youtube.com/watch?v=SA867FvqHrM&ab_channel=NickWhite
        //Time 0(n2),space 0(1)
        
        int n=matrix.length;
        
        //transpose
        for(int i=0;i <n;i++){
            for(int j=i;j<n;j++){
                
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
            
        }
        
        //reverse by dividng row 2
        for(int i=0;i<n;i++){
            for(int j=0;j<(n/2);j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }
}