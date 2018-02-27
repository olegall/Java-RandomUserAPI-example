package com.company;

final class Picture {

    private final String thumbnail;
    private final String large;

    public Picture(String thumbnail, String large){
        this.thumbnail = thumbnail;
        this.large = large;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getLarge() {
        return large;
    }
}