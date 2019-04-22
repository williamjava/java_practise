package com.gui.practise.jdk8_new;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 流操作
 */
public class StreamsTest {
    public static void main(String[] args) {
        final Collection<Streams.Task> tasks = Arrays.asList(new Streams.Task(Streams.Status.OPEN, 5), new Streams.Task(Streams.Status.OPEN, 13), new Streams.Task(Streams.Status.CLOSED, 8));

        //一共有多少个OPEN状态的点
        final long totalPointsOfOpenTasks = tasks.stream().filter(task -> task.getStatus() == Streams.Status.OPEN).mapToInt(Streams.Task::getPoints).sum();
        System.out.println(totalPointsOfOpenTasks);

        //根据状态分组
        final Map<Streams.Status, List<Streams.Task>> map = tasks.stream().collect(Collectors.groupingBy(Streams.Task::getStatus));
        System.out.println(map);
    }
}
