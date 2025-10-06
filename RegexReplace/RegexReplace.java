import java.util.regex.*;

public class RegexReplace {
    
    private static String starsFor(String str) {
        return "*".repeat(str.length());
    }
    
    public static String removeUnits(String s) {
        Pattern p = Pattern.compile("(\\d+)(cm|€)( |$)");
        return p.matcher(s).replaceAll(mr -> mr.group(1) + (mr.group(3).isEmpty() ? "" : mr.group(3)));
    }
    
    public static String obfuscateEmail(String s) {
        if (s == null || !s.contains("@")) return s;
        
        String[] parts = s.split("@");
        String user = parts[0];
        String domain = parts[1];
        
        String newUser = obfuscateUser(user);
        
        String newDomain = obfuscateDomain(domain);
        
        return newUser + "@" + newDomain;
    }
    
    private static String obfuscateUser(String user) {
        int lastSepIndex = -1;
        for (int i = user.length() - 1; i >= 0; i--) {
            char c = user.charAt(i);
            if (c == '-' || c == '.' || c == '_') {
                lastSepIndex = i;
                break;
            }
        }
        
        if (lastSepIndex != -1) {
            return user.substring(0, lastSepIndex + 1) + starsFor(user.substring(lastSepIndex + 1));
        } else {
            if (user.length() > 3) {
                return user.substring(0, 3) + starsFor(user.substring(3));
            } else {
                return user;
            }
        }
    }
    
    private static String obfuscateDomain(String domain) {
        String[] domParts = domain.split("\\.");
        int num = domParts.length;
        
        if (num == 2) {
            String second = domParts[0];
            String top = domParts[1];
            String topOut = (top.equals("com") || top.equals("org") || top.equals("net")) ? top : starsFor(top);
            return starsFor(second) + "." + topOut;
        } else if (num == 3) {
            String third = domParts[0];
            String second = domParts[1];
            String top = domParts[2];
            return starsFor(third) + "." + second + "." + starsFor(top);
        } else {
            return domain;
        }
    }
}