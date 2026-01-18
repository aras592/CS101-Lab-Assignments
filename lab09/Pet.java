public class Pet {

    private String petName;
    private String petType;
    private int petHealth;
    private int petHappiness;
    private String petMood;
    private User username;
    private double petAge;
    private boolean isOld;

    public Pet(String petName, String petType, User username)
    {
        this.petName = petName;
        this.petType = petType;
        this.username = username;
        this.petHealth = 50;
        this.petName = petName;
        this.petHappiness = 50;
        this.petAge = 0.0;
        currentMood();
        currentPetAge();
    }

    //feed pet 
    public void feedPet()
    {
        if(petHealth < 100)
        {
            petHealth = petHealth + 10;
            petHappiness = petHappiness + 5;
            currentMood();
            increasePetAge();
        }
        else
        {
            System.out.println("Your pet " + petName + " has maximum health, already!");
        }
    }

    //groom pet
    public void groomPet()
    {
        if(petHealth < 100)
        {
            petHealth = petHealth + 15;
            increasePetAge();
        }
    }
    //play with pet
    public void playWithPet()
    {
        if(petHappiness < 85)
        {
            petHappiness = petHappiness + 15;
            currentMood();
            increasePetAge();
        }
        else if(petHappiness < 100 && petHappiness >85)
        {
            petHappiness = 100;
            currentMood();
            increasePetAge();
        }
        else
        {
            System.out.println("Your pet " + petName + " has maximum happiness, already!");
        }
    }
    
    //returning mood of the pet
    private void currentMood()
    {
        if(petHappiness > 70)
        {
            petMood = "Happy";
        }
        else if(petHappiness < 70 && petHappiness > 50)
        {
            petMood = "Playful";
        }
        else
        {
            petMood = "Sad";
        }
    }
    
    public String toString()
    {
        return getPetStatus();
    }

    //increase pet age
    private void increasePetAge()
    {
        petAge = petAge + 0.25;
        currentPetAge();
    }

    //update the age of the pet
    private void currentPetAge()
    {
        if((petType.equals("Dog") && petAge >= 8)
        ||(petType.equals("Cat") && petAge >= 10)
        ||(petType.equals("Rabbit") && petAge >= 6))
        {
            isOld = true;
        }
        else
        {
            isOld = false;
        }
    }

    //compare pets
    public boolean equals(Pet pet)
    {
        if(this == pet)
        {
            return true;
        }
        else
        { 
            return false;
        }   
    }

    //getters
    public String getPetName()
    {
        return petName;
    }
    
    public String getPetType()
    {
        return petType;
    }
    
    public int getPetHealth()
    {
        return petHealth;
    }
    
    public int getPetHappiness()
    {
        return petHappiness;
    }

    public String getPetMood()
    {
        return petMood;
    }

    public String getPetStatus()
    {
        return "Name: " +petName+ 
        ", Type: " + petType+ 
        ", Health: " +petHealth+ 
        ", Happiness: " +petHappiness+ 
        ", Mood: " +petMood+ 
        ", Age: " +petAge;
    }


    //userName getter&setter
    public User getPetUserName()
    {
        return username;
    }

    public void setPetUserName(User username)
    {
        this.username = username;
    }

}



    
