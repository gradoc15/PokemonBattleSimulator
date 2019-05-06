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
public enum Type
{
    NORMAL,
    FIRE,
    WATER,
    GRASS,
    ELECTIC,
    ICE,
    FIGHTING,
    POISON,
    GROUND,
    FLYING,
    PSYCHIC,
    BUG,
    ROCK,
    GHOST,
    DARK,
    DRAGON,
    STEEL,
    FAIRY;
    
    private Type()
    {
        
    }
    
    public static double getEffective(Type defType1, Type defType2, Type atkType)
    {
        return getEffective(defType1, atkType) * getEffective(defType2, atkType);
    }
    
    public static double getEffective(Type defType, Type atkType)
    {
        switch(atkType)
        {
            case BUG:
                switch(defType)
                {
                    case GRASS:
                    case PSYCHIC:
                    case DARK: return 2;
                    case FIRE:
                    case FIGHTING:
                    case FLYING:
                    case POISON:
                    case GHOST:
                    case STEEL:
                    case FAIRY: return 0.5;
                    default: return 1;
                }
            case DARK:
                switch(defType)
                {
                    case PSYCHIC:
                    case GHOST: return 2;
                    case FIGHTING:
                    case DARK:
                    case FAIRY: return 0.5;
                    default: return 1;
                }
            case DRAGON:
                switch(defType)
                {
                    case DRAGON: return 2;
                    case STEEL: return 0.5;
                    case FAIRY: return 0;
                    default: return 1;
                }
            case ELECTIC:
                switch(defType)
                {
                    case WATER:
                    case FLYING: return 2;
                    case GRASS:
                    case ELECTIC:
                    case DRAGON: return 0.5;
                    case GROUND: return 0;
                    default: return 1;
                }
            case FAIRY:
                switch(defType)
                {
                    case FIGHTING:
                    case DRAGON:
                    case DARK: return 2;
                    case FIRE:
                    case POISON:
                    case STEEL: return 0.5;
                    default: return 1;
                }
            case FIGHTING:
                switch(defType)
                {
                    case NORMAL:
                    case ROCK:
                    case ICE:
                    case DARK:
                    case STEEL: return 2;
                    case FLYING:
                    case POISON:
                    case PSYCHIC:
                    case BUG:
                    case FAIRY: return 0.5;
                    case GHOST: return 0;
                    default: return 1;
                }
            case FIRE:
                switch(defType)
                {
                    case GRASS:
                    case ICE:
                    case BUG:
                    case STEEL: return 2;
                    case FIRE:
                    case WATER:
                    case ROCK:
                    case DRAGON: return 0.5;
                    default: return 1;
                }
            case FLYING:
                switch(defType)
                {
                    case FIGHTING:
                    case GRASS:
                    case BUG: return 2;
                    case ELECTIC:
                    case ROCK:
                    case STEEL: return 0.5;
                    default: return 1;
                }
            case GHOST:
                switch(defType)
                {
                    case GHOST:
                    case PSYCHIC: return 2;
                    case DARK: return 0.5;
                    case NORMAL: return 0;
                    default: return 1;
                }
            case GRASS:
                switch(defType)
                {
                    case WATER:
                    case GROUND:
                    case ROCK: return 2;
                    case FIRE:
                    case FLYING:
                    case GRASS:
                    case POISON:
                    case BUG:
                    case DRAGON:
                    case STEEL: return 0.5;
                    default: return 1;
                }
            case GROUND:
                switch(defType)
                {
                    case FIRE:
                    case POISON:
                    case ELECTIC:
                    case ROCK:
                    case STEEL: return 2;
                    case GRASS:
                    case BUG: return 0.5;
                    case FLYING: return 0;
                    default: return 1;
                }
            case ICE:
                switch(defType)
                {
                    case FLYING:
                    case GRASS:
                    case GROUND:
                    case DRAGON: return 2;
                    case FIRE:
                    case WATER:
                    case ICE:
                    case STEEL: return 0.5;
                    default: return 1;
                }
            case NORMAL:
                switch(defType)
                {
                    case ROCK:
                    case STEEL: return 0.5;
                    case GHOST: return 0;
                    default: return 1;
                }
            case POISON:
                switch(defType)
                {
                    case GRASS:
                    case FAIRY: return 2;
                    case POISON:
                    case GROUND:
                    case ROCK:
                    case GHOST: return 0.5;
                    case STEEL: return 0;
                    default: return 0;
                }
            case PSYCHIC:
                switch(defType)
                {
                    case FIGHTING:
                    case POISON: return 2;
                    case PSYCHIC:
                    case STEEL: return 0.5;
                    case DARK: return 0;
                    default: return 1;
                }
            case ROCK:
                switch(defType)
                {
                    case FIRE:
                    case FLYING:
                    case ICE:
                    case BUG: return 2;
                    case FIGHTING:
                    case GROUND:
                    case STEEL: return 0.5;
                    default: return 1;
                }
            case STEEL:
                switch(defType)
                {
                    case ROCK:
                    case ICE:
                    case FAIRY: return 2;
                    case FIRE:
                    case WATER:
                    case ELECTIC:
                    case STEEL: return 0.5;
                    default: return 1;
                }
            case WATER:
                switch(defType)
                {
                    case FIRE:
                    case GROUND:
                    case ROCK: return 2;
                    case WATER:
                    case GRASS:
                    case DRAGON: return 0.5;
                    default: return 1;
                }
            default: return 1;
        }
    }
    
}
