package org.example.menento;

import java.util.Date;

public class Save {
    private String version;
    private Date date;
    private String information;

    public Save(String version, Date date, String information) {
        this.version = version;
        this.date = date;
        this.information = information;
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }

    public String getInformation() {
        return information;
    }
}
