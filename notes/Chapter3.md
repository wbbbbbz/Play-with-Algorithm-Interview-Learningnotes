## 第三章：数组中的问题其实最常见

### 如何写出正确的程序

- 定义变量的时候需要严格定义，写清楚。
  - 通过写出区间（严格开闭，这样容易思考）进行判断

- 明确变量的含义
- 循环不变量(改变值但是不改变含义)
- 小数据量调试(考虑异常，边界量)
- 大数据量调试(正确性，性能)

### 解题心得
- 总之先解决问题。问题解决完之后再考虑优化！
- 在编程中能注意到可能出现问题的地方，并且进行assert，就会非常好
- 如果有多个解的话怎么办？是返回特定条件的解还是返回所有解？所有解的顺序？
- int\[26\] for Letters 'a' - 'z' or 'A' - 'Z'
  - int\[128\] for ASCII
  - int\[256\] for Extended ASCII
- 字符串需要判断是什么。字母，数字，ASCII，大小写敏感？
- 遇到索引的时候需要指定是从0开始还是从1开始?

### 对撞指针
- 两个指针从两个方向互相对撞，其实三路快排也是一种对撞指针。

### 滑动窗口
- 参考[Sliding Window algorithm template to solve all the Leetcode substring search problem. - LeetCode Discuss](https://leetcode.com/problems/find-all-anagrams-in-a-string/discuss/92007/Sliding-Window-algorithm-template-to-solve-all-the-Leetcode-substring-search-problem.)
  - 这个是一个用滑动窗口解决子字符串的模板。
  - 通过记录一个类似counter的map来解决子字符串问题
