import java.util.*

data class Matricula(
        val aluno: Aluno,
        val curso: Curso,
        val dataMatricula: Date = Date()
){
    init {
        println("$aluno matriculado com sucesso no curso de $curso")
        println("Data: $dataMatricula")
    }
}