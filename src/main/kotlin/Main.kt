fun main() {

println( evenIndex(listOf("Joyce","Shila", "lekishon", "Cynthia", "Joy", "Landy", "Floris", "Nancy", "Arnaud", "Ishimwe")))
println(peopleHeight(listOf(12.4,34.7,23.5,15.8,40.2)))

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
  open fun studentList(st1: Student,st2:Student,st3:Student,st4:Student) {

 var stList = listOf(st1, st2, st3, st4)
    var sorted = stList.sortedBy { student -> student.age }
   println(sorted)
  }
override
    }



//    var st6 = Student("Nancy", 22, 1.78,70.3)
//    var st7 = Student("Mwamkinga", 23, 1.50,70.0)
//    var newList =Student.add(st6)
//    var newList1 =Student.add(st7)




//}

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.




//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.