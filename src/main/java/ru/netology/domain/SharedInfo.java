package ru.netology.domain;

public class SharedInfo {
    private int count;
    private String urlImage;
    private boolean shared;
    private boolean canShared;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public boolean isCanShared() {
        return canShared;
    }

    public void setCanShared(boolean canShared) {
        this.canShared = canShared;
    }
}
