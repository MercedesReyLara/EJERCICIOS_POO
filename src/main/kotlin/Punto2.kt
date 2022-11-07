interface Punto2 {
    var x:Int
    var y:Int

    fun imprimir(){

    }

    class PuntoPlano(override var x: Int, override var y: Int) :Punto2{
        override fun imprimir()=println("El punto x=$x y el punto y=$y")
    }
    fun PuntoPlano.Dibujar()="Dibujando punto ${this.x},${this.y}"
    fun cambiarPunto(){
        print("Introduce el punto que quieres cambiar: ")
        var tmp:String?=readLine()
        var punto:String=tmp.toString()
        if(punto=="X" || punto=="x"){
            print("Introduce el nuevo punto x: ")
            var tmp:String?=readLine()
            var punto:Int= tmp?.toInt() ?: 1
            x=punto
        }else if(punto=="Y"||punto=="y"){
            print("Introduce el nuevo punto x: ")
            var tmp:String?=readLine()
            var punto:Int= tmp?.toInt() ?: 1
            y=punto
        }else{
            println("Punto no existente")
        }
        imprimir()
    }
}