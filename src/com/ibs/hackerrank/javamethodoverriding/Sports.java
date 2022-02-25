package com.ibs.hackerrank.javamethodoverriding;
import java.util.*;
class Sports{

    String getName(){
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers() {
		// TODO Auto-generated method stub
		
	}

	void getNumberOfTeamMembers1(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    // Write your overridden getNumberOfTeamMembers method here
    @Override
    void getNumberOfTeamMembers1() {
        System.out.println("Each team has 11 players in " + getName());
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}