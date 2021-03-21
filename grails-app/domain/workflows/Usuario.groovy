package workflows
import org.hibernate.collection.internal.*
  
class Usuario {
        String nombreApellido = "Default"
        String matricula = "600XXX"
        Boolean activo = true
        List grupos = []
        static hasMany = [grupos:Grupo]
      

    static constraints = {
        grupos nullable: true
    }

    def properties(){
        return [
            nombreApellido: this.nombreApellido,
            matricula: this.matricula,
            activo :  this.activo
        ]
    }
   
    def gtGrupos(){
        //def u = Grupo.findAll{ }
        //def x = u.findAll{ it.usuarioIsInGroup(this.id as Integer)==true }    
        return this.grupos
    }

    def gtGruposJson(){
        def grup = [] 
        this.gtGrupos().each{
            grup.push(it.properties())
        } 
        return grup
    }

    def gtApplicationsMenuJson(String parm){
        def result = []
        def grupos = this.gtGrupos()
        
        grupos.each{ grupo ->
            result += grupo.gtApplicationsMenu(parm)
        }
        result.unique()
        result.sort { it.contexto}
        println result
        return result
    }

    def gtSecciones(String parm){
        def v = []
        this._getGrupos().each{
           v+=it.gtSecciones(parm)
        }
        v.sort {it}
        return v.unique()
    }
  


}
