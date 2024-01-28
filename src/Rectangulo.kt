class Rectangulo(base:Double, altura:Double) {
    private var base:Double = 0.0
        set(value) {
            require(value>=0) { "La base no puede ser 0" }
            field = value
        }
    private var altura:Double = 0.0
        set(value) {
            require(value>=0) { "La altura no puede ser 0" }
            field = value
        }
    init {
        this.base = base
        this.altura = altura
    }

    private fun area(): Double {
        return this.base * this.altura
    }

    private fun perimetro(): Double {
        return (this.base * 2) + (this.altura * 2)
    }

    override fun toString(): String {
        return "El área del rectangulo es de ${String.format("%.2f", area())}cm y su perímetro de ${String.format("%.2f", perimetro())}cm"
    }
}