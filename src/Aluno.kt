data class Aluno (
        var nome: String,
        var sobrenome: String,
        var codigoAluno: Int
){
    override fun equals(other: Any?): Boolean {
        return when {
            this === other -> true
            other !is Aluno -> false
            codigoAluno != other.codigoAluno -> false
            else -> true
        }
    }

    override fun toString(): String {
        return "$nome $sobrenome - cód: $codigoAluno"
    }
}