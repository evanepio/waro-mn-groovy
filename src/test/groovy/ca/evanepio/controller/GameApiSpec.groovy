package ca.evanepio.controller

import ca.evanepio.client.GameClient
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class GameApiSpec extends Specification{
    @Inject
    GameClient gameClient

    void "When creating game, game object returns with an ID"() {
        expect:
        gameClient.create().id.contains("id")
    }
}
