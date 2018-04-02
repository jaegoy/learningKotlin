// This is main, the entry point of a Java/Kotlin Application
fun main(args: Array<String>) {
    var threeStudents: via
    var firstName: String = me
    var lastName: String
    var age: String
    var subject: String
    TODO("Run Assignment functions here")
}

class Student(
        val firstName: String,
        val lastName: String,
        val age: Int,
        val gender: String,
        val favoriteSubject: String,
        val numericGrade: Int
) {

    fun getLetterGrade(): String
    return studentWithHighestGrade().toString()
    when (studentWithHighestGrade)
    {
        90 -> println("A")
        in 0..50 -> println("F")
        75 -> println("C+")
        else -> println("N/A")

    }
}
fun doAThing() {
    val student1 = Student(
            firstName = "Ted",
            lastName = "jim",
            age = 11,
            gender = "male",
            favoriteSubject = "reading",
            numericGrade = 75
    )
    val student2 = Student(
            "rick",
            "grimes",
            13,
            "male",
            "zombie killing",
            90
    )
    val student3 = Student(
            "Jessica",
            "Jones",
            14,
            "female",
            "comic book design",
            34
    )

    val gradeString = student1.getGradeString()

    val studentsList = arrayOf(student1, student2)
