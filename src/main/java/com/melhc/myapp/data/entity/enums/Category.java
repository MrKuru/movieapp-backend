package com.melhc.myapp.data.entity.enums;

public enum Category {
    ACTION("Action"),
    COMEDY("Comedy"),
    DRAMA("Drama"),
    HORROR("Horror"),
    ROMANCE("Romance"),
    THRILLER("Thriller"),
    ANIMATION("Animation"),
    DOCUMENTARY("Documentary"),
    FANTASY("Fantasy"),
    OTHER("Other");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

