public class Main {
    public static void main(String[] args) {
        
    
    Curso curso = new Curso("Java basico", "18 meses", "segundo.");
    Mentoria mentoria = new Mentoria("Mentoria de Desenvolvimento de Software",  "Um ano", "Ana Silva");
    
    System.out.println(curso.detalhes());   
    System.out.println(mentoria.detalhes()); 
    
    }

}

        

