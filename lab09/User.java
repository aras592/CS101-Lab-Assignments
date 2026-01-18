import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private ArrayList<Pet> pets;
    private int points;

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.pets = new ArrayList<>();
        this.points = 100;
    }

    public boolean verifyPassword(String password)
    {
        if(this.password.equals(password))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void adoptPet(String petName, String petType)
    {
        int costOfPet = getPetCost(petType);
        if(points > costOfPet)
        {
            Pet newPet = new Pet(petName, petType, this);
            pets.add(newPet);
            points = points - costOfPet;
            System.out.println("You adopted a new " +petType+ " named " +petName);
        }
        else 
        {
            System.out.println("You do not have enough points to adopt a/new pet");
        }
    }

    public void adoptPet(Pet pet)
    {
        pets.add(pet);
        pet.setPetUserName(this);
        System.out.println("You adopted " +pet.getPetName()+ ", which is a " + pet.getPetType());
    }

    public String toString()
    {
        return "User: " +username+ 
        ", Budget: " +points+ 
        ", Pets: " +pets;
    }

    //compare users
    public boolean equals(User username, User password)
    {
        if(this == username && this == password)
        {
            return true;
        }
        else
        { 
            return false;
        }   
    }
    
    //Pet object methods
    public Pet releasePet(Pet pet)
    {
        if(pets.remove(pet))
        {
            pet.setPetUserName(null);
            System.out.println("You have released " +pet.getPetName()+ " ,which is a " +pet.getPetType());
            return pet;
        }
        else
        {
            System.out.println("The pet does not exist!");
            return null;
        }
    }

    public Pet getPetByName(String petName)
    {
        for(Pet pet : pets)
        {
            if(pet.getPetName().equals(petName))
            {
                return pet;
            }
        }
        return null;
    }

    public ArrayList<Pet> searchPetsByHealth(int minHealth)
    {
        ArrayList<Pet> newPets = new ArrayList<>();
        for(Pet pet : pets)
        {
            if(pet.getPetHealth()>minHealth)
            {
                newPets.add(pet);
            }
        }
        return newPets;
    }

    public ArrayList<Pet> searchPetsByHappiness(int minHappiness)
    {
        ArrayList<Pet> newPets = new ArrayList<>();
        for(Pet pet : pets)
        {
            if(pet.getPetHealth() > minHappiness)
            {
                newPets.add(pet);
            }
        }
        return newPets;
    }

    //displays
    public void displayAverageHealthAndHappiness()
    {
        if(pets.isEmpty())
        {
            System.out.println("No pets to display!");
        }
        double tHappiness = 0, tHealth = 0;
        for(Pet pet : pets)
        {
            tHealth = tHealth + pet.getPetHealth();
            tHappiness = tHappiness +pet.getPetHappiness();
        }

        double averageHealth = tHealth / pets.size();
        double averageHappiness = tHappiness / pets.size();

        System.out.println("Average Health: " +averageHealth+ ", Average Happiness: " +averageHappiness);
    }

    public void displayPets()
    {
        if(pets.isEmpty())
        {
            System.out.println("You do not have ant pets.");
        }
        else 
        {
            for(Pet pet:pets)
            {
                System.out.println(pet.getPetStatus());
            }
        }
    }

    //getters&setters
    public int getPetCost(String petType)
    {
        if(petType.equals("dog"))
        {
            return 40;
        }
        else if(petType.equals("cat"))
        {
            return 30;
        }
        else if(petType.equals("rabbit"))
        {
            return 20;
        }
        else
        {
            return 0;
        }
    }

    public String getName()
    {
        return username;
    }
}
