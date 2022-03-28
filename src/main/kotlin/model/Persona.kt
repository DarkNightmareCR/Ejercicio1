package model

class Persona {
    //solo atributos
    var nombre:String=""
    var edad:Int=0
    var cedula:Int=0
    var sexo:Char='H'
    var peso:Float= 0.0F
    var altura:Float=0.0F
    constructor(){
       // nombre=""
      //  edad=0
      //  cedula=0
      //  sexo='H'
      //  peso= 0.0F
      //  altura=0.0F
    }
    constructor(nombreP:String,edadP:Int,sexoP:Char){
        this.nombre=nombreP
        this.edad=edadP
        this.sexo=sexoP
    }
    constructor(nombre:String,edad:Int,cedula:Int,sexo:Char,peso:Float,altura:Float){
        this.nombre=nombre
        this.edad=edad
        this.cedula=cedula
        this.sexo=sexo
        this.peso=peso
        this.altura=altura
    }
}