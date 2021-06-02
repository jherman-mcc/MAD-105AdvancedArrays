fun main(args: Array<String>) {
    var input1 = 0
    var input2 = 0
    var temp = 0
    var iceCream = arrayOf<String>("vanilla","chocolate","strawberry","Rocky Road","carmel")
    var gallons1 = arrayOf<String>("5","2","10","6","2")
    var gallons2 = arrayOf<Int>(5,2,10,6,2)

    // for (i in 0..iceCream.size -1) {
    //   println("Element: ${gallons1[i]}")
    //   println("Element: ${gallons2[i]}")
    // }
    var combArray = arrayOf<Array<String>>()
    combArray += iceCream
    combArray += gallons1


    var rowcount = combArray[0].size -1

    for (i in 0..rowcount) {
        var a_index = i
        var a_item = combArray[0][i]
        var a_qty = combArray[1][i]
        println("$a_index) Item: $a_item Gallons: $a_qty")
    }
    println("")
    println("Choose an item between 0 thru $rowcount")
    input1 = readLine()!!.toInt()
    println("Enter the amount of gallons to adjust (use negative number to subtract)  ")
    input2 = readLine()!!.toInt()
    temp = gallons2[input1]+input2
    if (temp < 0) gallons2[input1] = 0
        else
            gallons2[input1] = temp
    println("Item: ${combArray[0][input1]}  Original Gallons: ${combArray[1][input1]}  New Qty: ${gallons2[input1]}")
}