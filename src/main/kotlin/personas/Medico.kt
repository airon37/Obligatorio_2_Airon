package personas

class Medico(nidi: Int, nombre: String,var especialidad:String,var compania1:String,var compania2: String):Persona(nidi,nombre) {
    override fun toString(): String {
        return "nidi: "+nidi+" ,nombre: "+nombre+" ,especialidad: "+especialidad+" ,compañias: "+compania1+","+compania2
    }
}