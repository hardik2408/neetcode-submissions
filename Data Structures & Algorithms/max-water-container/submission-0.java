class Solution {
    public int maxArea(int[] height) {
        Integer i = 0;
        Integer j = height.length - 1;
        Integer maxA = 0;

        while (i < j) {
            if (height[i] < height[j]) {
                maxA = Math.max(maxA, (j-i) * height[i]);
                i++;
            } else if (height[i] > height[j]) {
                maxA = Math.max(maxA, height[j] * (j-i));
                j--;
            } else {
                maxA = Math.max(maxA, height[i] * (j-i));
                i++;
                j--;
            }
        }
        return maxA;
    }
}