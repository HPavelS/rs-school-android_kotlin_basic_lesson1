fun main() {
    val a1 = Animal()
    val b1 = Animal()

    val d1 = a1
    if (a1 == d1)
        println("ravny")
    val array = Array(5) {i -> i * i} // перемножение индексов
    array.forEach { print("$it ") }
}

class Animal(val name:String=" ", val age:Int = 2){

}