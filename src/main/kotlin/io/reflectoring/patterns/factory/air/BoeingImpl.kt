package io.reflectoring.patterns.factory.air

import org.springframework.stereotype.Service

@Service
class BoeingImpl : Aircraft {
    override fun getMark(): AirMark {
        return AirMark.BOEING
    }
}