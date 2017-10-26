package StartingAgain;

import java.io.File;
import java.util.LinkedList;

public class FolderClass extends AbstractClass{

    private String space;
    private LinkedList<AbstractClass> archivos;

    public FolderClass(File file, String space) {
        super(file);
        archivos = new LinkedList<>();
        generadorLinked(file.listFiles());
        this.space = space;
    }

    public void generadorLinked(File[] file) {
        for (int x = 0; x < file.length; x++) {
            if (file[x].isFile()) {
                archivos.add(new Archivo(file[x]));
            } else if (file[x].isDirectory()) {
                archivos.add(new FolderClass(file[x], space));
            }
        }
    }
    
    
    
    public void listar(String space){
        for(int x = 0; x < archivos.size();++x){
            if(archivos.get(x) instanceof Archivo){
                System.out.println(space+"Archivo: "+archivos.get(x).getNombre());
            }else if (archivos.get(x) instanceof FolderClass) {
                System.out.println(space+"Carpeta: "+archivos.get(x).getNombre());
                String esp = space + "-";
                FolderClass p = (FolderClass) archivos.get(x);
                p.listar(esp);
            }
        }
    }
}
