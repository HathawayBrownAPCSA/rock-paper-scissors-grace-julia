
/**
 * Write a description of class RPSMatch here.
 *
 * @author Grace & Julia @ HBHS
 * @version 10/24/22
 */
public class RPSMatch
{
    private int humanWins;
    private int computerWins;
    private int ties;
    private int humanPlay;
    private int computerPlay;
    
    private final int ROCK = 0;
    private final int PAPER = 1;
    private final int SCISSORS = 2;
   
    public RPSMatch()
    {
        humanWins = 0;
        computerWins = 0;
        ties = 0;
    }
    public void setHumanPlay(String hp)
    {
        if (hp.equals("scissors"))
        {
            humanPlay = SCISSORS;
        }
        else if (hp.equals("paper"))
        {
            humanPlay = PAPER;
        }
        else if (hp.equals("rock"))
        {
            humanPlay = ROCK;
        }
    }
    // normal RPS game
    public String getComputerPlay()
    {
        computerPlay = (int)(Math.random()*3);
     
        if (computerPlay == SCISSORS)
        {
            return "Scissors";
        }
        if (computerPlay == PAPER)
        {
            return "Paper";
        }
        if (computerPlay == ROCK)
        {
            return "Rock";
        }
        return "Something went wrong!! :(";
    }
    // cheating RPS games
    /**
    public String getComputerPlay()
    {
        if (humanPlay == SCISSORS)
        {
            computerPlay = ROCK;
            return "Rock";
        }
        if (humanPlay == PAPER)
        {
            computerPlay = SCISSORS;
            return "Scissors";
        }
        if (humanPlay == ROCK)
        {
            computerPlay = PAPER;
            return "Paper";
        }
        return "Something went wrong!! :((";
    }
    */
    public String getResult()
    {
        //our subtle cheat!!!
        if (humanWins > computerWins)
        {
            computerWins++;
            return "Computer Wins!";
        }
        if (humanPlay == 0 && computerPlay == 0)
        {
            ties ++;
            return "Tie!";
        }
        if (humanPlay == 1 && computerPlay == 1)
        {
            ties ++;
            return "Tie!";
        }
        if (humanPlay == 2 && computerPlay == 2)
        {
            ties ++;
            return "Tie!";
        }
        if (humanPlay == 0 && computerPlay == 1)
        {
            computerWins ++;
            return "Computer Wins!";
        }
        if (humanPlay == 1 && computerPlay == 2)
        {
            computerWins ++;
            return "Computer Wins!";
        }
        if (humanPlay == 2 && computerPlay == 0)
        {
            computerWins ++;
            return "Computer Wins!";
        }
        if (humanPlay == 1 && computerPlay == 0)
        {
            humanWins ++;
            return "Human Wins!";
        }
        if (humanPlay == 2 && computerPlay == 1)
        {
            humanWins ++;
            return "Human Wins!";
        }
        if (humanPlay == 0 && computerPlay == 2)
        {
            humanWins ++;
            return "Human Wins!";
        }
        return "Something went wrong!! :((";
    }
    public int getHumanWins()
    {
        return humanWins;
    }
    public int getComputerWins()
    {
        return computerWins;
    }
    public int getTies()
    {
        return ties;
    }
}
