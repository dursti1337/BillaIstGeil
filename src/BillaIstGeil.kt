fun main (args:Array<String>) {

    println("Elektronische Einkaufsermahnung!")


    println("Gib ein, wie viel Marie du einstecken host:")
    var budget = readLine()!!.toInt()


    println("Gib ein, was du beim Billa ausm Fenster haust oida:")
    var ausgaben = readLine()!!.toInt()


    if (ausgaben > budget) {
        println("Bist wieder mal flach... hast nur $budget € einstecken!")
    } else println("Sie an, hast genug Geld mit... Na dann rüba mim Süba!")

    if (ausgaben > budget) {
        println("Herst I borg da was. Wieviel brauchst?")
        var entlehntesGeld = readLine()!!.toInt()

        var gesamtesGeld = budget + entlehntesGeld

        if (ausgaben > gesamtesGeld) {
            println("Du koffer hängst wie a Lax oder?")
        } else println("So jetzt kannst da $gesamtesGeld Bier kaufen!")
    }
}

