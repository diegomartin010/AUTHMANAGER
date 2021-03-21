package workflows
import grails.transaction.Transactional
import groovy.sql.Sql
import groovy.json.JsonBuilder



class WorkflowsController  {
    static responseFormats = ['json', 'xml']
    def dataSource
    
    def index() { 
        render(view:"GetWorkflows")
    }

    def templateCreate(){
        render(view:"TemplateCreate") 
    }

}
