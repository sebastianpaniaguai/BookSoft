package booksoft;
public class Usuario extends Libro {
    private int cantPres;
    private String cc;
    private Libro[] prestado=new Libro[5];

    public int getCantPres() {
        return cantPres;
    }
    public void setCantPres(int cantPres) {
        this.cantPres = cantPres;
    }
    public String getCc() {
        return cc;
    }
    public void setCc(String cc) {
        this.cc = cc;
    }
    public Libro[] getPrestado() {
        return prestado;
    }
    public void setPrestado(Libro[] prestado) {
        this.prestado = prestado;
    }
    
    public void prestarLibro(){
        System.out.println("Ingrese el nombre del libro que desea prestar");
        String name=teclado.next();
        prestado[cantPres+1]=new Libro();
        prestado[cantPres+1]=buscarLibro(name);
        if (prestado[cantPres+1]!=null){
            cantPres+=1;
            System.out.println("El libro fue agregado a su lista de prestamos.");
            System.out.println("Actualmente tiene "+cantPres+" libros prestados");
        }
        
    }
    public void devolverLibro(){
        System.out.println("Ingrese el nombre del libro que desea devolver");
        String name=teclado.next();
        for(int i=0;i<=cantPres;i++){
            if (buscarLibro(name).getNombre().compareTo(prestado[i].getNombre())==0){
                prestado[i].eliminarLibro();
                cantPres-=1;
                System.out.println("Libro devuelto con exito.");
            }
        }
        
    }
}
