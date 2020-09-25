package farees.hussain.testingapps

object Magnets {
    fun noOfGroupsOfMagnets(n : Int, magnets: Array<String>) : Int{
        var result = 0
        for(i in 0..n-2) if (magnets[i]!=magnets[i+1]) result++
        return ++result
        // ~~ simple solution ~~
    }
}