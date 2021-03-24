package workflows

class Template {
    String name = "DEFAULT"
    String contexto = ""
    List steps = []
    static hasMany = [steps:TempSteps]
    //Boolean completado = false
    //String data = ""
    //String idOperacion = "XXXDEF"
    //String solicitante = ""
    //String confirmado = ""
    static constraints = {
        steps nullable:true
        contexto nullable:true
    }

    def properties(){
        return [
            id:this.id,
            name:this.name,
            contexto:this.contexto
        ]
    }

}
