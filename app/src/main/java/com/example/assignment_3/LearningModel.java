package com.example.assignment_3;

public class LearningModel {
    private String stdName;

    private String stdDept;

    private int sabaq;
    private boolean sabaqStatus;

    private int sabaqi;
    private boolean sabaqiStatus;

    private int manzil;
    private boolean manzilStatus;

    private String incorrectSabaq;
    private String incorrectSabaqi;
    private String incorrectMazil;

    public LearningModel(String stdName, String stdDept, int sabaq, boolean sabaqStatus, int sabaqi, boolean sabaqiStatus, int manzil, boolean manzilStatus, String incorrectSabaq, String incorrectSabaqi, String incorrectMazil) {
        this.stdName = stdName;
        this.stdDept = stdDept;
        this.sabaq = sabaq;
        this.sabaqStatus = sabaqStatus;
        this.sabaqi = sabaqi;
        this.sabaqiStatus = sabaqiStatus;
        this.manzil = manzil;
        this.manzilStatus = manzilStatus;
        this.incorrectSabaq = incorrectSabaq;
        this.incorrectSabaqi = incorrectSabaqi;
        this.incorrectMazil = incorrectMazil;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdDept() {
        return stdDept;
    }

    public void setStdDept(String stdDept) {
        this.stdDept = stdDept;
    }

    public int getSabaq() {
        return sabaq;
    }

    public void setSabaq(int sabaq) {
        this.sabaq = sabaq;
    }

    public boolean isSabaqStatus() {
        return sabaqStatus;
    }

    public void setSabaqStatus(boolean sabaqStatus) {
        this.sabaqStatus = sabaqStatus;
    }

    public int getSabaqi() {
        return sabaqi;
    }

    public void setSabaqi(int sabaqi) {
        this.sabaqi = sabaqi;
    }

    public boolean isSabaqiStatus() {
        return sabaqiStatus;
    }

    public void setSabaqiStatus(boolean sabaqiStatus) {
        this.sabaqiStatus = sabaqiStatus;
    }

    public int getManzil() {
        return manzil;
    }

    public void setManzil(int manzil) {
        this.manzil = manzil;
    }

    public boolean isManzilStatus() {
        return manzilStatus;
    }

    public void setManzilStatus(boolean manzilStatus) {
        this.manzilStatus = manzilStatus;
    }

    public String getIncorrectSabaq() {
        return incorrectSabaq;
    }

    public void setIncorrectSabaq(String incorrectSabaq) {
        this.incorrectSabaq = incorrectSabaq;
    }

    public String getIncorrectSabaqi() {
        return incorrectSabaqi;
    }

    public void setIncorrectSabaqi(String incorrectSabaqi) {
        this.incorrectSabaqi = incorrectSabaqi;
    }

    public String getIncorrectMazil() {
        return incorrectMazil;
    }

    public void setIncorrectMazil(String incorrectMazil) {
        this.incorrectMazil = incorrectMazil;
    }

    @Override
    public String toString() {
        return "LearningModel{" +
                "Student Name='" + stdName + '\'' +
                ", Student Department='" + stdDept + '\'' +
                ", Sabaq=" + sabaq +
                ", Sabaq Status=" + sabaqStatus +
                ", Sabaqi=" + sabaqi +
                ", Sabaqi Status=" + sabaqiStatus +
                ", Manzil=" + manzil +
                ", Manzil Status=" + manzilStatus +
                ", Incorrect Sabaq='" + incorrectSabaq + '\'' +
                ", Incorrect Sabaqi='" + incorrectSabaqi + '\'' +
                ", Incorrect Mazil='" + incorrectMazil + '\'' +
                '}';
    }
}

