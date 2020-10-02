fun main(){
    val manager = DigitalHouseManager()

    manager.matricularAluno("Jessica","Lima", 1)
    manager.matricularAluno("Rodrigo","Santos", 2)
    manager.matricularAluno("José","Abreu", 3)
    manager.matricularAluno("Maria","Pereira", 4)
    manager.matricularAluno("Pedro","Gabriel", 5)

    manager.registrarProfessorTitular("Carlos","Adão", 1, "Flutter")
    manager.registrarProfessorTitular("Vitoria","Gonçalves", 2, "Flutter")

    manager.registrarProfessorAdjunto("Joao","Felipe",3,5)
    manager.registrarProfessorAdjunto("Wagner","Silva",4,4)

    manager.registrarCurso("Full Stack",20001,3)
    manager.registrarCurso("Android",20002,2)

    manager.alocarProfessores(20001,1,3)
    manager.alocarProfessores(20002,2,4)

    manager.matricularAluno(1,20001)
    manager.matricularAluno(2,20001)

    manager.matricularAluno(3,20002)
    manager.matricularAluno(4,20002)
    manager.matricularAluno(5,20002)
}