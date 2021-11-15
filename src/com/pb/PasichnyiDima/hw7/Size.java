package com.pb.PasichnyiDima.hw7;

public enum Size {
    XXS("Детский размер", 32),
    XS("Юношеский размер", 34),
    S("Студенческий размер", 36),
    M("Молодежный размер", 38),
    L("Взрослый размер", 40);
    private String description;
    private int euroSize;

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
        }
    }
