/**
 * @author sundewang* @date 18-12-7
 */

def range = 0..4
println range.class
assert range instanceof List

def coll = ["Groovy", "Java", "Scala"]
println coll.class
coll.add("Python")
coll << "C"
coll[5] = "Perl"
assert coll[1] == "Java"

def numbers = [1, 2, 3, 4]
println(numbers.join(","))