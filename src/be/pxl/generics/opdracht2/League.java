package be.pxl.generics.opdracht2;

import java.util.ArrayList;

public class League<E extends Player> {
	private ArrayList<Team<E>> teams;
	
	public League() {
		teams = new ArrayList<>();
	}

	public void addTeam(Team<E> team){
		teams.add(team);
	}
	
	public void printTeams(){
		for(Team<E> team: teams){
			System.out.printf("%-30s%d\n", team.getName(), team.ranking());
		}
	}
}
