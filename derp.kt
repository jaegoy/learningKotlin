class Main {
}@Test fun testShowHelloPerson() {
val helloWorldObject = HelloWorld()
    val exepectedPerson = "Jill"

assertEquals(expected "Hello!" $exepectedPerson!",
    helloWorldObject.showHelloPerson(name = expectedPerson"

    fun arithmeticSeriesSum(a: Int = 1, n: Int, d: Int = 1): Int {
        return n/2 * (2*a + (n-1)*d)
    }