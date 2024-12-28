package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.dao.TeamDAO;
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

public class TeamServiceImplArraylist implements TeamService {
    private TeamDAO teamDAO;

    private static List<Team> teams = new ArrayList<>();

    @Override
    public List<Team> getAllTeams() {
        
        return teams;
    }

    @Override
    public int addTeam(Team team) {
        teams.add(team);
        return  teams.size();
    }

    @Override
    public List<Team> getAllTeamsSortedByName() {
        Collections.sort(teams);
        return teams;
    }

    @Override
    public void emptyArrayList(){
        teams =  new ArrayList<>();

    }


}