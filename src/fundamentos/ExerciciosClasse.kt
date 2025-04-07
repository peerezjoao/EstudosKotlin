package fundamentos

/* 1. Define a data class Employee with two properties: one for a name, and another for a salary.
Make sure that the property for salary is mutable, otherwise you won’t get a salary boost at the end of the year!
The main function demonstrates how you can use this data class.
*/

class Employee(val name: String, var salary:Int) {

    fun showData() {
        println("Name: $name - Salary: $salary")
    }
}

/* 2. Declare the additional data classes that are needed for this code to compile.*/
data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)
// Name, Address and City
data class Name(val first: String, val last: String)
data class Address(val street: String, val city: City)
data class City(val name: String, val countryCode: String)

fun main() {
    val emp = Employee("Mary", 20)
    println(emp.showData())
    emp.salary += 10
    println(emp.showData())

    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )

}