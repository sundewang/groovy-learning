/**
 * 闭包的使用
 */

def list = ["Groovy", "Java", "Ruby"]

list.each {
    println it
}

list.each {
    v -> println v
}

def hash = [name:"Andy", age: 45]

hash.each { key, value ->
    println "${key} : ${value}"
}