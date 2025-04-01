package io.reflectoring.patterns.factory

import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Autowired

abstract class AbstractFactory<T, E>(
    private var list: List<T>,
    var f: (T) -> E
) {

    private val map: Map<E, T> by lazy { init() }

    fun getInstance(e: E) : T  = map.get(e) ?: throw RuntimeException("No such")

    private fun init() = list.associateBy(f::invoke)
}