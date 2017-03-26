
package Clases;


import Ventana.VistaAnalizador;
import static Ventana.VistaAnalizador.Tabla;
import javax.swing.table.DefaultTableModel;

public class Escanner {
   
    String cadenaEntrada;
    int numeroLinea;
    int numeroColunna;
    String lexema;
    
    DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();

    public Escanner() {
    }

    public void analizar(String cadena) {
        lexema = "";
        numeroLinea =0;
        numeroColunna = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            lexema = lexema + cadena.charAt(i);
            switch (caracter) {
                case 'a':
                    numeroColunna++;
                    break;
                case 'b':
                    numeroColunna++;
                    break;
                case 'c':
                    numeroColunna++;
                    break;
                case 'd':
                    numeroColunna++; 
                    break;
                case 'e':
                    numeroColunna++;
                    break;
                case 'f':
                    numeroColunna++;
                    break;
                case 'g':
                    numeroColunna++;
                    break;
                case 'h':
                    numeroColunna++;
                    break;
                case 'i':
                    numeroColunna++;
                    break;
                case 'j':
                    numeroColunna++;
                    break;
                case 'k':
                    numeroColunna++;
                    break;
                case 'l':
                    numeroColunna++;
                    break;
                case 'm':
                    numeroColunna++;
                    break;
                case 'n':
                    numeroColunna++;
                    break;
                case 'o':
                    numeroColunna++;
                    break;
                case 'p':
                    numeroColunna++;
                    break;
                case 'q':
                    numeroColunna++;
                    break;
                case 'r':
                    numeroColunna++;
                    break;
                case 's':
                    numeroColunna++;
                    break;
                case 't':
                    numeroColunna++;
                    break;
                case 'u':
                    numeroColunna++;
                    break;
                case 'v':
                    numeroColunna++;
                    break;
                case 'w':
                    numeroColunna++;
                    break;
                case 'x':
                    numeroColunna++;
                    break;
                case 'y':
                    numeroColunna++;
                    break;
                case 'z':
                    numeroColunna++;
                    break;
                case 'A':
                    numeroColunna++;
                    break;
                case 'B':
                    numeroColunna++;
                    break;
                case 'C':
                    numeroColunna++;
                    break;
                case 'D':
                    numeroColunna++;
                    break;
                case 'E':
                    numeroColunna++;
                    break;
                case 'F':
                    numeroColunna++;
                    break;
                case 'G':
                    numeroColunna++;
                    break;
                case 'H':   
                    numeroColunna++;
                    break;
                case 'I':
                    numeroColunna++;
                    break;
                case 'J':
                    numeroColunna++;
                    break;
                case 'K':
                    numeroColunna++;
                    break;
                case 'L':
                    numeroColunna++;
                    break;
                case 'M':
                    numeroColunna++;
                    break;
                case 'N':
                    numeroColunna++;
                    break;
                case 'O':
                    numeroColunna++;
                    break;
                case 'P':
                    numeroColunna++;
                    break;
                case 'Q':
                    numeroColunna++;
                    break;
                case 'R':
                    numeroColunna++;
                    break;
                case 'S':
                    numeroColunna++;
                    break;
                case 'T':
                    numeroColunna++;
                    break;
                case 'U':
                    numeroColunna++;
                    break;
                case 'V':
                    numeroColunna++;
                    break;
                case 'W':
                    numeroColunna++;
                    break;
                case 'X':
                    numeroColunna++;
                    break;
                case 'Y':
                    numeroColunna++;
                    break;
                case 'Z':
                    numeroColunna++;
                    break;
                case '_':
                    numeroColunna++;
                    break;
                case '1':
                    numeroColunna++;
                    signo(lexema, "1", "numero",numeroLinea,numeroColunna);
                    break;
                case '2':
                    numeroColunna++;
                    signo(lexema, "2", "numero",numeroLinea,numeroColunna);
                    break;
                case '3':
                    numeroColunna++;
                    signo(lexema, "3", "numero",numeroLinea,numeroColunna);
                    break;
                case '4':
                    numeroColunna++;
                    signo(lexema, "4", "numero",numeroLinea,numeroColunna);
                    break;
                case '5':
                    numeroColunna++;
                    signo(lexema, "5", "numero",numeroLinea,numeroColunna);
                    break;
                case '6':
                    numeroColunna++;
                    signo(lexema, "6", "numero",numeroLinea,numeroColunna);
                    break;
                case '7':
                    numeroColunna++;
                    signo(lexema, "7", "numero",numeroLinea,numeroColunna);
                    break;
                case '8':
                    numeroColunna++;
                    signo(lexema, "8", "numero",numeroLinea,numeroColunna);
                    break;
                case '9':
                    numeroColunna++;
                    signo(lexema, "9", "numero",numeroLinea,numeroColunna);
                    break;
                case '&':
                    numeroColunna++;
                    signo(lexema, "&", "Operador",numeroLinea,numeroColunna);
                    break;   
                  case '|':
                    numeroColunna++;
                    signo(lexema, "|", "Operador",numeroLinea,numeroColunna);
                    break; 
                  case '?':
                    numeroColunna++;
                    signo(lexema, "?", "Operador",numeroLinea,numeroColunna);
                    break;    
                case '(':
                    numeroColunna++;
                    signo(lexema, "(", "Operador",numeroLinea,numeroColunna);
                    break;
                case ')':
                    numeroColunna++;
                    signo(lexema, ")", "Operador",numeroLinea,numeroColunna);
                    break;
                case '^':
                    numeroColunna++;
                    signo(lexema, "^", "Operador",numeroLinea,numeroColunna);
                    break;
                case '*':
                    numeroColunna++;
                    signo(lexema, "*", "Operador",numeroLinea,numeroColunna);
                    break;
                case '/':
                    numeroColunna++;
                    signo(lexema, "/", "Operador",numeroLinea,numeroColunna);
                    break;
                 case '{' :
                    numeroColunna++;
                    signo(lexema, "}" , "Operador",numeroLinea,numeroColunna);
                    break;   
                 case '}':
                    numeroColunna++;
                    signo(lexema, "}", "Operador",numeroLinea,numeroColunna);
                    break;    
                    
                case '+':
                    numeroColunna++;
                    signo(lexema, "+", "Operador",numeroLinea,numeroColunna);
                    break;
                case '-':
                    numeroColunna++;
                    signo(lexema, "-", "Operador",numeroLinea,numeroColunna);
                    break;
                case '<':
                    numeroColunna++;
                    signo(lexema, "<", "numero",numeroLinea,numeroColunna);
                    break;
                case '>':
                    numeroColunna++;
                    signo(lexema, ">", "Mayor que",numeroLinea,numeroColunna);
                    break;
                case '=':
                    numeroColunna++;
                    signo(lexema, "=", "Operador",numeroLinea,numeroColunna);
                    break;
                case '%':
                    numeroColunna++;
                    signo(lexema, "%", "Operador",numeroLinea,numeroColunna);
                    break;
                case '!':
                    numeroColunna++;
                    signo(lexema, "!", "Operador",numeroLinea,numeroColunna);
                    break;
                case ' ':
                    numeroColunna++;
                    if (lexema.trim().length()>0){ 
                        modelo.addRow(new String[]{numeroLinea + "" , numeroColunna + "" ,lexema.trim(), buscar(lexema.trim())});
                    }
                    lexema = "";
                    break;
                case ';':
                    numeroColunna++;
                    signo(lexema, ";", "Punto y coma",numeroLinea,numeroColunna);
                    break;
                case ':':
                    numeroColunna++;
                    signo(lexema, ":", "Dos puntos",numeroLinea,numeroColunna);
                    break;   
                case '.':
                    numeroColunna++;
                    signo(lexema, ".", "Punto",numeroLinea,numeroColunna);
                    break;
                case ',':
                    numeroColunna++;
                    signo(lexema, ",", "Punto",numeroLinea,numeroColunna);
                    break;    
                case '"':
                    numeroColunna++;
                    signo(lexema, " ", "comillas",numeroLinea,numeroColunna);
                    break;
                    
                case '[':
                    numeroColunna++;
                    signo(lexema,"]", "Operador",numeroLinea,numeroColunna);
                    break;
                 case ']':
                    numeroColunna++;
                    signo(lexema,"]", "Operador",numeroLinea,numeroColunna);
                    break;              
                case '\n':  
                    numeroColunna = 0;  
                    numeroLinea ++;
                    break;
                    
                default:
                    
                    modelo.addRow(new String[]{numeroLinea + "" , numeroColunna + "" ,lexema, " error lexico "});
                    lexema = "";
                    break;
            }
        }
    }

    public String buscar(String palabra) {
        int tamanio = VistaAnalizador.palabrasReservadas.size();

        for (int i = 0; i < tamanio; i++) {
            if (VistaAnalizador.palabrasReservadas.get(i).equals(palabra)) {
                return "palabra reservada";
            }
        }

        tamanio = VistaAnalizador.operadores.size();
        for (int i = 0; i < tamanio; i++) {
            if (VistaAnalizador.operadores.get(i).equals(palabra)) {
                return "Operador";
            }
        }
        return "identificador";
    }

    public void signo(String lex, String signo, String nombreSigno,int fila, int columna) {
        lex = lex.substring(0, lex.length() - 1);  
        if (lex != null && lex.trim().length() > 0) {  
            modelo.addRow(new String[]{fila + "",columna + "",lex, buscar(lex)}); 
        }
        modelo.addRow(new String[]{fila + "",columna + "",signo, nombreSigno});
        lexema = "";
    }
}
 
    
    
    
    

