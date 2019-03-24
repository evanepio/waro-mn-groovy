package ca.evanepio.controller

import ca.evanepio.domain.Game
import io.micronaut.context.ApplicationContext
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

class GameControllerSpec extends Specification {

    @Shared
    @AutoCleanup
    EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)

    @Shared
    @AutoCleanup
    HttpClient client = HttpClient.create(embeddedServer.URL)

    void "When creating game, game object returns with an ID"() {
        expect:
        client.toBlocking()
                .retrieve(HttpRequest.POST('/game', Game)).contains("\"id\"")
    }
}
