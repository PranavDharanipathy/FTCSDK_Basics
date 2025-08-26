package org.firstinspires.ftc.teamcode.TouchSensor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.TouchSensor;

@TeleOp (name = "TouchSensor", group = "TouchSensor")
public class TouchSensorCode extends OpMode {

    private TouchSensor touchSensor; // same object for limit switches

    @Override
    public void init() {
        touchSensor = hardwareMap.get(TouchSensor.class, "TouchSensor");
    }

    @Override
    public void loop() {

        telemetry.addData("TouchSensor / Limit Switch", touchSensor.isPressed());
        telemetry.update();
    }
}
