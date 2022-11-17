import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 */
public class CrabWorld extends World
{
    public static final int MAXN_WORMS = 5;
    public static final int SCORE_INCREMENT = 100;
    
    private Crab crab;
    private Lobster lobster;
    
    private Worm[] worms;
    private int wormSize = 30;
    private int remainingWorms = MAXN_WORMS;
    
    private Random generator = new Random();
    private Counter score;
    private Counter wormCount;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        crab = new Crab();
        addObject(crab, 200, 200);
        
        lobster = new Lobster();
        addObject(lobster, 600, 400);
        
        worms = new Worm[MAXN_WORMS];
        addWorms();
        
        setupScore();
        setupWormCount();
    }
    
    /**
     * Add MAXN_WORMS to the world in random positions
     */
    public void addWorms()
    {
        for(int i = 0; i < MAXN_WORMS; i++)
        {
           createWorm(); 
        }
        
    }
    
    /**
     * This method creates & adds a single worm to a random position in
     * the world that is not too near the edge of the screen
     */
    private void createWorm()
    {
        Worm worm = new Worm();
        
        int x = generator.nextInt(getWidth());
        int y = generator.nextInt(getHeight());
        
         addObject(worm, x, y);
    }
    
    public void increaseScore()
    {
        score.add(SCORE_INCREMENT);
    }
    
    private void setupScore()
    {
        score = new Counter("Score: ");
        addObject (score, 60, 30);
    }
    
    private void setupWormCount()
    {
        wormCount = new Counter("Worms Remaining: ");
        wormCount.add(remainingWorms);
        addObject (wormCount, 680, 30);
    }
    
    public void updateWormDisplay()
    {
        wormCount.setValue(remainingWorms);
    }
    
    public void decreaseWorms()
    {
        remainingWorms--;
        updateWormDisplay();
        checkWin();
    }
    
    public void checkWin()
    {
        if(remainingWorms == 0)
        {
            winGame();
        }
    }
    
    public void loseGame()
    {
        showText("Game Over: You have Lost!", 400, 300);
    }
    
   public void winGame()
    {
        showText("Game Over: You have Won!", 400, 300);
    }    
}
