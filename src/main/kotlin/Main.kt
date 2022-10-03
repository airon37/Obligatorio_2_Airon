import personas.Factorias
import personas.Medico
import personas.Paciente
import java.util.LinkedList
import java.util.Queue

fun main(args: Array<String>) {
    var sala1:Queue<Paciente> = LinkedList<Paciente>()
    var sala2:Queue<Paciente> = LinkedList<Paciente>()
    var sala3:Queue<Paciente> = LinkedList<Paciente>()
    for (dia in 1..7){
        println("Este es el "+dia+" dia")
        for (turno in 1 ..3){
            when(turno){
                1-> println("Turno de 00:00 a 08:00")
                2-> println("Turno de 08:00 a 16:00")
                3-> println("Turno de 16:00 a 00:00")
            }
            simulacionTurno(sala1,sala2,sala3)
        }
    }
}

fun simulacionTurno(sala1:Queue<Paciente>?,sala2:Queue<Paciente>?,sala3:Queue<Paciente>?){
    var medico1:Medico = Factorias.Medico("Traumatologia")
    var medico2:Medico = Factorias.Medico("Medicina interna")
    for (i in 1..10){
        if (i%2 == 0){
            agregarPaciente(sala1,sala2,sala3)
        }
        if (i%4 == 0){

        }
    }
}


//tratar paciente







//añadir paciente
fun agregarPaciente(sala1:Queue<Paciente>?,sala2:Queue<Paciente>?,sala3:Queue<Paciente>?){
    if(sala1!!.size == sala2!!.size && sala1!!.size == sala3!!.size){
        when((1..3).random()){
            1 -> {
                ordenar(sala1)
            }
            2 -> {
                ordenar(sala2)
            }
            3 -> {
                ordenar(sala3)
            }
        }
    }else{
        if (sala1!!.size < sala2!!.size && sala1!!.size < sala3!!.size){
            ordenar(sala1)
        }else{
            if (sala2!!.size < sala3!!.size){
                ordenar(sala2)

            }else{
                ordenar(sala3)
            }
        }
    }
}
fun ordenar (sala:Queue<Paciente>){
    var aux:Queue<Paciente> = LinkedList<Paciente>()
    var nuevaPersona:Paciente = Factorias.factoriaPaciente()
    var paciente:Paciente
    var estaDentro:Boolean = false
    if (sala == null){
        sala.add(nuevaPersona)
    }else{
        while (sala !=null){
            paciente = sala.remove()
            if (paciente.prioridad > nuevaPersona.prioridad && estaDentro == false){
                aux.add(nuevaPersona)
                aux.add(paciente)
                estaDentro =true
            }else{
                if (paciente.prioridad == nuevaPersona.prioridad && sala == null){
                    aux.add(nuevaPersona)
                    aux.add(paciente)
                }else{
                    aux.add(paciente)
                }
            }
        }
    }
}