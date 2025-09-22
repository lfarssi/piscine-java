public class CleanExtract {
    public static String extract(String s) {
        String[] parts = s.split("\\|");
        String result = "";

        for (String part : parts) {
            part = part.trim();
            int firstDot = part.indexOf('.');
            int lastDot = part.lastIndexOf('.');
            String cleaned = "";

            if (firstDot != -1) {
                if (firstDot == lastDot) {
                    // Only one dot → take everything after it
                    cleaned = part.substring(firstDot + 1).trim();
                } else {
                    // Multiple dots → take between first and last
                    cleaned = part.substring(firstDot + 1, lastDot).trim();
                }
            }

            if (!cleaned.isEmpty()) {
                if (!result.isEmpty()) {
                    result += " ";
                }
                result += cleaned;
            }
        }

        // Add only one dot at the end
        if (!result.isEmpty() && !result.endsWith(".")) {
            result += ".";
        }

        return result;
    }
}
