import type.body.VehicleTypeByBodyType;
import type.VehicleTypeEnum;

public class WagonType extends VehicleTypeByBodyType {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}