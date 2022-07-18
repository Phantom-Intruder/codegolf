import java.util.*;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
};

class MergeIntervals {
    public static Interval[] canAttend(Interval[] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(a -> a.start));
        for (int i = 1; i < intervals.length; i++){
            if (intervals[i].start < intervals[i-1].end){
                return new Interval[]{intervals[i], intervals[i - 1]};
            }
        }
        return intervals;
    }

    public static void main(String[] args){
        Interval[] intervals = {new Interval(1,4), new Interval(2,5), new Interval(7,9)};
        System.out.println(Arrays.toString(MergeIntervals.canAttend(intervals)));

        Interval[] intervals1 = {new Interval(6,7), new Interval(2,4), new Interval(8,12)};
        System.out.println(Arrays.toString(MergeIntervals.canAttend(intervals1)));
    }
}
