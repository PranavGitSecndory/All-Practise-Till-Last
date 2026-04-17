package com.example.Product_Management.Dto;

public class StatusCount {
    private int Approved_Count;
    private int Pending_Count;
    public StatusCount(int approved_Count, int pending_Count) {
        Approved_Count = approved_Count;
        Pending_Count = pending_Count;
    }
    public int getApproved_Count() {
        return Approved_Count;
    }
    public void setApproved_Count(int approved_Count) {
        Approved_Count = approved_Count;
    }
    public int getPending_Count() {
        return Pending_Count;
    }
    public void setPending_Count(int pending_Count) {
        Pending_Count = pending_Count;
    }


}
