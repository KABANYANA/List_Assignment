fun main() {

println( evenIndex(listOf("Joyce","Shila", "lekishon", "Cynthia", "Joy", "Landy", "Floris", "Nancy", "Arnaud", "Ishimwe")))
println(peopleHeight(listOf(12.4,34.7,23.5,15.8,40.2)))

    println(mill())


}



//    Given a list of 10 strings, write a function that returns a list of the strings
//    at even indices i.e index 2,4,6 etc

fun evenIndex(names:List<String>):List<String> {
var newList = names.filter { n->(names.indexOf(n)%2)==0 && (names.indexOf(n))!=0   }
    return newList
}

fun peopleHeight(heights:List<Double>):List<Double>{
   var total= heights.sum()
    var avg= heights.average()
 var result = listOf(avg, total)
    return result
}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
 data class Student(var name:String, var age:Int, var height:Double, var weight:Double) {
    fun studentList() {
        var st1 = Student("Nancy", 22, 1.78, 70.3)
        var st2 = Student("Mwamkinga", 23, 1.50, 70.0)


        var stList = listOf(st1, st2)
        var sorted = stList.sortedBy { student -> student.age }
        println(sorted)
    }
}













//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:String,var mileage:Double)
fun mill():Double {
    var c1 = Car("ABC123", 100.00)
    var c2 = Car("DEF456", 200.00)
    var c3 = Car("GHI789", 150.00)

    var cars = listOf(c1, c2, c3)

    var sum = 0.0
    for (c in cars) {
        sum += c.mileage


    }
    val avg= sum / cars.size
    return avg
}





