class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        res={}
        for i,j in enumerate(nums):
            required=target-j
            if required in res:
                return [res[required],i] 
            else:
                res[j]=i
                   
        
        