import poo.Articulo
import poo.ModeloCoche
import Punto
fun main(args: Array<String>) {
    /*val coche=Coche("SeatLeon",4,4,100)
    coche.imprimirCoche()
    coche.cambiarVelocidad(50)
    coche.detener()*/
    /*val coche2=Coche("Mercedes-Benz",-5,-100,400)
    coche2.imprimirCoche()
    coche2.cambiarVelocidad(50)
    coche2.detener()*/
    /*val coche3=Coche("Mercedes-Benz",5,200,100,true)
    coche3.imprimirCoche()
    coche3.cambiarVelocidad(50)
    coche3.detener()*/
    /*val Seat=ModeloCoche.ModeloSeat("SEAT LEON","5413AAA",65F,"ROJO")
    Seat.fichaVehículo()
    Seat.detener()*/

    /*val punto1=Punto.puntoPlano(2,4,)
    val punto2=Punto.puntoEspacio(2,6,7)

    punto1.imprimir()
    punto2.imprimir()

    punto1.cambiarPunto()
    Prueba interfaz punto
     */

    val persona1=Persona.Alumno("Mercedes","Rey Lara","Alumno")
    var persona2=Persona.Empleado("David","Sanchez Perez","Empleado",500F)
    persona1.imprimirDatos()
    persona1.saludar()
    persona1.tipoPersona()

    persona2.imprimirDatos()
    persona2.saludar()
    persona2.tipoPersona()
}