data class Professor(
        var nome: String,
        var sobrenome: String,
        var codigoProfessor: Int,
        var tempoCasa: Int
) {
    override fun equals(other: Any?): Boolean {
        return when {
            this === other -> true
            other !is Professor -> false
            codigoProfessor != other.codigoProfessor -> false
            else -> true
        }
    }
}