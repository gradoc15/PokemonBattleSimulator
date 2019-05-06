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
public enum Nature
{
    //Boosts atk
    LONELY(Stat.ATK, Stat.DEF),
    ADAMANT(Stat.ATK, Stat.SPATK),
    NAUGHTY(Stat.ATK, Stat.DEF),
    BRAVE(Stat.ATK, Stat.SPD),
    
    //Booosts def
    BOLD(Stat.DEF, Stat.ATK),
    IMPISH(Stat.DEF, Stat.SPATK),
    LAX(Stat.DEF, Stat.SPDEF),
    RELAXED(Stat.DEF, Stat.SPD),
    
    //boosts spAtk
    MODEST(Stat.SPATK, Stat.ATK),
    MILD(Stat.SPATK, Stat.DEF),
    RASH(Stat.SPATK, Stat.SPDEF),
    QUIET(Stat.SPATK, Stat.SPD),
    
    //Boosts spDef
    CALM(Stat.SPDEF, Stat.ATK),
    GENTLE(Stat.SPDEF, Stat.DEF),
    CAREFUL(Stat.SPDEF, Stat.SPATK),
    SASSY(Stat.SPDEF, Stat.SPD),
    
    //Boosts spd
    TIMID(Stat.SPD, Stat.ATK),
    HASTY(Stat.SPD, Stat.DEF),
    JOLLY(Stat.SPD, Stat.SPATK),
    NAIVE(Stat.SPD, Stat.SPDEF),
    
    //neutral
    HARDY(Stat.ATK, Stat.ATK),
    DOCILE(Stat.DEF, Stat.DEF),
    BASHFUL(Stat.SPATK, Stat.SPATK),
    QURIKY(Stat.SPDEF, Stat.SPDEF),
    SERIOUS(Stat.SPD, Stat.SPD);
    
    
    
    private Nature(Stat boostStat, Stat lowerStat)
    {
        this.boostStat = boostStat;
        this.lowersStat = lowerStat;
    }
    
    private Stat lowersStat;
    private Stat boostStat;

    public Stat getLowersStat()
    {
        return lowersStat;
    }

    public Stat getBoostStat()
    {
        return boostStat;
    }
    
    public String toString()
    {
        return "(+"+boostStat+"/-"+lowersStat+")";
    }
}
