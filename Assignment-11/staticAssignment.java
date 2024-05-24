// Create a class that keeps track of the number of instances created. Implement a static variable and method to accomplish this

public class staticAssignment {
    private static int instanceCount = 0;

	public staticAssignment() {
		instanceCount++;
	}

	public static int getInstanceCount() {
		return instanceCount;
	}

	public static void main(String[] args) {
		staticAssignment c1 = new staticAssignment();
		staticAssignment c2 = new staticAssignment();
		staticAssignment c3 = new staticAssignment();
		System.out.println("Number of instances created: " + staticAssignment.getInstanceCount());
	}    
}
