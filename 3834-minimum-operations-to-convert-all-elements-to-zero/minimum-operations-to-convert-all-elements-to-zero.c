int minOperations(int* nums, int numsSize) {
    int stack[numsSize];
    int top=-1;
    int ans=0;
    for(int i=0;i<numsSize;i++)
    {
        int x=nums[i];
        while(top>=0 && stack[top]>x)
        {
            top--;
            ans++;
        }
        if(x!=0&&(top==-1|| stack[top]!=x))
        {
            stack[++top]=x;
        }
    }
    ans+=top+1;
    return ans;
}