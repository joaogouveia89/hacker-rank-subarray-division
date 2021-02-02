fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var ways = 0
    var sum = 0
    
    (0..s.size).forEach { index ->
         if (index + m > s.size) return@forEach
         
         (index..(index + m - 1)).forEach{ index2 ->
             sum += s[index2]
         }
         
         if(sum == d) ways++
         
         sum = 0
     } 
    
    return ways
}