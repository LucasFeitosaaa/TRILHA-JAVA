abstract class Conteudo {
    private String titulo; 
    private String duracao;
    
    
    public Conteudo(String titulo, String duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public String getDuracao() {
        return duracao;
    }
    
    public abstract String detalhes();

    }

