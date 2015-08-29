class Protocol {

    private int turns = 0;

    public String processInput(String input) {
        String theOutput;

        if (input.indexOf("T_") == 0) {

            String[] tempInput = input.split("_", 2);
            String tId = tempInput[1];
            turns++;

            theOutput = "Turnstile with id " + tId + " adds turn.";

        } else if(input.indexOf("counter") == 0) {
            theOutput = "The counter is on number " + turns + ".";
        } else {
            theOutput = "Hu ups";
        }

        return theOutput;
    }
}