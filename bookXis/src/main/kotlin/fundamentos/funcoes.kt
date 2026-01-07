package fundamentos

fun main() {
    dizOi(retornaNome(), 24)
    dizOi(idade = 24, nome = "Gustavo")
    dizOi("Daniel")
}

fun retornaNome(): String {
    return "Gustavo"
}

fun dizOi(nome: String, idade: Int = 20) {
    println("Oi ${nome}, parabéns pelos seus ${idade} anos")
}