public class Curso extends Conteudo {

    private String periodo;
 
    
    public Curso(String titulo, String duracao, String periodo) {
        super(titulo, duracao);
        this.periodo = periodo;
    }

    

    @Override
    public String detalhes() {
    
        return "Curso: " + getTitulo() + ", Duração: " + getDuracao() + " Período: " + periodo;
    }

    
    
}  
    

