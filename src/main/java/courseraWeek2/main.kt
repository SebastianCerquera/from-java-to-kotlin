package courseraWeek2

fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    s1.isEmptyOrNull() == true
    s2.isEmptyOrNull() == true

    val s3 = "   "
    s3.isEmptyOrNull() == false
}

fun String?.isEmptyOrNull() = this ==null || this.isEmpty()