class BrowserHistory {

    private var current: PageNode = null

    def visit(url: String): Unit = {

        val newPage = new PageNode(url)

        if(current != null) {

            current.next = null

            newPage.prev = current
            current.next = newPage
        }

        current = newPage
    }

    def back(): Unit = {

        if(current != null && current.prev != null) {
            current = current.prev
        }
        else {
            println("No hay pagina anterior")
        }
    }

    def forward(): Unit = {

        if(current != null && current.next != null) {
            current = current.next
        }
        else {
            println("No hay pagina siguiente")
        }
    }
}