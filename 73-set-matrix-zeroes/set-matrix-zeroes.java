class Solution {
  // https://www.youtube.com/watch?v=dSxt3ZCbIqA&ab_channel=NikhilLohia
  // Time 0(mn) Space 0(1)

  public void setZeroes(int[][] matrix) {
  
      boolean firstRow=false;
      boolean firstCol=false;
      
      
      
      //outer matrix find and set 0 
      for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
              
              if(matrix[i][j]==0){
                  matrix[i][0]=0;
                  matrix[0][j]=0;
                  if(i==0) firstRow=true;
                  if(j==0) firstCol=true;
              }
          }
      }
        //inner matrix  
     for(int i=1;i<matrix.length;i++){
         for(int j=1;j<matrix[0].length;j++){
          if(matrix[i][0]==0||matrix[0][j]==0){
              
              matrix[i][j]=0;
          }
             
         }
     }
         if(firstRow){
             for(int j=0;j<matrix[0].length;j++)
                 matrix[0][j]=0;
         }
         
         if(firstCol){
             for(int i=0;i<matrix.length;i++)
                 matrix[i][0]=0;
             
         }
     }
    
}
