package ca.evanepio.controller

import ca.evanepio.api.GameApi
import ca.evanepio.domain.Game
import groovy.transform.CompileStatic
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@CompileStatic
@Controller('/game')
class GameController implements GameApi {

    @Post(produces = MediaType.APPLICATION_JSON)
    Game create() {
        new Game(id: "an id")
    }
}
