import static Square.square
import static Division.divide
import static Subtract.subtract
import static Sum.sum

def name = "Matthew"
int programmingPoints = 10

println "Hello ${name}"
println "${name} has at least ${programmingPoints} programming points."
println "${programmingPoints} squared is ${square(programmingPoints)}"
println "${programmingPoints} divided by 10 bonus points is ${divide(programmingPoints, 10)}"
println "${programmingPoints} minus 7 bonus points is ${subtract(programmingPoints, 7)}"
println "${programmingPoints} plus 3 bonus points is ${sum(programmingPoints, 3)}"