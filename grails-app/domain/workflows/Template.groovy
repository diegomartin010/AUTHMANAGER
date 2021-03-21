package workflows

class Template {
    String name = "DEFAULT"
    List steps = []
    static hasMany = [steps:TempSteps]
    //Boolean completado = false
    //String data = ""
    //String idOperacion = "XXXDEF"
    //String solicitante = ""
    //String confirmado = ""
    static constraints = {
        
    }
}
