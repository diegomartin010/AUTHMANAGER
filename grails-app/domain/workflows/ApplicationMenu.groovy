package workflows

class ApplicationMenu {
    String nombre = ""
    String url = ""
    String ubicacionMenu = "" //SUP o INF
    String contexto = "" //area
    
    static constraints = {
        
    }

    def properties(){
       return [ 
        nombre : this.nombre,
        url : this.url,
        ubicacionMenu : this.ubicacionMenu,
        contexto : this.contexto
       ]
    }

}
