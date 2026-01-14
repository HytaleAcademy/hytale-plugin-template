package org.hytaleacademy.template

import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent
import com.hypixel.hytale.server.core.plugin.JavaPlugin
import com.hypixel.hytale.server.core.plugin.JavaPluginInit
import org.hytaleacademy.template.command.PingPlayerCommand
import org.hytaleacademy.template.listener.PlayerReadyListener

class TemplatePlugin(init: JavaPluginInit) : JavaPlugin(init) {

    override fun setup() {
        commandRegistry.registerCommand(PingPlayerCommand())
        eventRegistry.registerGlobal(PlayerReadyEvent::class.java, PlayerReadyListener::onPlayerJoin)
    }
}