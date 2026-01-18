import java.util.Scanner;
import java.util.ArrayList;

public class lab07_Q3 {
    public static void main(String[] args) {
        

        ArrayList<String> movieArrayList = new ArrayList<>();
        ArrayList<ArrayList<String>> reviewArrayList = new ArrayList<>();
        ArrayList<Integer> overallRatingsArrayList = new ArrayList<>();
        ArrayList<Integer> ratingCountArrayList = new ArrayList<>();

        boolean check = true;
        
        while(check)
        {
            System.out.println("-*- Movie Review System -*-");
            System.out.println("1. Add a new movie. ");
            System.out.println("2. Remove a movie. ");
            System.out.println("3. Submit a review and a rating for the movie. ");
            System.out.println("4. View all movies, reviews, and average ratings. ");
            System.out.println("5. Exit. ");
            System.out.println("Enter your choice: ");
        
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();

            if(userInput == 1)
            {
                System.out.print("Enter the movie title: ");
                Scanner sc1 = new Scanner(System.in);
                String addedMovie = sc1.nextLine();

                movieArrayList.add(addedMovie);
                reviewArrayList.add(new ArrayList<>());
                overallRatingsArrayList.add(0);
                ratingCountArrayList.add(0);
                System.out.println("Movie added!");

            }
            else if(userInput == 2)
            {
                boolean check1 = true;
                while(check1)
                {
                    System.out.println("Select a movie to remove: ");
                    for(int i = 0; i<movieArrayList.size(); i++)
                    {
                        System.out.println((i+1) + ". " + movieArrayList.get(i));
                    }
    
                    System.out.print("Enter movie number: ");
                    Scanner sc2 = new Scanner(System.in);
                    int indexOfRemoval = sc2.nextInt()-1;
                    System.out.println();
                    if(indexOfRemoval >= 0 && indexOfRemoval < movieArrayList.size())
                    {
                        String movieToBeRemoved = movieArrayList.remove(indexOfRemoval);
                        reviewArrayList.remove(indexOfRemoval);
                        overallRatingsArrayList.remove(indexOfRemoval);
                        ratingCountArrayList.remove(indexOfRemoval);
                        System.out.println(movieToBeRemoved + " has been removed.");
                        check1 = false;
                    }
                    else
                    {
                        System.out.println("Invalid movie number.");
                    }
                }
                
            }
            else if(userInput == 3)
            {
                if(movieArrayList.isEmpty())
                {
                    System.out.println("No movies to review.");
                }
                else
                {
                    System.out.println("Select a moive to review: ");
                    for(int i = 0; i<movieArrayList.size(); i++)
                    {
                        System.out.println((i+1)+". "+ movieArrayList.get(i));
                    }
                    System.out.println("Enter movie number: ");
                    Scanner sc3 = new Scanner(System.in);
                    int indexOfReview = sc3.nextInt()-1;
                    System.out.println();

                    if(indexOfReview >= 0 && indexOfReview < movieArrayList.size())
                    {
                        System.out.print("Enter your review: ");
                        Scanner sc4 = new Scanner(System.in);
                        String movieReview = sc4.nextLine();
                        System.out.print("Enter your rating (1-5): ");
                        Scanner sc5 = new Scanner(System.in);
                        int movieRating = sc5.nextInt();
                        System.out.println();

                        if(movieRating>=1 && movieRating<=5)
                        {
                            reviewArrayList.get(indexOfReview).add(movieReview);
                            overallRatingsArrayList.set(indexOfReview, overallRatingsArrayList.get(indexOfReview)+movieRating);
                            ratingCountArrayList.set(indexOfReview, ratingCountArrayList.get(indexOfReview)+1);
                            System.out.println("Review and rating submtted");
                        }
                        else
                        {
                            System.out.println("Invalid rating. Please enter a number between 1 and 5.");
                        }
                    }
                    else
                    {
                        System.out.println("Invalide movie number.");
                    }
                    
                }

            }
            else if(userInput == 4)
            {
                if(movieArrayList.isEmpty())
                {
                    System.out.println("No movies available.");
                }
                else
                {
                    System.out.println("Movie List: ");
                    for(int i = 0; i<movieArrayList.size(); i++)
                    {
                        String element = movieArrayList.get(i);
                        System.out.println((i+1)+". "+element);
                        if(ratingCountArrayList.get(i)==0)
                        {
                            System.out.println("    Average Rating: N/A");
                            System.out.println("    Reviews: No reviews yet");
                        }
                        else
                        {
                            double ratingAverage = (double) overallRatingsArrayList.get(i) / ratingCountArrayList.get(i);
                            System.out.printf("    Average Rating: %.1f%n", ratingAverage);
                            System.out.println("    Reviews: ");
                            for(String movieReview : reviewArrayList.get(i))
                            {
                                System.out.println("    - "+movieReview);
                            }
                        }
                    }
                }
            }
            else if(userInput == 5)
            {
                System.out.println("Exsiting the program. Goodbye!");
                check = false;
            }
            else
            {
                System.out.println("Invalid choice, try again");
            }
        } 
        
    }
}
