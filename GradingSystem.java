interface GradingSystem {
    public static String getGrade(int marks) {
        if(marks<25)
            return "F";
        else if(25<=marks && marks<45)
            return "E";
        else if(45<=marks && marks<50)
            return "D";
        else if(50<=marks && marks<60)
            return "C";
        else if(60<=marks && marks<80)
            return "B";
        else if(80<=marks && marks<=100)
            return "A";
        else
            return "Invalid";
    }
}
