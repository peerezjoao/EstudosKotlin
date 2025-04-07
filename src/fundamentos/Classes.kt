package fundamentos

fun main() {

    val studentOne: Student = Student(1, "peerezjoao1@gmail.com")
    studentOne.showData()
}

class Student(val id: Int, var email: String = "unknow email") {

    fun showData() {
        println("ID: $id \n" +
                "Email: $email")
    }

    fun printId() {
        println("ID input: $id")
    }
}