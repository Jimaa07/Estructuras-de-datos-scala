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
}