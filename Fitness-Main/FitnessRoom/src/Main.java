public class Main {

    public static void main(String[] args) {       
       Exercises exercises = new Exercises();

       Command layingCommand = new LayingComm(exercises);
       Command standingCommand = new StandingComm(exercises);

       Controller remote = new Controller();
       callCommands(remote, standingCommand, layingCommand);
    } 
    /*
     * This method sets the standing command and presses the button
     */
        private static  void standingCommand(Controller remote, Command standingCommand){
        	remote.setCommand(standingCommand);
            remote.pressButton();       
    }
        /*
         * This method sets the laying command and presses the button
         */
        private static void layingCommand(Controller remote, Command layingCommand){
        	remote.setCommand(layingCommand);
        	remote.pressButton();       
    }
        /*
         * This method call commands/exercises-standing and laying
         */
        private static void callCommands(Controller remote, Command standingCommand, Command layingCommand) {
        	standingCommand( remote, standingCommand);
            layingCommand( remote, layingCommand);
    }
}