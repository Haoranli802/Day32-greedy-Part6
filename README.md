# Day32-greedy-Part6

● 738.单调递增的数字 

从后往前找到上升的数字，把上升数字前一个数字减一，然后标记。最后把标记之后的数字全部赋值9即可。

● 968.监控二叉树 

设置状态：

如果没被摄像头监控，则return 0

如果被摄像头监控，return 2

如果有摄像头，return 1

空节点默认return 2 因为我们不想让叶子节点装摄像头。

判断条件为下：

如果任意一个子节点没被cover，那么目前节点必须要装一个摄像头

如果任意一个节点有摄像头，那么目前节点会被cover

其他情况，目前节点就不会被cover

最后还要判断起始点有没有被监控，没有的话还要加一个摄像头。

● 总结 
