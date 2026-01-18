import java.util.ArrayList;


public class BattleManager 
{
    // Instance Variables
    private final Knight knight; // A Knight instance representing the player-controlled Knight
    private final ArrayList<BattleColumn> columns; // BattleColumn objects for columns in the game grid

    /* 
     * Initializes the columns list with a number of BattleColumn instances based on SkyBattleGame.COLS.
     * The Knight is initialized with y=0 position, initial health (SkyBattleGame.INITIAL_HEALTH), and 
     * a knight symbol (SkyBattleGame.KNIGHT_SYMBOL).
     */
    public BattleManager() 
    {
        this.knight = new Knight(0, SkyBattleGame.INITIAL_HEALTH, SkyBattleGame.KNIGHT_SYMBOL);
        this.columns = new ArrayList<BattleColumn>();
        for (int i = 0; i < SkyBattleGame.COLS; i++) 
        {
            columns.add(new BattleColumn(false));
        }
    }

    /*
     * Takes the player’s input (direction) and adjusts the Knight's y position accordingly.
     * It checks for valid movement directions (up, down, stay still), ensures the knight does not go out of
     * bounds. If the move is valid, the shiftGrid method is called first to shift the grid to the left,
     * followed by the move method, which updates the knight's position and checks for collisions.
     * Shifting the grid before moving ensures accurate collision detection based on the knight's new position.
     * The method returns true if the move is valid and successful, or false if the move is invalid or out of bounds.
     */
    public boolean handleMovement(String direction) 
    {
        int yDist = 0;

        if(direction.equals(SkyBattleGame.MOVE_UP))
        {
            yDist = -1;
        }
        else if(direction.equals(SkyBattleGame.MOVE_DOWN))
        {
            yDist = 1;
        }
        else if(direction.equals(SkyBattleGame.STAY_STILL))
        {
            yDist = 0;
        }
        else
        {
            System.out.println("Invalid direction!");
            return false;
        }

        shiftGrid();
        move(yDist);

        return true;
    }

    /*
     * Updates the Knight's y position by the provided yDist and checks the position for Dark 
     * Knights. If the Knight collides with a Dark Knight, its health is reduced by 1, and an 
     * attack message is displayed using displayAttackMessage(). Otherwise, the player's score 
     * (SkyBattleGame.score) increases by 1.
     */
    private void move(int yDist) 
    {
        
        int currentY = knight.getY() + yDist;
            
        if(currentY < 0 || currentY >= 10)
        {
            System.out.println("Out of bounds, staying still!");
            
            return;
        }
        
        knight.setY(currentY);

        if(columns.get(0).getElements()[currentY] == '♘')
        {
            knight.setHealth(knight.getHealth()-1);
            displayAttackMessage();
        }
        else
        {
            SkyBattleGame.score += 1;
        }

        
        
    }

    /*
     * Shifts the grid by moving each column to the left and generating a new column at the 
     * rightmost position.
     */
    private void shiftGrid() 
    {
        columns.remove(0);
        columns.add(new BattleColumn(true));
    }

    /*
     * Displays a message to the player when the Knight is attacked by a Dark Knight.
     */
    private void displayAttackMessage() 
    {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("You were attacked by a dark knight");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    // Getters
    
    /*
     * Returns the current instance of the knight.
     */
    public Knight getKnight() 
    {
        return knight;
    }

    /*
     * Returns the ArrayList of columns representing the current game grid.
     */
    public ArrayList<BattleColumn> getColumns() 
    {
        return columns;
    }
}