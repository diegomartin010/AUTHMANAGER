package workflows
import grails.transaction.Transactional
import groovy.sql.Sql
import groovy.json.*
import org.hibernate.collection.internal.*

class QueryController {
    def dataSource

    def cu() {
        // Usuario logeado es el Id 1
        return 1
    }
    
    def index() { }

    def executeSQL(String s){
        def sql = new Sql(dataSource)
    	def rows = sql.rows(s)
        sql.close()
       return rows 
    }

    def getGrupos(){
        
        def u = Usuario.get(this.cu()).gtGruposJson()
        //def u = Usuario.get(1)._props()
        //def x = u.remove('grupos')
        //def u = x
        println u
        render(status: 200, contentType: 'application/json') {
           result u
        }  
    }

     def getMenu(){ 
        def u = Usuario.get(this.cu()).gtApplicationsMenuJson(params.sec)
        render(status: 200, contentType: 'application/json') {
           result u
        } 
    }

    def getSecciones(){
        def u = Usuario.get(this.cu()).gtSecciones(params.sec)
        render(status: 200, contentType: 'application/json') {
           result u
        } 
    }

    def getTemplates(){
        def x = []
        def u = Template.findAll{}
        u.each{
            x.push(it.properties())
        }
        render(status: 200, contentType: 'application/json') {
           result x
        }  
    }

    def getTemplate(){

    }



}
