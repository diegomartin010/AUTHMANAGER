package workflows
 
class Grupo {
    String nombre = ""
    String contexto = ""
    String descripcion = ""
    Boolean activo = true
    List applicationsMenu = []
    
    static hasMany = [
        applicationsMenu: ApplicationMenu
    ]

    static constraints = {
        applicationsMenu nullable:true
    }

    def properties(){
        return [
            nombre : this.nombre,
            contexto : this.contexto,
            descripcion : this.descripcion,
            activo : this.activo
        ]
    }

    def gtApplicationsMenu(String parm){    
        def app = this.applicationsMenu
        def r = app.findAll{it.ubicacionMenu == parm}
        def x = []
        r.each{
            x.push(it.properties())
        }
        return x
    }

    def gtSecciones(String parm){
        def app = this.applicationsMenu
        def r = app.findAll{it.ubicacionMenu == parm}
        def x = []
        r.each{x.push(it.contexto)}
        return x.unique()
    }

}
