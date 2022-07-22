package main
import "fmt"

func Fibonacci(n int) {
	var n3, n1, n2 int = 0, 0, 1
	for i := 1; i <= n; i++ {
		fmt.Println(n1)
		n3 = n1 + n2
		n1 = n2
		n2 = n3
	}
}
func factorial(num int) int {
	if num == 1 || num == 0 {
		return num
	}
	return num * factorial(num-1)
}
func main() {
	Fibonacci(10)
	fmt.Println("Factorial =", factorial(3))
	fmt.Println("Factorial =", factorial(4))
	fmt.Println("Factorial =", factorial(5))
}
