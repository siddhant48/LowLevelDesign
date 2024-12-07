package ChainResponsibilityDesignPattern;

// Abstract handler
abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}

// Concrete handlers
class TeamLead extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Leave for 2 days")) {
            System.out.println("TeamLead approved the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

class Manager extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Leave for 5 days")) {
            System.out.println("Manager approved the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

class HR extends Handler {
    @Override
    public void handleRequest(String request) {
        System.out.println("HR approved the request.");
    }
}

// Test the Chain
public class Test {
    public static void main(String[] args) {
        Handler teamLead = new TeamLead();
        Handler manager = new Manager();
        Handler hr = new HR();

        teamLead.setNextHandler(manager);
        manager.setNextHandler(hr);

        // Pass requests through the chain
        teamLead.handleRequest("Leave for 2 days");
        teamLead.handleRequest("Leave for 5 days");
        teamLead.handleRequest("Leave for 10 days");
    }
}
