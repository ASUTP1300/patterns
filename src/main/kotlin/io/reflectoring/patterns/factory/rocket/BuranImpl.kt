package io.reflectoring.patterns.factory.air

import io.reflectoring.patterns.factory.rocket.RocketMark
import org.springframework.stereotype.Service

@Service
class BuranImpl : Rocket {
    override fun getMark(): RocketMark {
        return RocketMark.BURAN
    }
}