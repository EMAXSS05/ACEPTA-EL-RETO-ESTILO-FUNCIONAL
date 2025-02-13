fun main(){
var secuencia= generateSequence { readlnOrNull()?.split(" ")?.map{it.toInt()} }
    .takeWhile {  it[0] !=0 && it [1] !=0 }
    .map{(actual,destino)->
        val adelante= if(destino>=actual) destino-actual else 99 -(actual-destino)
        val haciaAtras= if (actual>= destino) actual-destino else 99-(destino-actual)
        minOf(adelante,haciaAtras)

    }
    .forEach { println(it) }
}