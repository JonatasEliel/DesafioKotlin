class DigitalHouseManager {
    var listaAlunos: MutableList<Aluno> = mutableListOf()
    var listaProfessores: MutableList<Professor> = mutableListOf()
    var listaCursos: MutableList<Curso> = mutableListOf()
    var listaMatriculas: MutableList<Matricula> = mutableListOf()

    fun registrarCurso(
            nome: String,
            codigoCurso: Int,
            qtdeMaxAluno: Int
    ) = listaCursos.add(Curso(nome, codigoCurso, qtdeMaxAluno))

    fun excluirCurso(codigoCurso: Int) {
        listaCursos.forEach {
            when {
                it.codigoCurso == codigoCurso -> listaCursos.remove(it)
            }
        }
    }

    fun registrarProfessorAdjunto(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            qtdeHrsMonitoria: Int
    ) = listaProfessores.add(ProfessorAdjunto(nome, sobrenome, codigoProfessor, 0, qtdeHrsMonitoria))

    fun registrarProfessorTitular(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            especialidade: String
    ) = listaProfessores.add(ProfessorTitular(nome, sobrenome, codigoProfessor, 0, especialidade))

    fun excluirProfessor(codigoProfessor: Int) {
        listaProfessores.forEach {
            when {
                it.codigoProfessor == codigoProfessor -> listaProfessores.remove(it)
            }
        }
    }

    fun matricularAluno(
            nome: String,
            sobrenome: String,
            codigoAluno: Int
    ) = listaAlunos.add(Aluno(nome, sobrenome, codigoAluno))

    fun matricularAluno(
            codigoAluno: Int,
            codigoCurso: Int
    ) {
        val aluno: Aluno? = listaAlunos.firstOrNull { it.codigoAluno == codigoAluno }
                ?: throw Exception("Aluno não cadastrado")

        val curso: Curso? = listaCursos.firstOrNull { it.codigoCurso == codigoCurso }
                ?: throw Exception("Curso não cadastrado")

        when {
            aluno != null -> {
                curso?.addAluno(aluno)
            }
        }

        when {
            aluno != null && curso != null -> {
                listaMatriculas.add(Matricula(aluno, curso))
            }
        }
    }

    fun alocarProfessores(
            codigoCurso: Int,
            codigoProfessorTitular: Int,
            codigoProfessorAdjunto: Int
    ) {
        val curso: Curso? = listaCursos.firstOrNull { it.codigoCurso == codigoCurso }
                ?: throw Exception("Curso não cadastrado")

        val professorTitular: ProfessorTitular? = (listaProfessores.firstOrNull { it.codigoProfessor == codigoProfessorTitular }
                ?: throw Exception("Professor titular não cadastrado")) as ProfessorTitular?

        val professorAdjunto: ProfessorAdjunto? = (listaProfessores.firstOrNull { it.codigoProfessor == codigoProfessorAdjunto }
                ?: throw Exception("Professor adjunto não cadastrado")) as ProfessorAdjunto?

        when {
            professorTitular != null -> {
                curso?.professorTitular = professorTitular
            }
        }

        when {
            professorAdjunto != null -> {
                curso?.professorAdjunto = professorAdjunto
            }
        }
    }
}