class Alumno(val nombre:String,var nota:Int) {
    fun saberSi(fn:(Int) -> Boolean):Boolean{return fn(nota)}//RETORNA LA FUNCION DICHA CON LA NOTA
    //NO LE PASAMOS EL PARÁMETRO INT PQ EN SI LA OTRA FUNCION LO RECIBE
}