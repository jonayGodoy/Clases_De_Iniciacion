public class Password {

    public boolean validate(String pass) {
        return greaterThan6(pass) && hasUpperCase(pass);
    }

    private boolean hasUpperCase(String pass) {
        String aux = pass.toUpperCase();
        for(int i =0 ; i < pass.length(); i++){
            if(aux.charAt(i) == pass.charAt(i)){
                return true;
            }
        }
        return false;
    }

    private boolean greaterThan6(String pass) {
        if(pass.length() >6) {
            return  true;
        }else{
            return false;
        }
    }

}
