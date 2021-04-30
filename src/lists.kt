fun main(){
println(evenNames(listOf("stella","Grace","Angella","Belyse","Maggie","Martin","Joan","John","Brian","Kelvin")))
//    var human=personObjects.sortedByDescending { Person -> Person.age }
    age()
  person()
    println(heights(listOf(35.9,24.7,78.0,98.8)))

    var toyota= listOf(
        Car("KES109R",100),
        Car("KRA203",300),
        Car("KVA201",390)

    )
    println(averageMileage(listOf(100,300,390)))

}
fun evenNames(names:List<String>):List<String>{
    var studentString= mutableListOf<String>()
    names.forEachIndexed{index,character->
        if(index%2==0){
            studentString.add(character)
        }
    }
    return studentString

}
fun heights(height:List<Double>):Pair<Double,Double>{
    var sum =height.sum()
    var average =height.average()
    return Pair(sum,average)
}
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)
    fun age(){
    var personObjects = listOf(
        Person("Anna",21,123.7,45.3),
        Person("Kim",45,143.0,67.8),
        Person("Grace",20,124.8,56.6),
    )
        var human=personObjects.sortedByDescending { Person -> Person.age }
        println(human)
}
data class People(var name:String,var age:Int,var height:Double,var weight:Double)
fun person(){
    var personObjects = mutableListOf(
        Person("Anna",21,1.7,45.3),
        Person("Kim",45,1.0,67.8),
        Person("Grace",20,1.8,56.6),

        )
personObjects.addAll(listOf(
    Person("Martin",19,1.7,45.9),
    Person("Kelvin",18,1.9,72.1)
))
println(personObjects)

}
data class Car(var registration:String,var mileage:Int )
 fun averageMileage(mileage: List<Int>):Int{
     var x= mileage.average().toInt()
     return x

 }

