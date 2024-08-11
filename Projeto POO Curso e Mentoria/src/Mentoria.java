public class Mentoria extends Conteudo {

    private String professor;

    public Mentoria(String titulo, String duracao, String mentor) {
        super(titulo, duracao);
        this.professor = mentor;
    }

    @Override
    public String detalhes() {
        return "Mentoria: " + getTitulo() + ", Duração: " + getDuracao() + " Nome do professor " + professor;
    }
    }
    

