package com.bridgelabz.collections.predicatelambda;

import java.util.List;

public class OfficeInfo {

    private String officeName;
    private List<Person> workersList;

    public OfficeInfo(String officeName, List<Person> workersList) {
        this.officeName = officeName;
        this.workersList = workersList;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public List<Person> getWorkersList() {
        return workersList;
    }

    public void setWorkersList(List<Person> workersList) {
        this.workersList = workersList;
    }

    @Override
    public String toString() {
        return "OfficeInfo{" +
                "officeName='" + officeName + '\'' +
                ", workersList=" + workersList +
                '}';
    }
}
