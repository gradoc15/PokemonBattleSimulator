/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author User
 */
public enum Status
{
    OKAY("OKAY"),
    DEFEATED("DEF");
    
    private Status(String bez)
    {
        this.bez = bez;
    }
    
    private String bez = "";
    
    public String getBez()
    {
        return bez;
    }
}
