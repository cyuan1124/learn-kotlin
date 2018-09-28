package com.chefmic.kotlin.adv

import java.util.*

const val MAXIMUM_BOOKS = 5

class MyClass {

    companion object {
        const val CONSTANT = "constant inside companion"
    }

}

object Constants {
    const val BASE_URL = "http://www.turtlecare.net/"
}

fun Book.weight() = pages * 1.5.toInt()

fun Book.tornPages(torn: Int) {
    pages -= torn
}

class Puppy() {

    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(book.pages))
    }

}

class Book(private val title: String,
           private val author: String,
           private val year: Int) {


    var pages: Int = 0

    fun printUrl() {
        println(Constants.BASE_URL + title + ".html")
    }

    fun canBorrow(borrowed: Int) = borrowed < MAXIMUM_BOOKS

    fun info(): Pair<String, Int> = title to year

    fun fullInfo(): Triple<String, String, Int> = Triple(title, author, year)

}

fun main(args: Array<String>) {
    val book = Book("Harry Potter", "J.K Rowling", 2001)
    val fullInfo = book.fullInfo()

    println("Here is your book ${fullInfo.first} written by ${fullInfo.second} in ${fullInfo.third}")

    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val library = mapOf("Shakespeare" to allBooks)
    println(library.any { it.value.contains("Hamlet") })

    val moreBooks = mutableMapOf("Whilhelm Tell" to "Schiller")
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }
    println(moreBooks)
}