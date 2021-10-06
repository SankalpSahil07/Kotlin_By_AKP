package Ranges_In_Kotlin

fun main(){
    rangeInt()
    rangeIntUntil()
    rangeDownTo()
    rangeReversed()
    rangeStep()
    rangeStep2()
    rangeChar()
    rangeIntStep()
    rangeIntStep2()
}

fun rangeInt(){
    val intRange : IntRange = 1..10   // 'a'...'z'  || 'A'..'Z'
    for (iR in intRange){    // Range of Int 1 to 10
        println("$iR")
    }
}
fun rangeIntUntil(){
    val  intUntilRange : IntProgression  = 1 until 10
    for (iuR in  intUntilRange){    // Until of Int prints from 1 to 9 only
        print("$iuR")
    }
}
fun rangeDownTo(){
    val intRangeDown : IntProgression = 10 downTo 1
    for (iRD in intRangeDown){   // downTo of Int prints from 10 to 1
        println("$iRD")
    }
}
fun rangeReversed(){
    val rev = 1..10
    for (rng in rev.reversed()){   // Reversed of Int in reversed 10 to 1
        println("$rng")
    }
}
fun rangeStep(){
    val rs : IntProgression = 1..20
    for (rngStep in rs step 2){ // Step skips on value of the range
        println("$rngStep")
    }
}
fun rangeStep2(){
    val rs2: IntProgression = 2..20
    for (rngStep2 in rs2 step 2){ // Step skips on value of the range
        println("$rngStep2")
    }
}
fun rangeChar(){
    val a2z : CharRange = ('a'..'z')
    val read = a2z.iterator()  // prints the Char range from a to z
    while (read.hasNext())
        print("${read.next()}")
}
fun rangeIntStep(){
    val rngInt  = 1.rangeTo(20)
    for (rg in rngInt)  // for(rg in rngInt step 2)
        print("$rg")
}

fun rangeIntStep2(){
    val rng = IntRange(1,10)
    for (rg in rng ){  // for(r in rng step 2)
        println("$rg")
    }
}



