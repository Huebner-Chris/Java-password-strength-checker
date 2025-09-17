    import java.util.Scanner;

    public class PasswordChecker {
        public static void main(String[] args) {
            
        
            int letter, number, symbol, cap;
            int score =0;
        
            Scanner sc = new Scanner(System.in);
        
              String password = "";

             while(true){
                System.out.println("Enter a Password: ");
                password = sc.nextLine();
                letter =0;
                number =0;
                symbol =0;
                cap =0;
                

                
                for(int i=0; i < password.length(); i++){
                    if (Character.isLetter(password.charAt(i)))
{
                        letter++;
                    }
                    else if (Character.isDigit(password.charAt(i)))
{
                        number++;
                    }
                    else{
                        symbol++;
                    }
                }
                if(password.length() >= 8){
                 if( number >= 2){
                  if(symbol>= 2){
                   break;
                }
                    else{
                      System.out.print("Password needs to have 2 symbols ");
                    }
                } 
                   else{
                    System.out.print("Password needs to have 2 numbers ");
                   }
                }
                else{
                 System.out.print("Password was too short ");
                }
               
            }
             if(password.length() >= 15){
                score+=15;
              }
              else if(password.length() >= 12){
                 score+=10;
              }
               else if(password.length() >= 8){
                  score+=5;
               }
             if(number >= 4){
                score+=15;
              }
              else if(number >= 3){
                 score+=10;
             }
               else if(number >= 2){
                  score+=5;
               }
             if(symbol >= 4){
                score+=15;
              }
              else if(symbol >= 3){
                 score+=10;
             }
               else if(symbol >= 2){
                  score+=5;
               }
               

            for(int i=0; password.length() > i;i++){
              if (Character.isUpperCase(password.charAt(i))){
                score++;
                if(Character.isLowerCase(password.charAt(i + 1))){
                    score++;
                }
            }
            }
            for(int k = 0; k < password.length() - 2; k++){
              if (password.charAt(k) == password.charAt(k+1) && password.charAt(k) == password.charAt(k+2)){
                score+= 5;
              }
            
        }
        if(score >= 90){
            System.out.println("Password Strength: Very Strong");
        }
        else if(score >= 60){
            System.out.println("Password Strength: Strong");
        }
        else if(score >= 35){
            System.out.println("Password Strength: Medium");
        }
        else {
            System.out.println("Password Strength: Weak");
        }
        
    










            
           

              



            
        }
    }
