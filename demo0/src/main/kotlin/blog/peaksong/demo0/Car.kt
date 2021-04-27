package blog.peaksong.demo0

class Car(num1: String) {

    private var num: String

    init {
        this.num = num1
    }

    override fun toString(): String {
        return "I'm car $num"
    }
}