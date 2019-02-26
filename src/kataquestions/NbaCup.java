package kataquestions;

import java.util.Arrays;
import java.util.List;

public class NbaCup {
    public static void main(String[] args) {
        System.out.println(nbaCup("Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112, Los Angeles Clippers 100 Boston Celtics 120","Los Angeles Clippers"));

    }

    public static String nbaCup(String resultSheet, String toFind) {

        List<String> resultList = Arrays.asList(resultSheet.split(","));

        int index=0;
        int number1=0;
        int number2=0;
        int win=0;
        int draw=0;
        int loss=0;
        int total=0;
        int totalOther =0;


        String james = resultList.stream()
                .filter(team -> resultSheet.contains(team))
                .findAny()
                .orElse(null);

        if(toFind.equalsIgnoreCase("")) return toFind;
        if(resultSheet.contains(toFind)) {
            for (String team : resultList) {
                if (team.contains(toFind)) {
                    List<String> teamList = Arrays.asList(team.split(" "));

                    for (int i = 0; i < teamList.size(); i++) {

                        if (teamList.get(i).equalsIgnoreCase(toFind)) {
                            number1 = Integer.valueOf(teamList.get(i + 1));
                            if (i == 3) number2 = Integer.valueOf(teamList.get(1));
                            else number2 = Integer.valueOf(teamList.get(4));
                            break;

                        }
                    }
                    total = total + number1;
                    totalOther = totalOther + number1;

                    if (number1 > number2) {
                        win++;
                    } else if (number2 > number1) {
                        loss++;
                    } else {
                        draw++;
                    }
                }
            }
            return toFind+":"+"W="+win+";"+"D="+draw+";"+"L="+loss+";"+"Scored="+total+";"+"Conceded="+totalOther+";"+"Points="+(win*3+draw);

        }
        else{
            return toFind+":This team didn't play!";
        }

    }
}
