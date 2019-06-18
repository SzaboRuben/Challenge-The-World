package com.CTW.program;

public enum ActivityType {

    MOUNTAINEERING("Mountaineering"), HIKING("Hiking"),
    SNOWBOARD("snowboard"), ROCKCLIMBING("Rockclimbing"),
    BACKPACKING("Backpacing"), CANOEING("Canoeing"),
    KAYAKING("Kayaking"), RAFTING("Rafting");

    public String name;

    ActivityType(String name) {
        this.name = name;
    }
}
