package br.ifrs.edu.restinga.adriano.listaexerciciospring1.listaexerciciospring1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class CalculatorController {

    @RequestMapping("/calculadora/adicao")
    public String calculateSum(@RequestParam int n1, @RequestParam int n2 ) {
        return n1 + " + " + n2 + " = " + (n1+n2);
    }

    @RequestMapping("/calculadora/subtracao")
    public String calculateSubtraction(@RequestParam int n1, @RequestParam int n2 ) {
        return n1 + " - " + n2 + " = " + (n1-n2);
    }

    @RequestMapping("/calculadora/multiplicacao")
    public String calculateMultiplication(@RequestParam int n1, @RequestParam int n2 ) {
        return n1 + " x " + n2 + " = " + (n1*n2);
    }

    @RequestMapping("/calculadora/divisao")
    public String calculateDivide(@RequestParam int n1, @RequestParam int n2 ) {
        return n1 + " / " + n2 + " = " + (n1/n2);
    }
/*
    url = /calculadora/adicao?n1=numero&n2=numero
url = /calculadora/subtracao?n1=numero&n2=numero
url = /calculadora/multiplicacao?n1=numero&n2=numero
url = /calculadora/divisao?n1=numero&n2=numero
*/
}
