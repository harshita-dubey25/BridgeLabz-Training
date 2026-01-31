package annotation.DeprecatedAnnotation;

public class Main {
    public static void main(String[] args) {
	LegacyAPI api = new LegacyAPI();

	// Calling deprecated method
	api.oldFeature();

	// Calling new method
	api.newFeature();
    }
}