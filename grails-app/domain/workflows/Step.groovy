package workflows

class Step {
    Boolean completado = false
    Grupo grupoAprobador = null
    String comentarios = null
    Usuario firmante = null
    static constraints = {
    }
}
