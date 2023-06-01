// importando as bibliotecas necessárias
package br.ufscar.dc.compiladores.Alguma;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.Alguma.Alguma;

public class Principal {
    public static void main(String args[]) {

        try {
            String arquivoSaida = args[1];
            CharStream cs = CharStreams.fromFileName(args[0]);
            try (PrintWriter pw = new PrintWriter(arquivoSaida)) { //escrita arquivo
                var lex = new Alguma(cs); //define lexico como Alguma

                Token t = null; 

                //varrer os tokens, identificando-os e printando suas linhas lidas
                while ((t = lex.nextToken()).getType() != Token.EOF) {
                    String nomeToken = Alguma.VOCABULARY.getDisplayName(t.getType());

                    if(nomeToken.equals("Caracter_invalido")) { //caracter nao identificado/invalido
                        pw.println("Linha " + t.getLine() + ": " + t.getText() + " - caracter invalido");
                        break;
                    } else if(nomeToken.equals("CADEIA_SEM_FIM")) { //faltou o aspas
                        pw.println("Linha " + t.getLine() + ": cadeia literal nao fechada");
                        break;
                    } else if(nomeToken.equals("COMENTARIO_SEM_FIM")) { //comentario sem fim
                        pw.println("Linha " + t.getLine() + ": comentario nao fechado");
                        break;
                    }
                    else if (nomeToken.equals("PALAVRAS_CHAVE")){ //token faz parte de uma palavra chave
                        pw.println("<'" + t.getText() + "','" + t.getText() + "'>");
                    } else if (nomeToken.equals("OP_LOGICO")){ //token eh operador logico
                        pw.println("<'" + t.getText() + "','" + t.getText() + "'>");
                    } else if (nomeToken.equals("OP_ARITMETICO")){ //token eh operador aritmetico
                        pw.println("<'" + t.getText() + "','" + t.getText() + "'>");
                    } else if (nomeToken.equals("OP_RELACIONAL")){ //token eh operador relacional
                        pw.println("<'" + t.getText() + "','" + t.getText() + "'>");              
                    } else { //caso token nao seja nada
                        pw.println("<'" + t.getText() + "'," + nomeToken + ">");
                    }
                }
            }catch(FileNotFoundException ex) { //erro qnd n encontra arquivo
                System.err.println("O arquivo/diretório não existe:"+args[1]);
            }
        } catch (IOException errado) { //caso nao consiga fazer nada, gera erro
            errado.printStackTrace();
        }
    }
}
