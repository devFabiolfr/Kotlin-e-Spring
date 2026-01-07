package fundamentos

fun main() {
//    parOuImpar(2)
//    parOuImpar(3)

//    resultadoDaNota(3)
//    resultadoDaNota(5)
//    resultadoDaNota(8)

    println(parOuImpar(2))
    println(parOuImpar(9))
}

fun parOuImpar(numero: Int): String {
    return if(numero % 2 == 0) {// se o resto da divisão por 2 for 0 é par se for 1 ou diferente é impar
        "Par"
    } else {
        "Impar"
    }
}

//se a nota >= 6 -> passou
// se a nota for > 4 -> recuperação
// se a nota for < 4 -> reprovou
fun resultadoDaNota(nota: Int) {
    if(nota >= 6){
        println("Passou")
    } else if (nota >= 4) {
        println("Recuperação")
    } else {
        println("Reprovou")
    }
}