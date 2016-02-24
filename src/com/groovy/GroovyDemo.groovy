package com.groovy


void doSomething(Closure someClosure, int a, int b) {
	someClosure(a, b)
}


Closure add = { a, b ->
	println a + b
}
int c = 21

Closure sub = { a, b ->
	println a - b + c
}

doSomething(add, 10, 20)

doSomething(sub, 20, 10)