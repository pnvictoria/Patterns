package org.example.menento;

import java.util.Date;

public class Project {
    private String version;
    private Date date;
    private String information;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Save save() {
        setDate(new Date());
        return new Save(version, date, information);
    }

    public void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
        information = save.getInformation();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                ", information='" + information + '\'' +
                '}';
    }
}
