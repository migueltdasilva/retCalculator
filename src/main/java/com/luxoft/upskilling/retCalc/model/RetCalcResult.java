package com.luxoft.upskilling.retCalc.model;

public class RetCalcResult {
    private int yearsToRetr;
    private int retYear;
    private int curYear;
    private boolean error;

    public RetCalcResult(boolean error) {
        if (!error) {
            throw new UnsupportedOperationException();
        }

        this.error = error;
    }

    public RetCalcResult(int yearsToRetr, int retYear, int curYear) {
        this.yearsToRetr = yearsToRetr;
        this.retYear = retYear;
        this.error = false;
    }

    public int getYearsToRetr() {
        return yearsToRetr;
    }

    public int getRetYear() {
        return retYear;
    }


    public boolean isError() {
        return error;
    }

    public int getCurYear() {
        return curYear;
    }
}
