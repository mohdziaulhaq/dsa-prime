package javabasics;

public class LearnString {
    public static void main(String[] args) {
        String name = "Zia";
        String sameName = "Zia";
        String newName = new String("ZiA");

        // System.out.println(name);
        // System.out.println(sameName);

        // if(name == sameName){
        //     System.out.println("Both are same");
        // }

        // if(name == newName){
        //     System.out.println("Both are same");
        // }else{
        //     System.out.println("Both are not same");
        // }

        // if(name.equals(newName)){
        //     System.out.println("name and newName are same ");
        // }

        if(name.equals(newName)){
            System.out.println("name and newName have same values");
        }

         if(name.equalsIgnoreCase(newName)){
            System.out.println("name and newName have same values");
        }

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        char temp = name.charAt(2);
        System.out.println(temp);

        int age = 123;
        String ageString = String.valueOf(age);
        System.out.println(age+1);
        System.out.println(ageString+1);
        

        String sentence = "I like java, java is a programming language";

        String newSentence = sentence.replace("java", "javascript");

        System.out.println(newSentence);

        System.out.println(sentence.contains("programming"));

        String subString = sentence.substring(2, 11);
        
        System.out.println(subString);

        String words[] = newSentence.split(" ");
        for (String string : words) {
            System.out.println(string);
        }

        char[] characters = "Brown".toCharArray();
        for (char c : characters) {
            System.out.println(c);
        }
        
        String animal = "";
        System.out.println(animal.isEmpty());
    }
}
