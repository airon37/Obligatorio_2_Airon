package personas

class Paciente ( nidi: Int, nombre: String ,var nombreCompania:String, var tipoAtencion: String, var prioridad: Int) : Persona(nidi, nombre) {
    override fun toString(): String {
        return return "nidi: "+nidi+" ,nombre: "+nombre+" ,compañia: "+nombreCompania+" ,Atención requerida: "+tipoAtencion+" ,prioridad: "+prioridad
    }
}