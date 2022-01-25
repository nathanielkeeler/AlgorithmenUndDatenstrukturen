package �bung10;

import java.util.*;

public class GraphTest {
    public static void main(String[] args) {
        Graph G = new Graph();
        G.insertEdges("Hamburg", "M�nster", 281);
        G.insertEdges("Hamburg", "Hannover", 151);
        G.insertEdges("Hamburg", "Berlin", 280);
        G.insertEdges("M�nster", "Aachen", 560);
        G.insertEdges("Aachen", "Koblenz", 154);
        G.insertEdges("Koblenz", "Frankfurt", 125);
        G.insertEdges("Hannover", "Frankfurt", 351);
        G.insertEdges("Frankfurt", "W�rzburg", 119);
        G.insertEdges("W�rzburg", "Stuttgart", 151);
        G.insertEdges("Stuttgart", "Basel", 273);
        G.insertEdges("Stuttgart", "M�nchen", 221);
        G.insertEdges("Koblenz", "Basel", 403);
        G.insertEdges("Aachen", "Basel", 539);
        G.insertEdges("Hannover", "Erfurt", 217);
        G.insertEdges("Erfurt", "W�rzburg", 195);
        G.insertEdges("Berlin", "Leipzig", 192);
        G.insertEdges("Leipzig", "Erfurt", 146);
        G.insertEdges("Leipzig", "M�nchen", 431);
        G.insertEdges("Basel", "M�nchen", 394);
        String start = "M�nchen";
        PriorityQueue<Graph.Edge> map = G.dijkstra(start);
        System.out.println("K�rzeste Wege von " + start + ":");
        String format = "%-25s%-20s%s%n";
        while (!map.isEmpty()) {
            Graph.Edge e = map.remove();
            System.out.format(format, "Edge Name: " + e.name, "| Distance: " + e.pathWeight, "| Pre: " + e.pre);
        }
        System.out.println();
        String ziel = "Hamburg";
        Stack<Graph.Edge> stack = G.getShortestPath(ziel);
        System.out.println("K�rzester Weg von " + start + " zu " + ziel + ":");
        while (!stack.isEmpty()) {
            Graph.Edge e = stack.pop();
            if (stack.isEmpty()) {
                System.out.println(e.name);
                break;
            }
            System.out.print(e.name + "-> ");
        }
    }
}