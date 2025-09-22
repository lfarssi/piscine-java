public class CleanExtract {
    public static String extract(String s) {
        String[] parts = s.split("\\|");
        String result = "";

        for (String part : parts) {
            part = part.trim();
            int firstDot = part.indexOf('.');
            int lastDot = part.lastIndexOf('.');

            String cleaned = "";
            if (firstDot != -1 && lastDot != -1 && firstDot < lastDot) {
                cleaned = part.substring(firstDot + 1, lastDot).trim();
            }

            if (!cleaned.isEmpty()) {
                if (!result.isEmpty()) {
                    result += " ";
                }
                result += cleaned;
            }
        }

        if (!result.isEmpty() && !result.endsWith(".")) {
            result += ".";
        }

        return result;
    }
}
