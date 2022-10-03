package personas

import kotlin.random.Random

object Factorias {
    fun factoriaPaciente():Paciente{
        var nidi:Int = (1000..9999).random()
        var nombre:String = ""
        when((1..8).random()){
            1 -> nombre = "Pepe"
            2 -> nombre = "Michael"
            3 -> nombre = "Francisca"
            4 -> nombre = "Raquel"
            5 -> nombre = "Juja"
            6 -> nombre = "Alejandro"
            7 -> nombre = "Pablo"
            8 -> nombre = "Marta"
        }
        var nombreCompania:String = ""
        when((1..3).random()){
            1 -> nombreCompania ="Sanitropres"
            2 -> nombreCompania = "Varderslas"
            3 -> nombreCompania = "Yodacare"
        }
        var tipoAtencion:String = ""
        when((1..3).random()){
            1 -> tipoAtencion = "Quemadura laser"
            2 -> tipoAtencion = "Impacto chorritrónico"
            3 -> tipoAtencion = "Otros"
        }
        var Pacien = Paciente((1000..9999).random(),nombre,nombreCompania,tipoAtencion,(1..3).random())
        return Pacien
    }

    fun Medico(especialidad:String):Medico{
        var nidi:Int = (1000..9999).random()
        var nombre:String = ""
        when((1..8).random()){
            1 -> nombre = "Pepe"
            2 -> nombre = "Michael"
            3 -> nombre = "Francisca"
            4 -> nombre = "Raquel"
            5 -> nombre = "Juja"
            6 -> nombre = "Alejandro"
            7 -> nombre = "Pablo"
            8 -> nombre = "Marta"
        }

        var nombreCompania1:String = ""
        when((1..3).random()){
            1 -> nombreCompania1 ="Sanitropres"
            2 -> nombreCompania1 = "Varderslas"
            3 -> nombreCompania1 = "Yodacare"
        }
        var nombreCompania2:String = ""
        when((1..3).random()){
            1 -> nombreCompania2 ="Sanitropres"
            2 -> nombreCompania2 = "Varderslas"
            3 -> nombreCompania2 = "Yodacare"
        }
        var medic = Medico(nidi,nombre, especialidad,nombreCompania1,nombreCompania2)
        return medic
    }
}