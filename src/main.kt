fun main(){
    strings(arrayOf("Ashly", "Steve", "Titus", "Monica"))
    grammar(arrayOf("harare", "mumbai", "dodoma", "jakarta"))
    integers()
    var names = arrayOf("Noellah","Austine", "Saul" )
    println(names.contentToString())
}
fun strings(names: Array<String>){
    println(names.contentToString())
}
fun grammar(names:Array<String>){
    names.forEach{names ->
        println(names.capitalize())
    }
}
fun integers(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = (numbers[1]+numbers[4])
    println(sum)
    println(numbers.indexOf(158))
    var sortedNumbers = numbers.sortedArray()
    println(sortedNumbers.contentToString())
}
fun name(names: Array<String>):Array<String>{
    return names
}

