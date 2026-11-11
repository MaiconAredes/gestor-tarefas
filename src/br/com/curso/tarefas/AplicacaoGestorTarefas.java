package br.com.curso.tarefas;

import br.com.curso.tarefas.dominio.GestorTarefas;

/**
 * AplicacaoGestorTarefas
 */
public class AplicacaoGestorTarefas {
    public static void main(String[] args) {
    GestorTarefas gestor = new GestorTarefas();
    System.out.println("=== GESTOR DE TAREFAS ===");
    System.out.println("Ambiente Java configurado com sucesso.");
    System.out.println();
    System.out.println("Tarefas planejadas para hoje:");
    System.out.println("1. Revisar requisitos do projeto");
    System.out.println("2. Conferir pendências da equipe CPR");
    System.out.println("3. Entregar OF ");
    System.out.println("4. C:\\Users\\mmaredes\\Documents\\gestor-tarefas\\src\\br\\com\\curso\\tarefas\\AplicacaoGestorTarefas.java");
    System.out.println();
    System.out.println("Status inicial: tarefas aguardando evolução do sistema.");
    System.out.println( "Tarefas pendentes: " + gestor.contarPendentes()
        );

    }
} 