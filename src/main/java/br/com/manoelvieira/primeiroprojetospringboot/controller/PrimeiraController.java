package br.com.manoelvieira.primeiroprojetospringboot.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiracontroller")
public class PrimeiraController {

  @GetMapping("/primeirometodo/{id}")
  public String primeiroMetodo(@PathVariable String id) {
    return "O Parâmetro é " + id;
  }

  @GetMapping("/metodocomqueryparams")
  public String metodoComQueryParams(@RequestParam String id) {
    return "O Parâmetro com metodocomqueryparams é " + id;
  }

  @GetMapping("/metodocomqueryparams2")
  public String metodoComQueryParams2(@RequestParam Map<String, String> allParams) {
    return "O Parâmetro com metodocomqueryparams é " + allParams.entrySet();
  }

  @PostMapping("/metodocombodyparams")
  public String metodoComBodyParams(@RequestBody Usuario usuario){
    return "O Parâmetro com metodocombodyparams " + usuario.name;
  }

  @PostMapping("/metodocomheadersparams")
  public String metodoComHeadersParams(@RequestHeader("name") String name){
    return "O Parâmetro com metodocombodyparams " + name;
  }

  @PostMapping("/metodocomlistheadersparams")
  public String metodoComListHeadersParams(@RequestHeader Map<String, String> headers){
    return "O Parâmetro com metodocombodyparams " + headers.entrySet();
  }

  record Usuario(String name){

  }

}
