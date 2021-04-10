package type.fuel;
import type.VehicleTypeEnum;
import type.fuel.VehicleTypeByFuelType;

public class DieselType extends VehicleTypeByFuelType {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
