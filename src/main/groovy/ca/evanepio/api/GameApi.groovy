package ca.evanepio.api

import ca.evanepio.domain.Game
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Post

interface GameApi {
    @Post(produces = MediaType.APPLICATION_JSON)
    Game create()
}