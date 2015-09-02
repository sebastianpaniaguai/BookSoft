package booksoft;
import java.util.Scanner;
public class Libro {
    
    private String nombre,autor,pubYear,codigo,area;
    private int cant; boolean flag;
    public Scanner teclado=new Scanner(System.in);
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getPubYear() {
        return pubYear;
    }
    public void setPubYear(String pubYear) {
        this.pubYear = pubYear;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getCant() {
        return cant;
    }
    public void setCant(int cant) {
        this.cant = cant;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public boolean getFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    public void ingresarLibro(){
        System.out.println("Accediendo al sistema...");
        System.out.println("Ingrese el nombre del libro: ");
        nombre=teclado.next();
        System.out.println("Ingrese el nombre del autor: ");
        autor=teclado.next();
        System.out.println("Ingrese el año de publicacion: ");
        pubYear=teclado.next();
        System.out.println("Ingrese la cantidad de libros disponibles: ");
        cant=teclado.nextInt();
        System.out.println("Ingrese el area de estudio de la publicacion: ");
        area=teclado.next();
        System.out.println("Informacion actualizada con exito.");
        flag=true;
        System.out.println("La publicacion ha sido almacenada con el codigo: "+codigo);
    }
    public void actualizarLibro(){
        System.out.println("Esta a punto de cambiar los datos de un libro: ");
        int op;
        do{
            System.out.println("1. Cambiar nombre del libro");
            System.out.println("2. Cambiar nombre del autor");
            System.out.println("3. Cambiar año de la publicacion");
            System.out.println("4. Cambiar cantidad de libros disponibles");
            System.out.println("5. Cambiar area del libro");
            System.out.println("0. Salir");
            op=teclado.nextInt();
            switch(op){
                case 0:
                    break;
                case 1:
                    System.out.println("Actualmente el nombre es: "+nombre);
                    System.out.println("Esta seguro que desea modificar?[y/n]");
                    if(teclado.next().compareTo("y")==0){
                        System.out.println("Ingrese el nuevo nombre del libro: ");
                        nombre=teclado.next();
                    }
                    else break;
                    break;
                case 2:
                    System.out.println("Actualmente el nombre del autor es: "+autor);
                    System.out.println("Esta seguro que desea modificar?[y/n]");
                    if(teclado.next().compareTo("y")==0){
                        System.out.println("Ingrese el nuevo nombre del autor: ");
                        autor=teclado.next();
                    }
                    else break;
                    break;
                case 3:
                    System.out.println("Actualmente el año de publicacion es: "+pubYear);
                    System.out.println("Esta seguro que desea modificar?[y/n]");
                    if(teclado.next().compareTo("y")==0){
                        System.out.println("Ingrese el nuevo año de publicacion: ");
                        pubYear=teclado.next();
                    }
                    else break;
                    break;
                case 4:
                    System.out.println("Actualmente el numero de libros disponibles es: "+cant);
                    System.out.println("Esta seguro que desea modificar?[y/n]");
                        if(teclado.next().compareTo("y")==0){
                        System.out.println("Ingrese la nueva cantidad de libros: ");
                    cant=teclado.nextInt();
                    }
                    else break;
                    break;
                case 5:
                    System.out.println("Actualmente el area de estudio es: "+area);
                    System.out.println("Esta seguro que desea modificar?[y/n]");
                    if(teclado.next().compareTo("y")==0){
                        System.out.println("Ingrese el area a la que pertenece el libro: ");
                        area=teclado.next();
                    }
                    else break;
                    break;
            }
        } while (op!=0);
    }
    public void eliminarLibro(){
        System.out.println("Esta seguro que desea eliminar este libro?[y/n]");
            if(teclado.next().compareTo("y")==0){
                nombre=" ";
                autor="";
                pubYear="";
                cant=0;
                flag=false;
            }
            else System.out.println("Regresando al menu...");
    }
    public Libro buscarLibro(String libro){
        if (nombre.compareTo(libro)==0){
            System.out.println("Mostrando coincidencias...");
            System.out.println(nombre);
            System.out.println(codigo);
            System.out.println(autor);
            System.out.println(pubYear);
            System.out.println(cant);
            return this;
        }
        else
            System.out.println("El libro no esta en la coleccion");
        return null;
    }
}
