package ca.bytetube.day19_mutiThread;

public class OutPut implements Runnable{
    private Resource resource;


    public OutPut(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true){
            resource.getResource();
        }
    }
}
