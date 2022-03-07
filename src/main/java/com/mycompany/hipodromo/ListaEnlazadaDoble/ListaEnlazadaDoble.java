package com.mycompany.hipodromo.ListaEnlazadaDoble;

import com.mycompany.hipodromo.Persona.Apuesta;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JTextArea;

/**
 *
 * @author Melanni Tzul
 */
public class ListaEnlazadaDoble {

    //Variables que me sirven para conectar mi lista enlazada con apuesta 
    Apuesta cabeza;
    Apuesta cola;
    JTextArea ApuestasEliminadas = new JTextArea();

    //Creo el constructor con sus parametros incializados
    public ListaEnlazadaDoble() {

    }

    //Utilizando la notación BigO
    //  Complejidad O(1)   
    public void AgregarAlFinal(Apuesta ApuestaAgregar) {
        if (cabeza == null && cola == null) {
            cabeza = ApuestaAgregar;
            cola = ApuestaAgregar;

        } else {
            cola.setSiguiente(ApuestaAgregar);//Ingresamos a la cola una nueva apuesta
            cola.getSiguiente().setAnterior(cola);//Obtenemos la apuesta ingresada y modificamos el anterior agregnadole la cola ahi es donde lo enlazamos    
            cola = cola.getSiguiente();//ahora asignamos el nuevo valor de la cola que va ser la apuesta ingresada 
        }

    }
    
    public void InicializarVerificacion(){
        verificarApuesta(cabeza);
        crearArchivoEliminadas();
  
        
    }

    //Utilizando la notación BigO
    //  Complejidad O(n)   
    //Metodo para ingresar mis apuestas almacenadas en el arrayApuesta a mi ListaEnlazada para que pueda manejar mis apuestas
    public void AgregarApuestasAListaEnlazadaDoble(Apuesta[] arrayApuestas) {
        for (int i = 0; i < arrayApuestas.length; i++) {
            AgregarAlFinal(arrayApuestas[i]);
        }
    }

    /*
    *Funcion para verificar las apuestas repetidas
     */
    public boolean VerificarRepitencia(Apuesta verificarApuesta) {
        boolean numero1 = false;
        boolean numero2 = false;
        boolean numero3 = false;
        boolean numero4 = false;
        boolean numero5 = false;
        boolean numero6 = false;
        boolean numero7 = false;
        boolean numero8 = false;
        boolean numero9 = false;
        boolean numero10 = false;

        for (int i = 0; i < verificarApuesta.getArrayPocisiones().length; i++) {
            switch (verificarApuesta.getArrayPocisiones()[i]) {
                case 1:
                    if (!numero1) {
                        numero1 = true;
                    } else {
                        return true;
                    }
                    break;
                case 2:
                    if (!numero2) {
                        numero2 = true;
                    } else {
                        return true;
                    }
                    break;
                case 3:
                    if (!numero3) {
                        numero3 = true;
                    } else {
                        return true;
                    }
                    break;
                case 4:
                    if (!numero4) {
                        numero4 = true;
                    } else {
                        return true;
                    }
                    break;
                case 5:
                    if (!numero5) {
                        numero5 = true;
                    } else {
                        return true;
                    }
                    break;
                case 6:
                    if (!numero6) {
                        numero6 = true;
                    } else {
                        return true;
                    }
                    break;
                case 7:
                    if (!numero7) {
                        numero7 = true;
                    } else {
                        return true;
                    }
                    break;
                case 8:
                    if (!numero8) {
                        numero8 = true;
                    } else {
                        return true;
                    }
                    break;
                case 9:
                    if (!numero9) {
                        numero9 = true;
                    } else {
                        return true;
                    }
                    break;
                case 10:
                    if (!numero10) {
                        numero10 = true;
                    } else {
                        return true;
                    }
                    break;
                default:
                    return true;
            }
        }
        return false;
    }

    public void verificarApuesta(Apuesta apuesta) {
        if (apuesta != null) {
            if (VerificarRepitencia(apuesta)) {
                eliminarApuesta(apuesta);//o(n)
            } else {
                verificarApuesta(apuesta.getSiguiente());//o(n)
            }
        }
    }

    public void crearArchivoEliminadas() {
        try {
            File ArchivoEliminadas = new File("Archivo de apuestas eliminadas.txt");
            FileWriter archivo = new FileWriter(ArchivoEliminadas);
            BufferedWriter Archivo = new BufferedWriter(archivo);
            Archivo.write(ApuestasEliminadas.getText());
            Archivo.close();
        } catch (Exception e) {

        }

    }

    public void guardarEliminadas(Apuesta eliminar) {
        ApuestasEliminadas.append(eliminar.getNombre() + eliminar.getMonto() + eliminar.getArrayPocisiones() + "\n");
    }

    public void eliminarApuesta(Apuesta eliminar) {//o(n)
        if (eliminar != cabeza && eliminar != cola) {
            if (eliminar.getSiguiente() != null) {
                eliminar.getAnterior().setSiguiente(eliminar.getSiguiente());
                eliminar.getSiguiente().setAnterior(eliminar.getAnterior());
                Apuesta tmp = eliminar.getSiguiente();
                eliminar.setAnterior(null);
                eliminar.setSiguiente(null);
                guardarEliminadas(eliminar);
                verificarApuesta(tmp);
            } else {
                eliminar.getAnterior().setSiguiente(null);
                eliminar.setAnterior(null);
                eliminar.setSiguiente(null);
                guardarEliminadas(eliminar);
            }

        } else if (eliminar == cabeza) {
            if (eliminar.getSiguiente() != null) {
                cabeza = eliminar.getSiguiente();
                cabeza.setAnterior(null);
                eliminar.setSiguiente(null);
                guardarEliminadas(eliminar);
                verificarApuesta(cabeza);
            } else {
                eliminar.setAnterior(null);
                eliminar.setSiguiente(null);
                guardarEliminadas(eliminar);
            }
        } else if (eliminar == cola) {
            cola = cola.getAnterior();
            cola.setSiguiente(null);
            eliminar.setAnterior(null);
            eliminar.setSiguiente(null);
            guardarEliminadas(eliminar);
        } else {
            if (eliminar.getSiguiente() != null) {
                verificarApuesta(eliminar.getSiguiente());
            }
        }
    }
}
