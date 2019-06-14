package com.CTW.program;

public enum ActivityType {

    MOUNTAINEERING("Mountaineering"), HIKING("Hiking"),
    SNOWBOARD("Snowboard"), ROCKCLIMBING("RockClimbing"),
    BACKPACKING("Backpacing"), CANOEING("Canoeing"),
    KAYAKING("Kayaking"), RAFTING("Rafting");

    String name;

    ActivityType(String name) {
        this.name = name;
    }
}
