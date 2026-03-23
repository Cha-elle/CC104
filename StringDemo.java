public class StringDemo {

    public static void main(String Cha[]) {

    String a = "java";
    String b = new String("java");
    String s = "BulSU";
    String c = "charles";
    String p = "CyberSecurity";   
    String st = "Bulacan State University";
    String n = "banana";
    String file = "report.pdf";
    String x = "CICT";
    String y = x.concat(" - BSIT");

    System.out.println(a == b); 
    System.out.println(a.equals(b)); 
    System.out.println(s.length());

    System.out.println("".isEmpty());
    System.out.println(" ".isEmpty());
    System.out.println(" ".isBlank());

    System.out.println(c.charAt(0));
    System.out.println(c.charAt(6));

    char[] letters = "CAD".toCharArray();
    System.out.println(letters[1]);
    
     System.out.println(p.substring(5));
     System.out.println(p.substring(0,5));
     System.out.println(p.substring(3,7));

     System.out.println(st.contains("State"));

     System.out.println(n.indexOf("na"));
     System.out.println(n.lastIndexOf("na"));
     System.out.println(n.indexOf("apple"));

     System.out.println(file.startsWith("rep"));
     System.out.println(file.endsWith(".pdf"));
         System.out.println(y);

     StringBuilder sb = new StringBuilder();
    for(int i = 1; i <= 3; i++) sb.append
        (i).append(" ");
        System.out.println(sb.toString());

      System.out.println("hacker".replace('a','o'));
     System.out.println("2026-02-18".replace("-","/"));

    String u = "User123";
    System.out.println(u.replaceAll("\\d", "*"));
       System.out.println(u.replaceFirst("\\d", "*"));

        String g = "BulSu CICT";
       System.out.println(g.toUpperCase());
       System.out.println(g.toLowerCase());

    //trim()(classic)
    System.out.println(" ang lamig ".trim());

    //strip() /stripLeading() /stripTrailing() (Java11+)
    System.out.println(" ang init ".strip());
    
    String  csv = "IT,CS,IS,DS";
    String[] parts = csv.split(",");
    System.out.println(parts[2]);

    String domain = "unp.edu.ph";
    String[] h = domain.split("\\.");
    System.out.println(h[0]);

    String joined = String.join(" | ", "BSIT", "BSCS", "BSIS");
    System.out.println(joined);

    }
}


