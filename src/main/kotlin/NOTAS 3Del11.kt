fun escribeMiNombre(nombre:String){//SIN VALOR PREDETERMINADO
    println("Mi nombre es $nombre")
}
fun dividir(num1:Int,num2:Int=2)=num1/num2//CON VALOR PREDETERMINADO
fun operacionDiv(){
    val division1=dividir(20,5)//NOS DEVUELVE 4, YA QUE SUBSTITUÍMOS 2 POR 5
    var division2=dividir(20)//NOS DEVUELVE 10
}
fun miNombre(nombre:String) :String{//QUEREMOS QUE NOS DEVUELVA UN STRING POR LO TANTO LE PONEMOS LA CLASE STRING A LA FUNCION
    var miNombre="Me llamo $nombre"
    return miNombre
}
//LOS METODOS SE PUEDEN SIMPLIFICAR CUANDO DEVUELVEN UNA EXPRESION (SIMPLE O COMPLEJA) PERO QUE AMBAS DEVUELVAN UN VALOR SIMPLE
fun esPar(numero:Int):String{
    return if (numero%2==0)"Numero es par" else "Numero es impar"//RETORNA UNA EXPRESIÓN SIMPLE AL FINAL POR LO TANTO SE SIMPLIFICA->
}//->
fun esPar2(numero:Int):String=if(numero%2==0) "Numero es par" else "Numero impar"//SIMPLIFICADA
fun suma(num1:Int,num2:Int)=num1+num2
fun esMayor(num1:Int,num2:Int)=if(num1>num2) num1 else num2
//fun numeroEntre0YMax(num1:Int,mas:Int)

//FUNCION MÁS COMPLEJA PERO SIMPLIFICADA
fun eliminarSiPar(numeros:List<Int>):List<Int>{
    val resultado= mutableListOf<Int>()
    fun esPar(numero:Int):Boolean=(numero%2==0)
    for(numero in numeros){if(!esPar(numero)){resultado.add(numero)}//COMPROBAMOS SI LA FUNCION DA FALSE ENTONCES AÑADIMOS
        return resultado//NOS RETORNA UNA LISTA CON NUMEROS IMPARES UNICAMENTE
}
