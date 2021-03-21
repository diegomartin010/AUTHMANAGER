package workflows

class TempSteps { 
    String paso = "x" 
    String descripcion = "DESC. DEF"
    Grupo aprobador = null
    String tipo = "DEFINIR"
    Usuario usuarioFirmante = null
    int secuencia = 0
    static constraints = {
        aprobador nullable: true, blank: true
        usuarioFirmante nullable: true, blank: true
    }
}
