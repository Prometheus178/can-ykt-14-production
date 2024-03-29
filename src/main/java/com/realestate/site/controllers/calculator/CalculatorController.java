package com.realestate.site.controllers.calculator;


import com.realestate.site.models.calculator.FormInput;
import com.realestate.site.models.calculator.Payment;

import com.realestate.site.services.calculator.PaymentService;
import com.realestate.site.services.post.interfaces.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/calculator")
public class CalculatorController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/form")
    public String calculatorFormPage(Model model){
        FormInput formInput = new FormInput();
        model.addAttribute("formInputAttribute", formInput);
        return "calculator";
    }

    @PostMapping("/count")
    public String calculateMortgage(Model model, @ModelAttribute("formInputAttribute") FormInput formInput){
        if(formInput.getRateInYear() != 0 & formInput.getPeriod() != 0 & formInput.getAmount() != 0 ){
            List<Payment> payments = paymentService.getListPayment(formInput);
            model.addAttribute("payments", payments);
        } else {
            return "redirect:/calculator/form";
        }

        return "calculator_table";
    }
}
