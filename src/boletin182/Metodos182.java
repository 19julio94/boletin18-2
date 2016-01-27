package boletin182;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Metodos182 {

    private int numAlumnos=pedirAlumnos();
    private int notasModulo[] = new int[numAlumnos];

    public Metodos182() {
    }

    public int pedirAlumnos() {
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de alumnos"));

    }

    public int pedirNota() {
       return Integer.parseInt (JOptionPane.showInputDialog("Introduce  nota"));

    }
    public void cargarArray(){
    
    for (int i=0; i< notasModulo.length;i++){
        notasModulo [i]=pedirNota();
    
    }
    
    }

    public void visualizarAprobSus() {
        int a = 0;
        int s = 0;
        for (int j = 0; j < notasModulo.length; j++) {
            if (notasModulo[j] < 5) {
                s++;
            } else {
                a++;
            }
        

        }
JOptionPane.showMessageDialog(null, "O numero de aprobados son: "+a+"\n o numero de suspendos e: "+s);
    }
public void calcularMedia(){
int acumulador=0;
int notaMedia;

    for (int i = 0; i < notasModulo.length; i++) {
              
                acumulador=acumulador+notasModulo[i];
    }    
    notaMedia= acumulador/notasModulo.length;
    
    JOptionPane.showMessageDialog(null, "Nota Media: "+notaMedia);
}



public void ordenarNotas() {
        int i, j, aux;
       
        for (i = 0; i < numAlumnos - 1; i++) {

            for (j = i+1; j < numAlumnos; j++) {

                if (notasModulo[i] > notasModulo[j]) {
                    
                    aux=notasModulo[i];
                    notasModulo[i]=notasModulo[j];
                    notasModulo[j]=aux;
                    
                    
                    
                }
    
    

}



}


}
}
