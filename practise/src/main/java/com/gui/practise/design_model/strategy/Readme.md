#JDK中策略模式的引用场景
##线程池的拒绝策略
1.接口
* RejectedExecutionHandler

2.4个具体实现
* CallerRunsPolicy
* AbortPolicy
* DiscardPolicy
* DiscardOldestPolicy
---
##比较器Comparator
1.Comparator

2.具体实现由开发自己实现 