interface Persona {
    var nombre:String
    var apellido:String
    var tipoPersona:String

    fun imprimirDatos(){
    }
    fun saludar(){
    }
    fun tipoPersona(){
    }
    class Alumno(override var nombre:String, override var apellido:String,
                 override var tipoPersona: String):Persona{

        override fun imprimirDatos() {
            println("Datos del alumno: Nombre:$nombre   Apellidos:$apellido")
        }

        override fun saludar() {
            println("Hola $nombre, bienvenido a la academia Tame")
        }

        override fun tipoPersona(){
            print("El tipo de persona es: $tipoPersona")
        }
    }
    class Empleado(override var nombre:String, override var apellido:String, override var tipoPersona: String,
                   var salario:Float):Persona{
        override fun imprimirDatos() {
            println("Datos del empleado: Nombre:$nombre   Apellidos:$apellido   Salario:$salario")
        }

        override fun saludar() {
            println("Saludos $nombre, usted en un empleado de Tame")
        }

        override fun tipoPersona(){
            print("El tipo de persona es: $tipoPersona")
        }
    }
}