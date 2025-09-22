public class CleanExtract {
    public static String extract(String s) {
        String[] parts = s.split("\\|");
        String result = "";

        for (String part : parts) {
            part = part.trim();
            boolean inside = false;
            String cleaned = "";

            for (int i = 0; i < part.length(); i++) {
                char c = part.charAt(i);

                if (c == '.') {
                    inside = !inside;
                    continue;
                }

                if (inside) {
                    cleaned += c; 
                }
            }

            if (!cleaned.isEmpty()) {
                if (!result.isEmpty()) {
                    result += " ";
                }
                result += cleaned;
            }
        }

        return (result.isEmpty()) ? result : result+".";
    }
}
