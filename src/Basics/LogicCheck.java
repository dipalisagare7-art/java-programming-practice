package Basics;

public class LogicCheck {
        public static void main(String[] args) {

            String username = "dipali";
            String password = "1234";

            String result = (username.equals("dipali") && password.equals("6666")) ?
                    "Username and Password are correct" :
                    "Username or Password is incorrect";

            System.out.println(result);
        }
    }

