//neetcode youtube and walkcc
//Time -0(sort), space-0(sort)
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0)
        return 0;

        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int currentEnd=intervals[0][1];
        int res=0;
        for(int i=1;i<intervals.length;i++){

            if(intervals[i][0]>=currentEnd){
                currentEnd=intervals[i][1];

            }else{
                res++;
            }

        }
    return res;
    
    }
}