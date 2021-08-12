package br.elakc.informacoescadastrais

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HelloWorldController {

    @GetMapping
    fun home(): String {
        return "Hello World"
    }
}