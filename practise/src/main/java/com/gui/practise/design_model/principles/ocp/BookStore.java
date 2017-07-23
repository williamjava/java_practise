package com.gui.practise.design_model.principles.ocp;

import java.util.ArrayList;
import java.util.List;

/**
 * 开闭原则
 * 
 * 抽象约束
 * 
 * 元数据控制模块行为
 * 
 * 制定项目章程
 * 
 * 封装变化
 * 
 * @author wuhoujian
 *
 */
public class BookStore {
	public static void main(String[] args) {
		List<IBook> bookList = new ArrayList<IBook>();
		bookList.add(new NovelBook("小说1", "作者1", 111));
		bookList.add(new NovelBook("小说2", "作者2", 222));
		bookList.add(new NovelBook("小说3", "作者3", 333));
		bookList.add(new ComputerBook("JVM", "周志明", 55, "Computer"));

		System.out.println("售卖的数据信息如下：");
		for (IBook book : bookList) {
			System.out.println("name:" + book.getName() + " author:" + book.getAuthor() + " price: " + book.getPrice());
		}
	}
}
