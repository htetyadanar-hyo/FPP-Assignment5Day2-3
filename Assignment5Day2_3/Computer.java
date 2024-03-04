package Assignment5Day2_3;

import java.util.Objects;

public class Computer {

    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;
    public Computer(String manufacturer,String processor,int ramSize,double processorSpeed){
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize(){
        return ramSize;
    }
    public double getProcessorSpeed(){
        return processorSpeed;
    }

    public double computePower(){
        return ramSize * processorSpeed;
    }

    public String toString(){
        return "Manufacturer: " + manufacturer + "," + "Processor: " + processor + "," +
                "Ramsize: " + ramSize + "," + "ProcessorSpeed: " + processorSpeed + "," +
                "Based on information, Compute Power: " + computePower();
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Computer computer = (Computer) obj;
        return ramSize == computer.ramSize && Objects.equals(manufacturer, computer.manufacturer);
    }

    @Override
    public int hashCode(){
        return Objects.hash(ramSize, manufacturer);
    }
}
