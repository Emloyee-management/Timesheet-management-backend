package com.bf.viewtimesheetservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "timesheet_summary_collection")
public class Timesheet {
    @Id
    @Field("_id")
    private String id;
    private String userId;
    private int totalBillingHours;
    private int totalCompensatedHours;
    private String submissionStatus;
    private String approvalStatus;
    private String day1;
    private String day1Starttime;
    private String day1Endtime;
    private String day1Status;
    private String day2;
    private String day2Starttime;
    private String day2Endtime;
    private String day2Status;
    private String day3;
    private String day3Starttime;
    private String day3Endtime;
    private String day3Status;
    private String day4;
    private String day4Starttime;
    private String day4Endtime;
    private String day4Status;
    private String day5;
    private String day5Starttime;
    private String day5Endtime;
    private String day5Status;
    private String day6;
    private String day6Starttime;
    private String day6Endtime;
    private String day6Status;
    private String day7;
    private String day7Starttime;
    private String day7Endtime;
    private String day7Status;
    private String comment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getTotalBillingHours() {
        return totalBillingHours;
    }

    public void setTotalBillingHours(int totalBillingHours) {
        this.totalBillingHours = totalBillingHours;
    }

    public int getTotalCompensatedHours() {
        return totalCompensatedHours;
    }

    public void setTotalCompensatedHours(int totalCompensatedHours) {
        this.totalCompensatedHours = totalCompensatedHours;
    }

    public String getSubmissionStatus() {
        return submissionStatus;
    }

    public void setSubmissionStatus(String submissionStatus) {
        this.submissionStatus = submissionStatus;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getDay1() {
        return day1;
    }

    public void setDay1(String day1) {
        this.day1 = day1;
    }

    public String getDay1Starttime() {
        return day1Starttime;
    }

    public void setDay1Starttime(String day1Starttime) {
        this.day1Starttime = day1Starttime;
    }

    public String getDay1Endtime() {
        return day1Endtime;
    }

    public void setDay1Endtime(String day1Endtime) {
        this.day1Endtime = day1Endtime;
    }

    public String getDay1Status() {
        return day1Status;
    }

    public void setDay1Status(String day1Status) {
        this.day1Status = day1Status;
    }

    public String getDay2() {
        return day2;
    }

    public void setDay2(String day2) {
        this.day2 = day2;
    }

    public String getDay2Starttime() {
        return day2Starttime;
    }

    public void setDay2Starttime(String day2Starttime) {
        this.day2Starttime = day2Starttime;
    }

    public String getDay2Endtime() {
        return day2Endtime;
    }

    public void setDay2Endtime(String day2Endtime) {
        this.day2Endtime = day2Endtime;
    }

    public String getDay2Status() {
        return day2Status;
    }

    public void setDay2Status(String day2Status) {
        this.day2Status = day2Status;
    }

    public String getDay3() {
        return day3;
    }

    public void setDay3(String day3) {
        this.day3 = day3;
    }

    public String getDay3Starttime() {
        return day3Starttime;
    }

    public void setDay3Starttime(String day3Starttime) {
        this.day3Starttime = day3Starttime;
    }

    public String getDay3Endtime() {
        return day3Endtime;
    }

    public void setDay3Endtime(String day3Endtime) {
        this.day3Endtime = day3Endtime;
    }

    public String getDay3Status() {
        return day3Status;
    }

    public void setDay3Status(String day3Status) {
        this.day3Status = day3Status;
    }

    public String getDay4() {
        return day4;
    }

    public void setDay4(String day4) {
        this.day4 = day4;
    }

    public String getDay4Starttime() {
        return day4Starttime;
    }

    public void setDay4Starttime(String day4Starttime) {
        this.day4Starttime = day4Starttime;
    }

    public String getDay4Endtime() {
        return day4Endtime;
    }

    public void setDay4Endtime(String day4Endtime) {
        this.day4Endtime = day4Endtime;
    }

    public String getDay4Status() {
        return day4Status;
    }

    public void setDay4Status(String day4Status) {
        this.day4Status = day4Status;
    }

    public String getDay5() {
        return day5;
    }

    public void setDay5(String day5) {
        this.day5 = day5;
    }

    public String getDay5Starttime() {
        return day5Starttime;
    }

    public void setDay5Starttime(String day5Starttime) {
        this.day5Starttime = day5Starttime;
    }

    public String getDay5Endtime() {
        return day5Endtime;
    }

    public void setDay5Endtime(String day5Endtime) {
        this.day5Endtime = day5Endtime;
    }

    public String getDay5Status() {
        return day5Status;
    }

    public void setDay5Status(String day5Status) {
        this.day5Status = day5Status;
    }

    public String getDay6() {
        return day6;
    }

    public void setDay6(String day6) {
        this.day6 = day6;
    }

    public String getDay6Starttime() {
        return day6Starttime;
    }

    public void setDay6Starttime(String day6Starttime) {
        this.day6Starttime = day6Starttime;
    }

    public String getDay6Endtime() {
        return day6Endtime;
    }

    public void setDay6Endtime(String day6Endtime) {
        this.day6Endtime = day6Endtime;
    }

    public String getDay6Status() {
        return day6Status;
    }

    public void setDay6Status(String day6Status) {
        this.day6Status = day6Status;
    }

    public String getDay7() {
        return day7;
    }

    public void setDay7(String day7) {
        this.day7 = day7;
    }

    public String getDay7Starttime() {
        return day7Starttime;
    }

    public void setDay7Starttime(String day7Starttime) {
        this.day7Starttime = day7Starttime;
    }

    public String getDay7Endtime() {
        return day7Endtime;
    }

    public void setDay7Endtime(String day7Endtime) {
        this.day7Endtime = day7Endtime;
    }

    public String getDay7Status() {
        return day7Status;
    }

    public void setDay7Status(String day7Status) {
        this.day7Status = day7Status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

