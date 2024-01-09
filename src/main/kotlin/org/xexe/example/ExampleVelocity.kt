package org.xexe.example

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;


@Plugin(
    id = "example_velocity",
    name = "ExampleVelocity",
    version = "69.420"
)
class ExampleVelocity
@Inject constructor(val server: ProxyServer, val logger: Logger) {
    @Subscribe
    fun init(e: ProxyInitializeEvent) {
        logger.info("Hello!")
    }
}