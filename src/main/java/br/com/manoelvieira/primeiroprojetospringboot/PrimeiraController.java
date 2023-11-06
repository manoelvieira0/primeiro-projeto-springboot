package br.com.manoelvieira.primeiroprojetospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiracontroller")
public class PrimeiraController {

  @GetMapping("/primeirometodo")
  public String primeiroMetodo(){
    return "Primeiro metodo";
  }
  
}
