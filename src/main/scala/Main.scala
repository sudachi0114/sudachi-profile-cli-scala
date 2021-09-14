object Main extends App {
    println("Hello, sudachi-cli")

    def printPrompt(): Unit = print("sudachi 🍊 > ")

    Iterator.continually {
        printPrompt()
        scala.io.StdIn.readLine()
    }.foreach {
        case "exit" =>
            println("bye ﾉｼ ")
            System.exit(0)
        case x => println(x)
    }
}