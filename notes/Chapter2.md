## 第二章：面试中的复杂度分析

- 在业界使用O来表示算法执行的最低上界

### 数据规模的概念

- 想在1s之内解决问题：
  - O(n^2)：10^4级别的数据
  - O(n)：10^8级别的数据
  - O(nlogn)：10^7级别的数据

- 可以通过实验观测趋势，来找出数据规模

### 递归算法的分析

- 递归不一定是nlogn

- 递归中进行一次递归调用的复杂度分析
  - 比如二分查找法
  - 只进行一次递归调用，递归深度稳depth，每个递归函数时间复杂度为T，则O(T\*depth)
  - 分析出depth就好！

- 递归中进行多次递归调用的复杂度分析
  - 计算实际的调用次数，通过画出递归数
  - 指数级算法基本在20左右已经是百万级了
  - 一般分治算法都是nlogn，因为层数是logn

- 可以通过主定理进行分析

### 均摊复杂度分析

- 动态数组(Vector)
  - 虽然扩容是n个操作，但是需要先进行n个add操作之后再进行扩容，所以均摊之后每一个操作为常数级别