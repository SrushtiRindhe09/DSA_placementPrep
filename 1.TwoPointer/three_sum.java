/*leetcode 15
# 3Sum – LeetCode 15

**Pattern:** Two Pointers + Sorting  
**Difficulty:** Medium  
**Language:** Java

## 1. Problem Understanding

Given an integer array `nums`, find all unique triplets whose sum is equal to `0`.

**Example:**

Input:
```java
nums = [-1, 0, 1, 2, -1, -4]
```

Output:
```java
[[-1, -1, 2], [-1, 0, 1]]
```

Explanation:
- `-1 + (-1) + 2 = 0`
- `-1 + 0 + 1 = 0`

We must return only unique triplets. We should not repeat the same combination.

## 2. Main Logic – How Does 3Sum Work?

We use three pointers:
- `i` – Fixed pointer.
- `left` – Starts just after `i`.
- `right` – Starts from the last index.

### Step 1: Sort the Array

First, sort the array using:

```java
Arrays.sort(nums);
```

Sorted array:
```java
[-4, -1, -1, 0, 1, 2]
```

**Why sorting?**

Sorting helps us decide which pointer to move depending on the sum.

### Step 2: Fix One Element

Use a `for` loop to select one element at a time.

```java
for (int i = 0; i < nums.length - 2; i++)
```

We keep `nums[i]` fixed and find two other numbers that make the total sum zero.

### Step 3: Initialize Two Pointers

```java
int left = i + 1;
int right = nums.length - 1;
```

- `left` starts immediately after the fixed element.
- `right` starts from the end of the array.

### Step 4: Calculate the Sum

```java
int sum = nums[i] + nums[left] + nums[right];
```

Now check three conditions:

| Condition | What to do? | Why? |
|---|---|---|
| `sum == 0` | Store the triplet | We found the required combination |
| `sum < 0` | `left++` | Sum is too small; we need a bigger number |
| `sum > 0` | `right--` | Sum is too large; we need a smaller number |

### Step 5: Handle Duplicate Elements

This is an important part of 3Sum.

**A. Skip duplicate fixed elements:**

```java
if (i > 0 && nums[i] == nums[i - 1]) {
    continue;
}
```

If the current fixed element is the same as the previous one, skip it to avoid generating duplicate triplets.

**B. Skip duplicate left elements:**

```java
while (left < right && nums[left] == nums[left - 1]) {
    left++;
}
```

**C. Skip duplicate right elements:**

```java
while (left < right && nums[right] == nums[right + 1]) {
    right--;
}
```

These conditions ensure that each unique triplet is added only once.

## 3. Complete Algorithm in Simple Steps

1. Sort the given array.
2. Start a `for` loop to select the fixed element `i`.
3. Skip the fixed element if it is a duplicate.
4. Initialize `left = i + 1` and `right = nums.length - 1`.
5. Run a `while (left < right)` loop.
6. Calculate the sum of all three elements.
7. If sum is zero, store the triplet and move both pointers.
8. Skip duplicate left and right values.
9. If sum is less than zero, move `left` forward.
10. If sum is greater than zero, move `right` backward.
11. Return the list of unique triplets.

## 4. Important Things to Remember

- Sorting is necessary for this two-pointer approach.
- One pointer stays fixed, while two pointers move.
- If the sum is too small, move left.
- If the sum is too large, move right.
- Always handle duplicates to avoid repeated triplets.

## 5. Time and Space Complexity

**Time Complexity: O(n²)**

- Sorting takes O(n log n).
- The outer loop runs approximately n times.
- The two-pointer loop takes O(n) per iteration.
- Overall complexity is O(n²).

**Auxiliary Space Complexity:** O(1) for the two-pointer variables, excluding sorting implementation and output storage.

## 6. Pattern Recognition

Whenever a problem asks you to:
- Find three numbers whose sum equals a target.
- Find unique triplets.
- Find combinations in a sorted array.

Think about using:

**Sorting + Fixed Pointer + Two Pointers**

This is the main idea behind the 3Sum problem.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum {
    
    public List<List<Integer>> threeSum(int[] nums) 
    {
         List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate fixed elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(
                        nums[i], nums[left], nums[right]
                    ));

                    left++;
                    right--;

                    // Skip duplicate left elements
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right elements
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }
                }

                else if (sum < 0) {
                    left++;
                }

                else {
                    right--;
                }
            }
        }

        return result;
    }
}
    


