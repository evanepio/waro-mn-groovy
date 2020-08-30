package ca.evanepio.client

import ca.evanepio.api.GameApi
import io.micronaut.http.client.annotation.Client

@Client('/game')
interface GameClient extends GameApi {}