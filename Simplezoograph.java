package javaprojects;

	import java.util.*;

	public class Simplezoograph {
	    // Using HashMap to store connections
	    private Map<String, List<String>> graph;
	    
	    public Simplezoograph() {
	        graph = new HashMap<>();
	        buildGraph();
	    }
	    
	    private void buildGraph() {
	        // Initialize all zones
	        graph.put("Entrance", Arrays.asList("Reptile House", "Bird Sanctuary", "Mammal Zone"));
	        graph.put("Reptile House", Arrays.asList("Snake Pit"));
	        graph.put("Bird Sanctuary", Arrays.asList("Parrot Pavilion"));
	        graph.put("Mammal Zone", Arrays.asList("Lion Den", "Elephant Enclosure"));
	        
	        // Terminal zones (no connections)
	        graph.put("Snake Pit", new ArrayList<>());
	        graph.put("Parrot Pavilion", new ArrayList<>());
	        graph.put("Lion Den", new ArrayList<>());
	        graph.put("Elephant Enclosure", new ArrayList<>());
	    }
	    
	    // Display all connections
	    public void showConnections() {
	        System.out.println("Zoo Graph Structure:");
	        for (String zone : graph.keySet()) {
	            System.out.print(zone + " connects to: ");
	            List<String> connections = graph.get(zone);
	            if (connections.isEmpty()) {
	                System.out.println("(No further zones)");
	            } else {
	                System.out.println(connections);
	            }
	        }
	    }
	    
	    // Get connections for a specific zone
	    public List<String> getConnections(String zone) {
	        return graph.getOrDefault(zone, new ArrayList<>());
	    }
	    
	    // Check if a zone exists
	    public boolean hasZone(String zone) {
	        return graph.containsKey(zone);
	    }
	    
	    // Simple traversal from entrance
	    public void visitAllZones() {
	        System.out.println("\nVisiting all zones from Entrance:");
	        visitZone("Entrance", "");
	    }
	    
	    private void visitZone(String zone, String indent) {
	        System.out.println(indent + "- " + zone);
	        for (String nextZone : graph.get(zone)) {
	            visitZone(nextZone, indent + "  ");
	        }
	    }
	    
	    public static void main(String[] args) {
	        Simplezoograph zoo = new Simplezoograph();
	        
	        // Show the structure
	        zoo.showConnections();
	        
	        // Visit all zones
	        zoo.visitAllZones();
	        
	        // Example: Get connections for specific zones
	        System.out.println("\nExamples:");
	        System.out.println("From Entrance you can go to: " + zoo.getConnections("Entrance"));
	        System.out.println("From Mammal Zone you can go to: " + zoo.getConnections("Mammal Zone"));
	        System.out.println("From Snake Pit you can go to: " + zoo.getConnections("Snake Pit"));
	    }

	}

