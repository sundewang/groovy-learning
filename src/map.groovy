/**
 * map usage
 */

def hash = [name:"sun", age: 25]
println hash.getClass()

// three set method
hash.put("id", 478)
hash.date ="2018/12/7"
hash["gender"] = "male"

// two get method
assert hash.gender == "male"
assert hash["gender"] == "male"

println(hash)