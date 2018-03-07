/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Sembrador {

    void sembrarCorazones(Celda lasCeldas[][], int cantidad) {

        for (Celda[] laFila : lasCeldas) {
            for (Celda laCelda : laFila) {

                Corazon unCorazon = new Corazon();

                Random r = new Random();

                int cualquierCorazon = r.nextInt(10) + 1;
                if (cualquierCorazon > 5) {
                    laCelda.setMiCorazon(unCorazon);
                } else {
                    laCelda.setMiCorazon(null);

                }

            }
        }
    }
      void BuscarCorazones(Celda lasCeldas[][],int x, int y){
          int fila=0;
          int columna=0;
          int contador=0;
       for (x=-1; x<2; x++){
           for (y=-1; y<2; y++){
               
               if(lasCeldas[fila+x][columna+y].getMiCorazon()!=null){
                   contador++;
                   
               }
           }
       }
    }
}

    
