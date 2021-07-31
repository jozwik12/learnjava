package com.javaudemy.codewars;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        if (seconds <= 0) return "now";
        StringBuilder builder = new StringBuilder();
        int y = seconds / 31_536_000;
        int d = seconds % 31_536_000 / 86_400;
        int h = seconds % 86_400 / 3600;
        int m = seconds % 3600 / 60;
        int s = seconds % 60;

        if (y > 0) builder.append(y).append(" year");
        if (y > 1) builder.append("s");

        if (y > 0 && (d > 0 || h > 0 || m > 0 || s > 0)) builder.append(", ");

        if (d > 0) builder.append(d).append(" day");
        if (d > 1) builder.append("s");

        if (d > 0 && (h > 0 || m > 0 || s > 0)) builder.append(", ");

        if (h > 0) builder.append(h).append(" hour");
        if (h > 1) builder.append("s");
        if (h > 0 && (m > 0 || s > 0)) builder.append(", ");

        if (m > 0) builder.append(m).append(" minute");
        if (m > 1) builder.append("s");
        if (m > 0 && s > 0) builder.append(", ");

        if (s > 0) builder.append(s).append(" second");
        if (s > 1) builder.append("s");

        String mod = builder.toString();
        int start = mod.lastIndexOf(",");
        if (start != -1){
            String s1 = mod.substring(0,start);
            String s2 = mod.substring(start+1);
            mod = s1 + " and" + s2;
        }
        return mod;
    }

    public static void main(String[] args) {
        System.out.println(TimeFormatter.formatDuration(60));
        System.out.println(TimeFormatter.formatDuration(3600));
        System.out.println(TimeFormatter.formatDuration(3600 * 24));
        System.out.println(TimeFormatter.formatDuration(3600 * 24 * 365));
        System.out.println(TimeFormatter.formatDuration(3600 * 24 * 365 + 5));
        System.out.println(TimeFormatter.formatDuration(123543662));

    }
}
