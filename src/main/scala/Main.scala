object Main extends App {
    println("Hello, sudachi-cli")

    def printPrompt(): Unit = print("sudachi 🍊 > ")

    def printHelp(): Unit = {
        println("[help]")
        println("\texit:")
        println("\t\texit sudachi-profile-cli")
    }

    Iterator.continually {
        printPrompt()
        scala.io.StdIn.readLine()
    }.foreach {
        case "exit" =>
            println("bye ﾉｼ ")
            System.exit(0)
        case "help" => printHelp()
        case x => println(x)
    }
}