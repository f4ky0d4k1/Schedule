package com.example.myapp3.Network.RequestSchedule.ResponseSemesters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseSemesters {

    @SerializedName("error")
    @Expose
    private String error = "0";
    @SerializedName("years")
    @Expose
    private List<Year> years;
    @SerializedName("groupId")
    @Expose
    private Integer groupId;

    public String getError() { return error; }

    public void setError(String error) { this.error = error; }

    public List<Year> getYears() { return years; }

    public void setYears(List<Year> years) { this.years = years; }

    public Integer getGroupId() { return groupId; }

    public void setGroupId(Integer groupId) { this.groupId = groupId; }
}
