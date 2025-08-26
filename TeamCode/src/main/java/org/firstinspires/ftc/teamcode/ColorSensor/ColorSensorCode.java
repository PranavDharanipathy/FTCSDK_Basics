package org.firstinspires.ftc.teamcode.ColorSensor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;


@TeleOp (name = "ColorSensor", group = "ColorSensor")
public class ColorSensorCode extends OpMode {

    private ColorSensor colorSensor;

    @Override
    public void init() {
        colorSensor = hardwareMap.get(ColorSensor.class, "ColorSensor");
    }

    @Override
    public void loop() {

        telemetry.addData("ColorSensor", colorSensor.argb());
        telemetry.update();
    }
}
