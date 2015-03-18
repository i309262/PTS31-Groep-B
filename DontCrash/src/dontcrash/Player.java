package dontcrash;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saya
 */
public class Player
{
    int playerID;
    String name;
    int score;
    String email;
    
    public Player(int PlayerID, String Name, int Score, String Email)
    {
        this.name = Name;
    }
    
    public boolean addFriend(Player friend)
    {
        return false;
    }
}
