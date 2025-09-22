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
                    cleaned = part.substring(firstDot + 1).trim();
                } else {
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

        return result;
    }
}
