# 我的JAVA学习笔记

### 数组遍历
**💡小彩蛋：快捷键生成**

在 IDEA 里，输入数组名后敲 .for 回车，自动补全增强 for：

```Plain Text
arr3.for   → 回车 → 自动生成 for (int num : arr3) { }
arr3.fori  → 回车 → 自动生成普通带下标的 for 循环
```
也不能乱用，增强for循环中，i成了元素，不能通过i来访问索引。

✅适用场景：仅读取元素
打印、求和、找最大最小值、判断是否存在某元素。

❌不适用场景（要用普通 for）
需要下标；修改数组元素；倒序遍历；按条件跳过部分元素。

> 在[MethodDemo3.java](/src/main/java/method/MethodDemo3.java)中，踩过一次坑，通过增强for循环中的i进行索引访问。

**错误案例：**
```java
public static void printArray(int[] arr) {

    for (int i : arr) {
        if (i == 0)
            System.out.print("[" + arr[i]);
        else if (i == arr.length - 1)
            System.out.print(arr[i] + "]");
        else
            System.out.print(arr[i] + ",");
    }
}
```
