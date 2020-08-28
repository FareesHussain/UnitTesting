package farees.hussain.testingapps

object TestingSomemoreFunctions {

    /**
     * incorrect when
     * ... fib of
     */
    fun fib(n:Int):Long{
        if(n == 0 || n==1 ){
            return n.toLong()
        }
        var a = 0L
        var b = 1L
        var c = 0L
        (1..n-2).forEach{
            c = a + b
            a = b
            b = c
        }
        return c
    }

    /**
     *incorrect when
     * ... no of '(' not equals to ')'
     * ... no of '{' not equals to '}'
     * ... no of '[' not equals to ']'
     */

    fun checkBraces(string: String):Boolean{
        return (string.count { it == '('} == string.count{ it== ')' }) && (string.count { it == '{'} == string.count{ it== '}' }) && (string.count { it == '['} == string.count{ it== ']' })
    }
}