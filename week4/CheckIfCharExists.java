public class CheckIfCharExists {
    public static void main(String[] args) {
        String str = "Umbrella";
        char charToCheck = 'e';
        int i = 0;
        boolean found = false;
        String newString = "";
        while(!newString.equals(str)) {
            char ch = str.charAt(i);
            if(ch == charToCheck) {
                found = true;
                break;
            }
            newString += ch;
            i++;
        }
        if(found) {
            System.out.println("Character '"+charToCheck+"' exists in the string");
        } else {
            System.out.println("Character '"+charToCheck+"' does not exist in the string");
        }
    }
}
