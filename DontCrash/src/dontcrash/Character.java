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
public class Character
{
    int characterID;
    String name;
    int cost;
    
    public Character(Player Player, int CharacterID)
    {
        this.name = Player.name;
        this.characterID = CharacterID;
    }
    
    public void getHit()
    {
        //rekt
    }
    
    public void gameOver()
    {
        //gg
    }
}
