package workflows

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(uri: "/workflows")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
