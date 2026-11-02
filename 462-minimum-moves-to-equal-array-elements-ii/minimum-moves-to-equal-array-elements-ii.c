int minMoves2(int* nums, int numsSize) {
 for(int i=0;i<numsSize-1;i++)
 {
    for(int j=0;j<numsSize-i-1;j++)
    {
         if(nums[j]>nums[j+1])
         {
            int temp=nums[j];
            nums[j]=nums[j+1];
            nums[j+1]=temp;
         }
    }
 }
 int m=nums[numsSize/2];
 int move=0;
 for(int i=0;i<numsSize;i++)
 {
    move+=abs(nums[i]-m);
 }
 return move;
}