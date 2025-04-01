package io.reflectoring.patterns.factory

import io.reflectoring.patterns.factory.air.AirMark
import io.reflectoring.patterns.factory.air.Aircraft
import io.reflectoring.patterns.factory.air.Rocket
import io.reflectoring.patterns.factory.rocket.RocketMark
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service

@Service
class Airport(
    private val airs: AbstractFactory<Aircraft, AirMark>,
    private val rockets: AbstractFactory<Rocket, RocketMark>
) {


    @PostConstruct
    fun test() {
        println("Проверка")
    }


}