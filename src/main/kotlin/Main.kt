fun main(){
names("mercy")
    digits(299058922)

    product(5,8)
    deposit(100.0)
    withdraw(60.0)
    details(334,29,30,"mercy")
}

//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun names(name:String){
    var name="mercy".length

        println(name)







}

 //Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
// Must be at least 8 characters long
//Must be at most 16 characters long
 //Must not be “password”
 //Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
fun digits(password:Int) {
    for(num in 0..16){
        if(16%2!==8){
            println(false)
        }else{
            println(true)
        }
    }
 }

//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun product(num1:Int,num2:Int) {
    var num = num1 * num2
    for (num in 1..1000) {

        var bingo=num1*num2

println(bingo)
    }

}


    //Create a class CurrentAccount with the following attributes: account number,
    //account name, balance. It has the following functions:
    //a. deposit(amount: Double) - Increments the balance by the amount
         //   deposited
    //b. withdraw(amount: Double) - Decrements the balance by the amount
          //  withdrawn
  //  c. details() - Prints out the account number and balance and name in
         //   this format: “Account number x with balance y is operated by z” (6pts)

open class account(var accountnumber:Int, var accountname:String, var balance:Int )

    fun deposit(amount: Double) {

        var balance = 50
        println(balance++)


    }

    fun withdraw(amount:Double){
        var balance=70
        println(balance--)

    }
        fun details(accountnumber: Int,X:Int,y:Int,z:String){
            println("my account number is $X with balance of $y by $z")

        }

//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

//class savingsAccount(accountnumber:Int,accountname:String,balance:Int ):accountnumber:Int, accountname :String,balance:INt
//fun Deposit(amount: Double){
//
//}