/*
programa q incluya un vector q almacene los nombres alejadgra, leonardo, rosa guillermo
gabriel daniel luisa y ludmila. realizar recorrido del vector para cargar datos y otro recorrido
para mostrar los datos
 */


public class Vectores {

    public static void main(String[] args) {
        //vector q guarde 8 nombres
        String vector[] = new String[4];

        //asignacion manual valores
        vector[0] = "Alejandra";
        vector[1] = "Ludmila";
        vector[2] = "Gabriel";
        vector[3] = "Rosa";


        //recorrido
        for (int i=0; i< vector.length; i++) {
            System.out.println("En la posición " + i + " esta el nombre de " + vector[i]);
        }


    }

}
