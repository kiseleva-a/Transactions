fun main(args: Array<String>) {
    val amount = 1000
    var transaction = if (amount > 35) amount + amount*0.0075 else amount
    println("Сумма перевода с учетом комиссии: $transaction рублей")
}