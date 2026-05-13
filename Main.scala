object Main {

    def main(args: Array[String]): Unit = {

        val history = new BrowserHistory()

        var running = true

        while(running) {

            println("\n--- HISTORIAL NAVEGADOR ---")
            println("1. Visitar pagina")
            println("2. Ir atras")
            println("3. Ir adelante")
            println("4. Ver pagina actual")
            println("5. Salir")

            print("Seleccione una opcion: ")

            val option = scala.io.StdIn.readInt()

            option match {

                case 1 =>

                    print("Ingrese URL: ")

                
                    scala.io.StdIn.readLine()

                    val url = scala.io.StdIn.readLine()

                    history.visit(url)

                case 2 =>

                    history.back()

                case 3 =>

                    history.forward()

                case 4 =>

                    history.showCurrentPage()

                case 5 =>

                    running = false
                    println("Programa finalizado")

                case _ =>

                    println("Opcion invalida")
            }
        }
    }
}