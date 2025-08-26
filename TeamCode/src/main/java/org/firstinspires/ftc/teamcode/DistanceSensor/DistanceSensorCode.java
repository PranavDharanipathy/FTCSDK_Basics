package org.firstinspires.ftc.teamcode.DistanceSensor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@TeleOp(name = "DistanceSensor", group = "DistanceSensor")
public class DistanceSensorCode extends OpMode {

    private DistanceSensor distanceSensor;

    @Override
    public void init() {
        distanceSensor = hardwareMap.get(DistanceSensor.class, "DistanceSensor");
    }

    @Override
    public void loop() {

        telemetry.addData("DistanceSensor", distanceSensor.getDistance(DistanceUnit.MM));
        telemetry.update();
    }
}
