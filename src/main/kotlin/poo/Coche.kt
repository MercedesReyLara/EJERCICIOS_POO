package poo
/*class Coche(var nombreModelo:String, var numPuertas:Int, var numAsientos:Int, var velocidad:Int,var orientacion:Boolean) {


    fun imprimirCoche(){
        println("Tu coche es un $nombreModelo, con $numPuertas puertas, $numAsientos asientos y velocidad de " +
                " $velocidad km/h")
    }
    init{
        if(velocidad<0 || velocidad>300)velocidad=0
        if(numAsientos>200 ||numAsientos<=0)numAsientos=0
        if(numPuertas>7 || numPuertas<=0)numPuertas=0
        nombreModelo=nombreModelo.uppercase()
        if(orientacion){
            println("La orientación de las puertas es hacia arriba")
        }else{
            println("La orientación de las puertas es hacia abajo")
        }
    }
    fun cambiarVelocidad(nuevaVelocidad:Int){
         velocidad=nuevaVelocidad
        println("Velocidad cambiada,ahora la velocidad es de $velocidad")
    }
    fun detener(){
        val velocidad=0
        print("El coche esta parado. Su velocidad es $velocidad")
    }

}*/
/*data class Coche(var modelo:String,var velocidad:Int,var asientos:Int){
    var velocidadMax:Int=300

    fun crearCoche(){
        val coche=Coche("Seat Leon",200,4)
        println("Propiedades de tu coche: ${coche.toString()}")
    }
}*/
data class Articulo(var codigo:Int,var descripcion:String,var precio:Float){
    var articulo1=Articulo(3,"PATATAS CAMPERAS",2f)
    var articulo2=Articulo(2,"JAMON",3f)
    var articulo3=articulo1.copy(descripcion="PAPAS PEQUEÑAS",precio=2.5f)
    var articulo4=articulo2.copy(precio=2f)
    val articulo3a=articulo3

    fun imprimir(){
        println(articulo1.toString())
        println(articulo2)
        if(articulo3a.equals(articulo3))println("El $articulo3 y el su copia $articulo3a son iguales")
        else println("Articulos distintos")
        if(articulo1==articulo3) println("El $articulo1 y el $articulo3 son iguales")
        else println("Son distintos los articulos $articulo1 y $articulo3")
    }
}
/*enum class Color{ROJO,AZUL,VERDE,VIOLETA,BLANCO,NEGRO}
enum class Ingredientes{PAN,CARNE,QUESO,TOTMATE,LECHE}
enum class TipoCarta{DIAMANTE,TREBOL,CORAZON,PICA}

enum class RGBColor(var r:Int,val g:Int,val b:Int){
    RED(255,0,0), BLUE{0,0,255} ,GREEN{0,255,0}
    ORANGE(255,165,0), YELLOW{255,255,0}
    fun rgb()=(r*256+g)*256+b
}*/
abstract class ModeloCoche( var modelo:String, var numeroBastidor:String,var peso:Float?,var color:String){
    /*Hacemos todo lo que queremos que herede aparte de las propiedades*/
    abstract var velocidadMax:Float
    abstract fun acelerar(valor:Int)
    abstract fun detener()

    //Funcion para todoas
    open fun fichaVehículo()=print("Características del coche: Modelo:$modelo  Numero Bastidor:$numeroBastidor " +
            "Peso:$peso  Color:$color  Velocidad Maxima:$velocidadMax")

    class ModeloSeat(_modelo:String,_numeroBastidor: String,_peso: Float?,_color: String)
        :ModeloCoche(_modelo,_numeroBastidor,_peso,_color){
        override var velocidadMax: Float=200f
            set(value) {if(value<0)field=0f else field=value}
            init{
                modelo=modelo.uppercase()
                numeroBastidor=numeroBastidor.uppercase()
                peso=peso?:0f
                color=_color.uppercase()
            }
        override fun acelerar(valor: Int) {
            print("Modelo SEAT, acelerando a $valor")
        }

        override fun detener() {
           print("Modelo SEAT detenido")
        }

        override fun fichaVehículo() {
            println("Modelo SEAT,CARACTERISTICAS: ")
            super.fichaVehículo()
        }
    }
}
