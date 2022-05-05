package br.ifrs.edu.restinga.adriano.listaexerciciospring1.listaexerciciospring1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ImcController {

    @RequestMapping("/imc/{peso}/{altura}")
    @ResponseBody
    public String imcCalculate(@PathVariable ("peso") float peso, @PathVariable ("altura") float altura) {
        
        float imc_result = peso/(altura*2);
        
        if(imc_result < 18.5) {
            return "Magreza";
        } if(imc_result > 18.5 && imc_result > 24.9) {
            return "Saudável";
        } if(imc_result > 25 && imc_result < 29.9) {
            return "Sobrepeso";
        } if(imc_result > 30 && imc_result < 34.9) {
            return "Obesidade Grau I";
        } if(imc_result > 35 && imc_result < 39.9) {
            return "Obesidade Grau II (mórbida)";
        } if(imc_result > 40) {
            return "Obesidade Grau III (mórbida)";
        }

        return null;
    }
}