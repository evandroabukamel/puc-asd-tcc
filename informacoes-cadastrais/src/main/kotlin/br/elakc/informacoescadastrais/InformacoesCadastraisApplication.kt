package br.elakc.informacoescadastrais

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@EnableEurekaClient
@RestController
class InformacoesCadastraisApplication

fun main(args: Array<String>) {
	runApplication<InformacoesCadastraisApplication>(*args)
}
