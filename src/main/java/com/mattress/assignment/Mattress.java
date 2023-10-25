package com.mattress.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mattress {

    @Id
    private String id;

    private String quality;
    private String size;

    public Mattress(){
        super();
    }

    public Mattress(String id, String quality, String size) {
        super();
        this.id = id;
        this.quality = quality;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
