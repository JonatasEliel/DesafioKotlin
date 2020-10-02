class Curso(
        var nome: String,
        var codigoCurso: Int,
        var professorTitular: ProfessorTitular,
        var professorAdjunto: ProfessorAdjunto,
        val qtdeMaxAlunos: Int,
        var listaAlunos: MutableList<Aluno>
) {
    constructor(nome: String, codigoCurso: Int, qtdeMaxAlunos: Int)

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