class ProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        tempoCasa: Int,
        var especialidade: String
) : Professor(nome, sobrenome, codigoProfessor, tempoCasa)