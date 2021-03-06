class Curso(
        var nome: String,
        var codigoCurso: Int,
        val qtdeMaxAlunos: Int
) {
    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto
    var listaAlunos: MutableList<Aluno> = mutableListOf()

    override fun toString(): String {
        return "$nome\ncód: $codigoCurso\nlimite: $qtdeMaxAlunos"
    }

    override fun equals(other: Any?): Boolean {
        return when {
            this === other -> true
            other !is Curso -> false
            codigoCurso != other.codigoCurso -> false
            else -> true
        }
    }

    fun addAluno(aluno: Aluno): Boolean {
        return when {
            listaAlunos.size > qtdeMaxAlunos -> {
                println("Não há vagas disponíveis para o curso de $nome.")
                false
            }
            else -> {
                listaAlunos.add(aluno)
                println("O(A) ${aluno.nome} foi adicionado(a) com sucesso.")
                true
            }
        }
    }

    fun delAluno(aluno: Aluno) {
        when {
            listaAlunos.isEmpty() -> println("Não há alunos cadastrados.")
            else -> listaAlunos.remove(aluno)
        }
    }
}