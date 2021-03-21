package workflows

class BootStrap {



    def init = { servletContext ->
        
       

        def a1 = new ApplicationMenu(
            nombre: "Nuevo Template",
            ubicacionMenu: "INF",
            contexto: "WFL",
            url: "/Workflows/TemplateCreate"
        ).save()

        def a2 = new ApplicationMenu(
            nombre: "Aprobar WF",
            ubicacionMenu: "INF",
            contexto: "WFL"
        ).save()

        def a3 = new ApplicationMenu(
            nombre: "Consultar Template",
            ubicacionMenu: "INF",
            contexto: "Consulta"
        ).save()

        def a4 = new ApplicationMenu(
            nombre: "Consultar WFL",
            ubicacionMenu: "INF",
            contexto: "Consulta"
        ).save()

        def a5 = new ApplicationMenu(
            nombre: "Consultar Grupos",
            ubicacionMenu: "SUP",
            contexto: "Consulta"
        ).save()

        def a6 = new ApplicationMenu(
            nombre: "Editar Grupos",
            ubicacionMenu: "SUP",
            contexto: "USR"
        ).save()

        def a7 = new ApplicationMenu(
            nombre: "Editar Usuario",
            ubicacionMenu: "SUP",
            contexto: "USR"
        ).save()

        def g1 = new Grupo(
            nombre:"HR Requesters", contexto:"HR", descripcion: "Grupos Solicitantes HR",
            applicationsMenu : [a2,a3,a4],
        ).save()
        def g2 = new Grupo(nombre:"HR Managers", contexto:"HR", descripcion: "Grupos Solicitantes HR",
            applicationsMenu : [a2,a3,a4]
        ).save()
        def g3 = new Grupo(nombre:"HR Directors", contexto:"HR", descripcion: "Grupos de Directores de HR",
            applicationsMenu : [a1,a2,a3,a4,a5]
        ).save()
        def g4 = new Grupo(nombre:"DIFA LAM1", contexto:"DIFA", descripcion: "Grupo de Usuarios LAM1").save()
        def g5 = new Grupo(nombre:"DIFA FIN1", contexto:"DIFA", descripcion: "Grupo de usuarios Terminacion1").save()
        def g6 = new Grupo(nombre:"ADMINISTRADORES", contexto:"ADMIN", descripcion: "Grupo de Administradores de App").save()
        def g0 = new Grupo(nombre:"PUBLICO", contexto:"ADMIN", descripcion: "Grupo al que todos tienen acceso",
         applicationsMenu : [a6,a7]
        ).save()

        def u1 = new Usuario(
            nombreApellido:"Diego Colussi",
            matricula: "200111",
            grupos:[g0, g1,g2,g3]
        ).save()

        def u2 = new Usuario(
            nombreApellido:"Usuario 2",
            matricula:"3001112",
            grupos:[g0, g1]
        ).save()

        def u3 = new Usuario(
            nombreApellido:"Usuario 3",
            matricula:"XXX",
            grupos:[g0,g2]
        ).save()
        
       

    }
    def destroy = {
    }
}
