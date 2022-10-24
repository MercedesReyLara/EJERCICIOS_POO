interface Punto {
    var x:Int
    var y:Int

    fun imprimir(){
    }
    fun cambiarPunto(){
    }
    class puntoPlano(override var x:Int,override  var y: Int):Punto {
        override fun imprimir() {
            println("Puntos en el plano: $x, $y")
        }

        override fun cambiarPunto() {
           print("Introduce el punto que quieres cambiar: ")
            var puntoCambiar: String? = readLine()
            if(puntoCambiar=="x"){
                print("Introduce su nueva posicion: ")
                var nuevaPos:Int?= readLine()?.toIntOrNull()
                if (nuevaPos != null) {
                    x=nuevaPos
                }
                print("Punto cambiado: $x,$y")
            }else{
                print("Introduce su nueva posicion: ")
                var nuevaPos:Int?= readLine()?.toIntOrNull()
                if (nuevaPos != null) {
                    y=nuevaPos
                }
                print("Punto cambiado: $x,$y")
            }
        }
    }

    class puntoEspacio(override  var x:Int,override  var y:Int, var z:Int):Punto{
        override fun imprimir() {
            println("Puntos en el espacio: $x, $y,$z")
        }
        override fun cambiarPunto() {
            print("Introduce el punto que quieres cambiar: ")
            var puntoCambiar: String? = readLine()
            if(puntoCambiar=="x"){
                print("Introduce su nueva posicion: ")
                var nuevaPos:Int?= readLine()?.toIntOrNull()
                if (nuevaPos != null) {
                    x=nuevaPos
                }
                print("Punto cambiado: $x,$y")
            }else if(puntoCambiar=="y"){
                print("Introduce su nueva posicion: ")
                var nuevaPos:Int?= readLine()?.toIntOrNull()
                if (nuevaPos != null) {
                    y=nuevaPos
                }
                print("Punto cambiado: $x,$y")
            }else{
                print("Introduce su nueva posicion: ")
                var nuevaPos:Int?= readLine()?.toIntOrNull()
                if (nuevaPos != null) {
                    z=nuevaPos
                }
                print("Punto cambiado: $x,$y,$z")
            }
        }
    }
}