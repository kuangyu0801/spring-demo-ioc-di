package com.example.demo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public void setEmailAddress(String emailAddress) {
        System.out.println("emailAddress is set by Spring");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("team is set by Spring");
        this.team = team;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swing bat 500 times";
    }

    @Override
    public String getDailyFortune() {
        return "This bat " + fortuneService.getFortune();
    }
}
