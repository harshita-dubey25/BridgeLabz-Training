package feedbackguru;

public class FeedbackGuruMain {
	public static void main(String[] args) {
		// create analyzer (String as text)
		FeedbackAnalyzer<String> guru = new FeedbackAnalyzer<>();

		// folder path
		String feedbackFolder = "samplefiles/feedbackfiles";

		System.out.println("Analyzing feedback files...\n");
		guru.analyzeFolder(feedbackFolder);

		guru.printSummary();

		System.out.println("Total feedback entries processed: " + guru.getTotalFeedback());
	}
}