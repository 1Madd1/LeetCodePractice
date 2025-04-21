package org.example.merge_intervals;

import java.util.ArrayList;

public class IntervalMerger {
    public int[][] merge(int[][] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            System.out.println("[" + intervals[i][0] + " " + intervals[i][1] + "]");
        }
        ArrayList<int[]> intervalsList = new ArrayList<>();
        for (int[] interval : intervals) {
            intervalsList.add(interval);
        }
        System.out.println("---------------------------------");
        for (int[] interval : intervalsList) {
            System.out.println("[" + interval[0] + " " + interval[1] + "]");
        }
        System.out.println("---------------------------------");
        intervalsList.sort((interval1, interval2) -> interval1[0] >= interval2[0] ? 1 : -1);
        System.out.println("---------------------------------");
        for (int[] interval : intervalsList) {
            System.out.println("[" + interval[0] + " " + interval[1] + "]");
        }
        System.out.println("---------------------------------");
        for (int i = 0; i < intervals.length; i++) {
            intervals[i] = intervalsList.get(i);
        }
        for (int i = 0; i < intervals.length; i++) {
            System.out.println("[" + intervals[i][0] + " " + intervals[i][1] + "]");
        }
        ArrayList<int[]> mergedIntervals = new ArrayList<>();
        boolean increaseIncrement = false;
        for (int i = 1; i <= intervals.length; i++) {
            int[] newInterval = new int[2];
//            if (i != intervals.length && intervals[i-1][1] >= intervals[i][0] && ) {
//                increaseIncrement = true;
//                newInterval[0] = intervals[i-1][0];
//                if (intervals[i-1][1] > intervals[i][1]) {
//                    newInterval[1] = intervals[i-1][1];
//                } else {
//                    newInterval[1] = intervals[i][1];
//                }
//            } else {
//                newInterval[0] = intervals[i-1][0];
//                newInterval[1] = intervals[i-1][1];
//            }
            mergedIntervals.add(newInterval);
            if (increaseIncrement) {
                i++;
                increaseIncrement = false;
            }
        }
        System.out.println("-----------------------------");
        for (int i = 0; i < mergedIntervals.size(); i++) {
            System.out.println("[" + mergedIntervals.get(i)[0] + " " + mergedIntervals.get(i)[1] + "]");
        }
        int[][] mergedIntervalsArray = new int[mergedIntervals.size()][];
        for (int i = 0; i < mergedIntervals.size(); i++) {
            mergedIntervalsArray[i] = mergedIntervals.get(i);
        }
        return mergedIntervalsArray;
    }
}
