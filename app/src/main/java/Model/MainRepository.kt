package Model

class MainRepository {
    fun getStudentData(): List<dataMain> {
        return listOf(
            dataMain("Taha",18,"tahakhan@gmail.com","NY,Wilson Street 18C"),
            dataMain("Luke",18,"akhsssan@gmail.com","NY,OFC Street 18C")
        )
    }

}