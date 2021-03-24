package workflows

class TransactionalController {

    def index() { }

    def templateCreate(){
        def p = params
        println p
        new Template(p).save(flsuh:true)
        render(status: 200, contentType: 'application/json') {
           result p
        } 
    }
    
    def templateNewStep(){   
        new TempSteps(params).save
        render(status: 200, contentType: 'application/json') {
           result 1
        } 
    }

}
