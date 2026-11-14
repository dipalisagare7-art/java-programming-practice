package resumescreener;

import java.util.*;

public class ResumeScreener {

    public static void main(String[] args) {
        // Simulated Job Description keywords
        Set<String> jobKeywords = new HashSet<>(Arrays.asList("java", "python", "spring", "machine", "learning", "git"));

        // Simulated Candidate Resumes (Candidate Name -> Their Skills)
        Map<String, Set<String>> candidates = new HashMap<>();
        candidates.put("Candidate A (You)", new HashSet<>(Arrays.asList("java", "spring", "git", "html")));
        candidates.put("Candidate B", new HashSet<>(Arrays.asList("python", "sql", "excel")));
        candidates.put("Candidate C", new HashSet<>(Arrays.asList("java", "machine", "learning", "python", "spring", "git")));

        System.out.println("=== AI RESUME SCREENING & RANKING SYSTEM ===");

        Map<String, Double> scores = new HashMap<>();

        // Match each candidate against the job description using similarity scoring
        for (Map.Entry<String, Set<String>> entry : candidates.entrySet()) {
            String name = entry.getKey();
            Set<String> candidateSkills = entry.getValue();

            // Find matching skills (Intersection)
            Set<String> intersection = new HashSet<>(jobKeywords);
            intersection.retainAll(candidateSkills);

            // Calculate match percentage
            double score = (double) intersection.size() / jobKeywords.size() * 100.0;
            scores.put(name, score);
        }

        // Print Sorted Rankings
        scores.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(e -> System.out.println(e.getKey() + " -> Match Score: " + Math.round(e.getValue()) + "%"));
    }
}