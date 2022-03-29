package controller
import model.Persona
class PersonaController {
    var persona: Persona? =null

    //lleva los 4 metodos, calcularIMC hasta correspondiente
    fun calcularIMC(persona: Persona): Int {
        var calculo= persona.peso/(persona.altura* persona.altura)
        if(calculo<18.5f){
            return -1
        }else if (18.5f<= calculo && calculo<=24.9f){
            return 0
        }else{
            return 1
        }
    //peso/altura al cuadrado
    }
    fun esMayorDeEdad(persona: Persona):Boolean{
        if(persona.edad>=18) {
            return true
        }
            return false
    }
    fun comprobarSexo(sexo:Char):Boolean{
        if(sexo=='H' || sexo=='M'){
            return true
        }
        return false
    }
    fun toString(persona: Persona):String{
        var all:String=""
        all+="Nombre: "+persona.nombre+"\n"
        all+="Edad: "+persona.edad+"\n"
        all+="Cedula: "+persona.cedula+"\n"
        all+="Sexo: "+persona.sexo+"\n"
        all+="Peso: "+persona.peso+"\n"
        all+="Altura: "+persona.altura+"\n"
        return all
    }
    fun calcularPM(p1:Persona){
        var pc=PersonaController()
        var R = pc.calcularIMC(p1)
        if(R==-1){
            println("Bajo Peso")
        }else if(R==0){
            println("Peso Normal")
        }else{
            println("Sobrepeso")
        }
    }
    fun Mayor(p1:Persona){
        var pc=PersonaController()
        var R = pc.esMayorDeEdad(p1)
        if(R==true){
            println("Es Mayor de Edad ")
        }else{
            println("Es menor de Edad ")
        }
    }

}