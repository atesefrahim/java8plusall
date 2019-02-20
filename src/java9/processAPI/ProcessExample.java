package java9.processAPI;

public class ProcessExample {

    public static void main(String[] args) {
        ProcessHandle processHandle = ProcessHandle.current();
        System.out.println("process ID :"+processHandle);
    }
}
