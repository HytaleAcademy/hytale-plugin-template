package org.hytaleacademy.template.listener

import com.hypixel.hytale.server.core.Message
import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent

object PlayerReadyListener {

    fun onPlayerJoin(event: PlayerReadyEvent) {
        event.player.sendMessage(Message.raw("Welcome ${event.player.displayName}! Good luck developing!"))
    }
}