package com.luxoft.upskilling.retCalc.service;

import com.luxoft.upskilling.retCalc.model.RetCalcResult;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Calendar;

@Service
public class CalculatorService {

    private boolean isValid(int curAge, int retAge) {
        return curAge >= retAge;
    }

    public RetCalcResult calcRetire(int curAge, int retAge) {
        if (isValid(curAge, retAge)) {

            return new RetCalcResult(true);
        }

        LocalDate curDate = LocalDate.now();
        int curYear = curDate.getYear();
        int yearsToRet = retAge - curAge;

        return new RetCalcResult(yearsToRet, curYear + yearsToRet, curYear);

    }
}
