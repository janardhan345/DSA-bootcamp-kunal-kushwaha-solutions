# Solution for permutation Array


- we create an array called temp which stores the answer.
- the method buildArray returns a permutation Array by this logic =>

```java
int[] temp = new int[nums.length];
for(int i =0;i<nums.length;i++){
    temp[i] = nums[nums[i]];
        }
return temp;
```
