// This object autocleans using a companion funcition

class Resource private{
    println("Creando recurso...")

    def op1(){ println("Ejecutando operación 1")}
    def op2(){ println("2 Ejecutando operación 2")}

    private def close(){
        println("Destruyendo recurso y limpiando lo que queda...")
    }
}

// This is the application of the loan pattern
object Resource{
    def use[T](block: Resource => T) = {
        val resource = new Resource
        try {
            block(resource)
        } finally {
            resource.close()
        }
    }
}

Resource.use { resource =>
    resource.op1()
    resource.op2()
}