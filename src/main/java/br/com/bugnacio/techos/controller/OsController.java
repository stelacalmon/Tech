package br.com.bugnacio.techos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 
public class OsController {
    @GetMapping("/os")
    @ResponseBody 
    public String listaOs (){
        return "Lista de ordem de serviço";
    }
}
