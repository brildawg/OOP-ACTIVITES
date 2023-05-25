package main;

public class main {
    public static void main(String[] args) {
       
        //object 1
       dog d1 = new dog();
       d1.breed="Bulldog";
       d1.size="Large";
       d1.colour="light gray";
       d1.age=5;
       
       d1.Eat("Apple");
       d1.Run("Slow");
       d1.Sleep(5);
       d1.Name("junjun");
       System.out.println("Breed : "+d1.breed+"\n"+"Size : "+d1.size+"\nColour : "+d1.colour+"\nAge : "+d1.age+" years\n");

       //object 2
       dog d2 = new dog();
       d2.breed="Beagle";
       d2.size="Large";
       d2.colour="Orange";
       d2.age=6;
       
       d2.Eat("Dog food");
       d2.Run("Fast");
       d2.Sleep(4);
       d2.Name("doggy");
       System.out.println("Breed : "+d2.breed+"\n"+"Size : "+d2.size+"\nColour : "+d2.colour+"\nAge : "+d2.age+" years\n");

       //object 3
       dog d3 = new dog();
       d3.breed="German Shepherd";
       d3.size="Large";
       d3.colour="White & orange";
       d3.age=6;
       
       d3.Eat("Chicken");
       d3.Run("fast");
       d3.Sleep(7);
       d3.Name("brownie");
       System.out.println("Breed : "+d3.breed+"\n"+"Size : "+d3.size+"\nColour : "+d3.colour+"\nAge : "+d3.age+" years\n");

       
    
    }
}
