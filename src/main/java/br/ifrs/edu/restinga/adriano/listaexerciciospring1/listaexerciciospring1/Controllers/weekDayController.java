package br.ifrs.edu.restinga.adriano.listaexerciciospring1.listaexerciciospring1.Controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class weekDayController {

    @RequestMapping("/diaSemana/{ano}/{mes}/{dia}")
    @ResponseBody
    public String dayWeekVerify(
        @PathVariable ("ano") String ano, 
        @PathVariable ("mes") String mes,
        @PathVariable ("dia") String dia
    ) {
        String dateTime = dia + "/" + mes + "/" + ano;
        String dayWeek = "";

        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        //DayOfWeek dayOfWeek = DayOfWeek.from(dateTimeFormatter.parse(dateTime));
        //return "Dia da semana: " + dayOfWeek.getDisplayName(null, new Locale("pr", "BR"));
    
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        try {
            gregorianCalendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(dateTime));
            
            switch (gregorianCalendar.get(Calendar.DAY_OF_WEEK)) {
                case Calendar.SUNDAY:
                    dayWeek = "Domingo";
                    break;
                case Calendar.MONDAY:
                    dayWeek = "Segunda-feira";
                    break;
                case Calendar.TUESDAY:
                    dayWeek = "Terça-feira";
                break;
                case Calendar.WEDNESDAY:
                    dayWeek = "Quarta-feira";
                    break;
                case Calendar.THURSDAY:
                    dayWeek = "Quinta-feira";
                    break;
                case Calendar.FRIDAY:
                    dayWeek = "Sexta-feira";
                    break;
                case Calendar.SATURDAY:
                    dayWeek = "Sabado";
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return dateTime + " - " + dayWeek;
    }
}