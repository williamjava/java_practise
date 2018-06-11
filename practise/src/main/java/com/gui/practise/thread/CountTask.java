package com.gui.practise.thread;

import java.util.concurrent.RecursiveTask;

/**
 * ForkJoinTask的子类：RecursiveTask - 用于有返回结果的任务
 * 
 * @author wuhoujian
 *
 */
public class CountTask extends RecursiveTask<Integer> {
	private static final long serialVersionUID = 1718989702751957274L;

	private static final int THRESHOLD = 2;// 阈值
	private int start;
	private int end;

	public CountTask(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	protected Integer compute() {
		int sum = 0;
		// 如果任务足够小就计算任务
		boolean canCompute = (end - start) <= THRESHOLD;
		if (canCompute) {
			for (int i = start; i <= end; i++) {
				sum += i;
			}
		} else {
			// 如果任务大于阀值，就分裂成两个子任务计算
			int middle = (start + end) / 2;
			CountTask leftTask = new CountTask(start, middle);
			CountTask rightTask = new CountTask(middle + 1, end);

			// 执行子任务
			leftTask.fork();
			rightTask.fork();

			// 等待子任务执行完，并得到其结果
			int leftResult = leftTask.join();
			int rightResult = rightTask.join();

			// 合并子任务
			sum = leftResult + rightResult;
		}
		return sum;
	}
}