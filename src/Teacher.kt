class Teacher(
    val fistName: String,
    val lastName: String,
    val age: Int,
    val gender: String,
    val currentSubject: String,
    val students: Array<Student>) {
    fun getLetterGrade(): String
        return studentWithHighestGrade().toString()
         when (studentWithHighestGrade) {
            90 -> println("A")
            in 0..50 -> println("F")
            75 -> println("C+")
            else -> println("N/A")
        }


        //TODO add info
        return ()


    }