package com.example.project_api;

import java.util.Date;

public class Project {
    private Integer id;
    private String name;
    private String description;
    private ProjectService.Status status;
    private Date beginDate;
    private Date endDate;
    public Project() {
    }

    public Project(String title) {
        this.name = title;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ProjectService.Status getStatus() {
        return status;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(ProjectService.Status status) {
        this.status = status;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}