package view
import controller.PersonaController
import model.Persona


class PersonaView {
    //captura y muestra la info del ejercicio, parte donde pide por teclado hasta mostrar la info de cada objeto
    var p=PersonaController()
    fun iniciar(){
        print("digite el nombre: ")
        var nombreV = readLine()!!
        print("digite la edad: ")
        var edadV =  readLine()?.toInt()!!
        print("digite el sexo: ")
        var sexoV= readLine()!![0]
        if(p.comprobarSexo(sexoV)==false){
            sexoV='H'
        }
        print("digite el peso: ")
        var pesoV = readLine()?.toFloat()!!
        print("digite la altura: ")
        var alturaV = readLine()?.toFloat()!!
        var cosa1=Persona(nombreV,edadV,3,sexoV,pesoV,alturaV)
        var cosa2=Persona(nombreV,edadV,sexoV)
        var cosa3=Persona()
        cosa3.nombre="Pepe"
        cosa3.edad=17
        cosa3.cedula=2093847456
        cosa3.sexo='F'
        cosa3.peso=55.5F
        cosa3.altura=1.60F
        println("objeto 1 posee ")
        calcularPM(cosa1)
        println("objeto 2 posee ")
        calcularPM(cosa2)
        println("objeto 3 posee ")
        calcularPM(cosa3)
        println("/////////////////")
        Mayor(cosa1)
        Mayor(cosa2)
        Mayor(cosa3)
        println("/////////////////")
        println(p.toString(cosa1))
        println(p.toString(cosa2))
        println(p.toString(cosa3))

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