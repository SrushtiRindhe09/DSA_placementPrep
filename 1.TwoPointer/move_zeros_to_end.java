/*# LeetCode 283 – Move Zeroes

**Difficulty:** Easy  
**Pattern:** Two Pointers  
**Language:** Java

## 1. Problem Understanding

Given an integer array `nums`, move all zeroes to the end of the array while maintaining the relative order of all non-zero elements.

We must modify the original array **in-place**, without creating another array.

**Example:**

```java
Input:  [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]
```

The order of non-zero elements (1, 3, 12) must remain unchanged.

## 2. Approach – Two Pointers

We use two pointers, `i` and `j`, to solve this problem efficiently.

- **Pointer `i` (Scanning Pointer):** Travels through the entire array and checks every element.
- **Pointer `j` (Placement Pointer):** Tracks the position where the next non-zero element should be placed.

Initially:

```java
int i = 0;
int j = 0;
```

Both pointers start at index 0.

## 3. Logic Behind the Solution

1. Traverse the array using pointer `i`.
2. Check whether the current element `nums[i]` is non-zero.
3. If it is non-zero:
   - Swap `nums[i]` with `nums[j]`.
   - Increment `j` because the next non-zero element should go to the next position.
4. Increment `i` in every iteration.
5. Continue until `i` reaches the end of the array.

**Important pointer movement:**

- If the current element is zero → increment only `i`.
- If the current element is non-zero → swap, then increment both `i` and `j`.

## 4. Java Code

```java
class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0;
        int j = 0;

        while (i < nums.length) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }

            i++;
        }
    }
}
```

## 5. Dry Run

**Input:** `[0, 1, 0, 3, 12]`

| Step | i | j | Action | Array |
|---|---:|---:|---|---|
| Initial | 0 | 0 | Start | [0,1,0,3,12] |
| 1 | 0 | 0 | Zero, skip | [0,1,0,3,12] |
| 2 | 1 | 0 | Swap 1 and 0 | [1,0,0,3,12] |
| 3 | 2 | 1 | Zero, skip | [1,0,0,3,12] |
| 4 | 3 | 1 | Swap 3 and 0 | [1,3,0,0,12] |
| 5 | 4 | 2 | Swap 12 and 0 | [1,3,12,0,0] |

**Final Output:** `[1, 3, 12, 0, 0]`

## 6. Why Does This Approach Work?

The placement pointer `j` always indicates the next available position for a non-zero element.

Every time we find a non-zero element, we move it to position `j` and increment `j`.

This ensures:

- All non-zero elements come first.
- Their original relative order is maintained.
- All zeroes move to the end.
- The original array is modified without using another array.

## 7. Complexity Analysis

| Complexity | Value | Explanation |
|---|---|---|
| Time | O(n) | Each array element is visited once. |
| Space | O(1) | Only two pointers and one temporary variable are used. |

This is an efficient in-place solution.

## 8. Important Points to Remember

- Use `nums[i] != 0` to check for non-zero elements.
- `i` scans every element.
- `j` tracks the next position for a non-zero element.
- Increment `i` in every iteration.
- Increment `j` only after finding and placing a non-zero element.
- Do not use `j--`; the placement pointer always moves forward.
- Maintain the relative order of non-zero elements.

## 9. Pattern Recognition – When to Use Two Pointers?

This approach is useful when:

- You need to rearrange elements in an array.
- You need to move specific elements to one side.
- You need to maintain the relative order of selected elements.
- You want an in-place solution with O(1) extra space.

## 10. One-Line Revision

**Use one pointer to scan the array and another to place non-zero elements in their correct positions. Swap when a non-zero element is found, and move all zeroes to the end.** */



public class move_zeros_to_end 
{
  public void moveZeroes(int[] nums) 
    {
        int i = 0;
        int j = 0;
        while (i<nums.length)
        {
            if (nums[i]!=0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                 

            }
            else
            {
                i++;
            }
        }
    }  
}
