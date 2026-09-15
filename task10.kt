open class Vehicle {
    open var speed: Int = 0
    open var name: String = "Транспортное средство"

    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    open fun stop() {
        println("$name остановился")
    }
}

class Boat : Vehicle() {
    override var speed: Int = 40
    override var name: String = "Лодка"
}

class Plane : Vehicle() {
    override var speed: Int = 800
    override var name: String = "Самолет"

    override fun start() {
        println("$name взлетел со скоростью $speed км/ч")
    }
}

class Tank : Vehicle() {
    override var speed: Int = 60
    override var name: String = "Танк"
}

fun main() {
    val vehicles = listOf(Boat(), Plane(), Tank())
    for (vehicle in vehicles) {
        vehicle.start()
        vehicle.stop()
    }
}