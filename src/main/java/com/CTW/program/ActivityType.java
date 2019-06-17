package com.CTW.program;

public enum ActivityType {

    MOUNTAINEERING("mountaineering"), HIKING("hiking"),
    SNOWBOARD("snowboard"), ROCKCLIMBING("rockclimbing"),
    BACKPACKING("backpacing"), CANOEING("canoeing"),
    KAYAKING("kayaking"), RAFTING("rafting");

    String name;

    ActivityType(String name) {
        this.name = name;
    }
}
