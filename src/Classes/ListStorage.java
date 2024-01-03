package Classes;

import interfaces.Persistable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListStorage implements Persistable {
    private List<Vehicle> vehicles= new ArrayList<>();
    @Override
    public void save(Vehicle vehicle) {
        try {
            if(vehicle == null)
                throw new Exception("Vehicle is null");
            if(vehicles.contains(vehicle))
                throw new Exception("Vehicle already exists");

            vehicles.add(vehicle);
            System.out.println("Vehicle added successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(int id, Vehicle newVehicle) {
        try{
            //find the vehicle by id
            Optional<Vehicle> result = vehicles.stream()
                    .filter(v -> v.getId() == id)
                    .findFirst();//the id is unique
            if(result.isEmpty())
                throw  new Exception("Vehicle not found");
            if(vehicles.contains(newVehicle))//verify if a vehicle with the same name already exists
                throw new Exception("Vehicle already exists");
            //update the vehicle in optional using the newVehicle object
            Vehicle v1= result.get();
            v1.setName(newVehicle.getName());
            v1.setColor(newVehicle.getColor());
            v1.setDateOfManufacture(newVehicle.getDateOfManufacture());
            if(newVehicle instanceof Car)
            {
                Car car= (Car)newVehicle;
                car.setNbDoors(car.getNbDoors());
                car.setNbChairs(car.getNbChairs());
            }
            if(newVehicle instanceof MotoCycle)
                ((MotoCycle)v1).setNbWheels(((MotoCycle)v1).getNbWheels());
            System.out.println("Vehicle updated successfully");
        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        try{
            Optional<Vehicle> result= findById(id);

            if(result.isEmpty())
                throw new Exception("Vehicle with id = "+id+" not found");
            vehicles.remove(result.get());
            System.out.println("Vehicle deleted successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    @Override
    public List<Vehicle> getAll() {

        try
        {
            if(vehicles.isEmpty())
                throw new Exception("No vehicles found");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        //return (List<Object>)(List<?>)vehicles;
        return vehicles;

    }

    @Override
    public Optional<Vehicle> findById(int id) {
        Optional<Vehicle> result= Optional.empty();
        try {
            //find the vehicle by id
            result = vehicles.stream()
                    .filter(v -> v.getId() == id)
                    .findFirst();//the id is unique
            if (result.isEmpty())
                throw new Exception("Vehicle with id = \"+id+\" not found");

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        //return Optional.of(result);
        return result;
    }
}
