package Lec9InheritoneAndPolymorphism;

class Animal {
        String source = "VietNam";
        void makeSound() {            
            System.out.println("Make a sound");
        }
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();
        System.out.println(a.source);
    }
}
    
    
    

        
  
