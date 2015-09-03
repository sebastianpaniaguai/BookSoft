package booksoft;
import java.util.Scanner;
public class BookSoft {
    public static void main(String[] args) {
        int op;
        int libActual;
        int[] fl={0,0,0,0,0,0,0,0,0,0};//Array de banderas. cada una asociada a la existencia de un libro
        Usuario[] Libros=new Usuario[10];
        for(int i=0;i<9;i++)
            Libros[i]=new Usuario();
        Scanner teclado=new Scanner(System.in);
        do{
        System.out.println("*****************MENU*****************");
        System.out.println("1.Ingresar Libro");
        System.out.println("2.Actualizar Libro");
        System.out.println("3.Eliminar Libro");
        System.out.println("4.Buscar Libro");
        System.out.println("5.Prestar Libro");
        System.out.println("6.Devolver Libro");
        System.out.println("7.Visualizar libros prestados");
        System.out.println("0.Salir");
        op=teclado.nextInt();
        switch(op){
            case 0: break;
            case 1:
                System.out.println("Ingrese el codigo que desea agregarle al libro: [0-9]");
                libActual=teclado.nextInt();
                for(int i=0;i<9;i++){
                    if((Libros[i].getFlag()==true)&&(libActual==i)){
                        System.out.println("Ya existe un libro ocupando ese codigo. Intente con el siguiente");
                        break;
                    }
                    else if(libActual==i){
                        Libros[i].setCodigo(libActual);
                        Libros[i].ingresarLibro();
                        fl[i]=1;
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("Modificará los datos de un libro: Ingrese el nombre...");
                String name=teclado.next();
                for(int i=0;i<10;i++){
                    if(fl[i]==1){
                        if(Libros[i].getNombre().compareTo(name)==0){
                            Libros[i].actualizarLibro();
                            break;
                        }
                    }
                }
                break;
            case 3:
                System.out.println("Eliminara un libro: Ingrese el nombre...");
                name=teclado.next();
                for(int i=0;i<10;i++){
                    if(fl[i]==1){
                        if(Libros[i].getNombre().compareTo(name)==0){
                            Libros[i].eliminarLibro();
                            fl[i]=0;
                        }
                    }
                }
                break;
            case 4:
                System.out.println("Ingrese el nombre del libro que desea buscar: ");
                name=teclado.next();
                for(int i=0;i<10;i++){
                    if(fl[i]==1){
                        if(Libros[i].getNombre().compareTo(name)==0){
                            Libros[i].buscarLibro();
                        }
                    }
                }
                break;
            case 5:
                System.out.println("Ingrese el nombre del libro que desea prestar");
                name=teclado.next();
                for(int i=0;i<10;i++){
                    if(fl[i]==1){
                        if(Libros[i].getNombre().compareTo(name)==0){
                            Libros[i].prestarLibro(Libros[i]);
                        }
                    }
                }
                break;
            case 6:
                System.out.println("Ingrese el nombre del libro que desea devolver");
                name=teclado.next();
                for(int i=0;i<10;i++){
                    if(fl[i]==1){
                        if(Libros[i].getNombre().compareTo(name)==0){
                            Libros[i].devolverLibro();
                        }
                    }
                }
                break;
            case 7:
                for(int i=0;i<10;i++){
                    if(fl[i]==1){
                            Libros[i].librosPrestados();
                    }
                }
                break;
        }
        }while (op!=0);
    }
    
}
