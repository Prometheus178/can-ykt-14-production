package com.realestate.site.models.post.enums;

public enum NumberOfRooms {
    NONE("---"),
    ONE("1 комнатная"),
    TWO("2 комнатная"),
    THREE("3 комнатная"),
    FOUR("4 комнатная"),
    FIVE("5 комнат"),
    SIX_OR_MORE("6 и более"),
    STUDIO("Студия"),
    FREE_LAYOUT("Свободная планировка");

    private String value;
    NumberOfRooms (String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }


}
