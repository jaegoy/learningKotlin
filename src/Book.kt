// Book Class, with the following Properties:
// Title -> A String
// Author -> A String
// optional ISBN number as a String
// method to Print Description of Book


// Primary Constructor
class Book(val title: String, val author: String) {
  fun printDescription() {
    println("Title: $title : Author: $author")
  }

  fun description(): String {
    return "Title: $title : Author: $author"
  }
}

// Secondary Constructor you can have multiple ways to construct a class.
/* class FancyBook {
  val title: String
  var author: String = null
  var year: Int = null

  constructor(val title: String, val year: Int) {
    this.title = title
    this.year = year
  }

  constructor(val title: String, val author: String) {
    this.title = title
    this.author = author
  }
} */

val myBooks = arrayOf(
  Book(title = "Harry Potter", author = "Rowling"),
  Book(title = "It's Forgotten", author = "Yes")
)
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/for-each.html
mybooks.forEach() {
  println($it.description)
}


val harryPotter = Book(title = "Harry Potter", author = "Rowling")
val forgotenBook = Book(title = "It's Forgotten", author = "Yes")

harryPotter.printDescription()
forgotenBook.printDescription()

harryPotter.title
harryPotter.printDescription()

val `number of floors` = 20
val forgotHerName = Author("forgotHerName")

/* val vamp = Book("Interview with the vampire") */

class House(val numberOfFloors: Int, val hasKitchen: Boolean, val address: String) {
  fun cookInHouse() {
    if (hasKitchen)
    println("the meal was wesome")
derp
  }
