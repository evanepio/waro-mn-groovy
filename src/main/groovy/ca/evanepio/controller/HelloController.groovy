package ca.evanepio.controller

import groovy.transform.CompileStatic
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@CompileStatic
@Controller('/hello')
class HelloController {
    @Get(produces = MediaType.TEXT_PLAIN)
    String index() {
        'Hello World'
    }
}