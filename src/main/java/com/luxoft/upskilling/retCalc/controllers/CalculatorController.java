package com.luxoft.upskilling.retCalc.controllers;

import com.luxoft.upskilling.retCalc.model.RetCalcResult;
import com.luxoft.upskilling.retCalc.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/calc")
    public String calculate(
        @RequestParam(name = "curAge") int curAge,
        @RequestParam(name = "retAge") int retAge, Model model) {

        RetCalcResult res = calculatorService.calcRetire(curAge, retAge);
        if (res.isError()) {
            model.addAttribute("message", "Рассчет невозможен");

            return "error";
        } else {
            model.addAttribute("retYear", res.getRetYear());
            model.addAttribute("yearsToRet", res.getYearsToRetr());
            model.addAttribute("curYeat", res.getCurYear());

            return "result";
        }
    }
}
