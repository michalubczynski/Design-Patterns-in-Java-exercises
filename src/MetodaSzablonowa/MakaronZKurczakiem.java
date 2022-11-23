package MetodaSzablonowa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class MakaronZKurczakiem extends  Makaron{
    @Override
    public void tworzenieSosu() {
        System.out.println("Sos smietanowoziolowy");
    }

    @Override
    public void dodawanieMiesa() {
        System.out.println("Miesko kurczaczek");
    }
    public boolean customerWantsMeat(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else return false;
    }
    private String getUserInput(){
        String answer = null;
        System.out.println("CHCESZ MIECHO? (y/n)");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println(e);
        }
        if(answer==null){
            return "nie";
        }
        return answer;
    }
}
