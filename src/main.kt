fun main() {
    //question1
    var carol = Human("Carol",18,45)
    println(carol.weight)
    carol.eat(5)
    println(carol.weight)
    carol.speak("Hey, how are you today")
    println(carol.age)
    carol.birthday()

    //question2
    var joana =User("Munduru","joana","mundujoana@gmail.com","+256753489877","joaNa252@@#")
    println(joana.email)
    println(joana.firstName)
}
//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//-eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
//and increments the human’s weight by the weight of the food eaten (3 points)
//-speak(speech: String) :Prints the string passed toit                (2
//points)
//-birthday( ) :Increments the human’s age by 1(2 points)
//Create an instance of this human class and invoke all its functions

class Human(var name:String, var age:Int, var weight:Int) {
    fun eat(foodWeight: Int):Int {
        weight +=foodWeight
        println("I am eating ${foodWeight}kgs of food")
        return weight
    }

    fun speak(speech:String){
        println(speech)
    }

    fun birthday(){
        age=age+1
        println(age)
    }

}


//2.Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User  and print out any 2
//attributes

data class User(var firstName:String, var lastName:String, var email:String,
                var phoneNumber:String, var password:String){
}