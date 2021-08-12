package br.elakc.eurekaserver

import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class EurekaServerApplication

fun main(args: Array<String>) {
	SpringApplicationBuilder(EurekaServerApplication::class.java)
		// .web(WebApplicationType.SERVLET)
		.run(*args)
	// runApplication<EurekaServerApplication>(*args)
}
