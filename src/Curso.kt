data class Curso(
        var nome: String,
        var codigoCurso: Int,
        var professorTitular: ProfessorTitular,
        var professorAdjunto: ProfessorAdjunto,
        val qtdeMaxAlunos: Int,
        var listaAlunos: MutableList<Aluno>
) {
    override fun equals(other: Any?): Boolean {
        return when {
            this === other -> true
            other !is Curso -> false
            codigoCurso != other.codigoCurso -> false
            else -> true
        }
    }
}