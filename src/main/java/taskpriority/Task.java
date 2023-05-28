package taskpriority;

public class Task {

    TaskPriority priority;
	private String description;

	public Task(TaskPriority priority, String description) {
		this.priority = priority;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	public TaskPriority getPriority() {
		return priority;
	}
}