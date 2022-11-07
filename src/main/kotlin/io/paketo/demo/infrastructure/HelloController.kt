package io.paketo.demo.infrastructure;

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/hello")
    fun execute(): String = "Hola!!!"

}
