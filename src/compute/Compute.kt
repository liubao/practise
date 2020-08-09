package compute

object Compute {

    @JvmStatic
    fun main(vararg s: String) {
        val a = arrayOf(7, 1, 2, 6)
        insertSort(a)
        printlnArray(a)
    }

    fun printlnArray(a: Array<Int>) {
        for (e in a) {
            print("$e,")
        }
    }
    /*
    插入排序，时间复杂度
     */

    fun insertSort(a: Array<Int>) {
        //从数组第二个开始
        for (i in 1 until a.size) {
            val key = a[i]
            var j = i - 1
            //从后向前查找合适的插入位置，不是合适的插入位置，
            //就将对应位置的数字向后移动，找到合适的插入位置退出
            //循环
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j]
                j--
            }
            //最后将key赋值给找到的插入位置
            a[j + 1] = key
        }
    }
}