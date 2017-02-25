
public class ConsoleMock extends Console {

    private Console console;
    private boolean access = false;

    public ConsoleMock() {
        this.console = new Console();
    }

    @Override
    public void print(Object obj) {
        access = true;
        console.print(obj);
    }

    public boolean isVerify(){
        return access;
    }
}
