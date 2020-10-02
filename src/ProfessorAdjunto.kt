class ProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        tempoCasa: Int,
        var qtdeHrsMonitoria: Int
) : Professor(nome, sobrenome, codigoProfessor, tempoCasa)