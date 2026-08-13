def trap(height):
    """
    42. 接雨水【双指针优化版】
    预处理数组解法需要额外O(n)空间，双指针将空间复杂度优化至O(1)
    输入：height=[0,1,0,2,1,0,1,3,2,1,2,1]
    输出：6
    """
    left = 0
    right = len(height) - 1
    left_max = 0
    right_max = 0
    total = 0

    while left < right:
        if height[left] < height[right]:
            # 左侧柱子更矮，水位由左侧边界决定
            if height[left] >= left_max:
                left_max = height[left]
            else:
                total += left_max - height[left]
            left += 1
        else:
            # 右侧柱子更矮，水位由右侧边界决定
            if height[right] >= right_max:
                right_max = height[right]
            else:
                total += right_max - height[right]
            right -= 1
    return total


if __name__ == "__main__":
    arr = [0,1,0,2,1,0,1,3,2,1,2,1]
    print(trap(arr))