package strings;

public class LearnString {
    public static void main(String[] args) {
        String name = "Zia";
        String sameName = "Zia";
        String newName = new String("Zia");

        System.out.println(name);
        System.out.println(sameName);

        if(name == sameName){
            System.out.println("Both are same");
        }

        if(name == newName){
            System.out.println("Both are same");
        }else{
            System.out.println("Both are not same");
        }

        if(name.equals(newName)){
            System.out.println("name and newName are same ");
        }
    }
}
