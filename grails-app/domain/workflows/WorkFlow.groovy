package workflows

class WorkFlow {
    String name = "DEFAULT"
    List steps = []
    static hasMany = [steps:Step]
    Boolean completado = false
    String data = ""
    String idOperacion = "XXXDEF"
    String solicitante = ""
    String confirmado = ""
    static constraints = {
    }
}
