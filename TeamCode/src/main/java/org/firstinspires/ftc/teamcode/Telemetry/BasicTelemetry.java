package org.firstinspires.ftc.teamcode.Telemetry;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp (name = "BasicTelemetry", group = "Telemetry")
public class BasicTelemetry extends OpMode {

    private Servo servo;
    private DcMotor dcMotor;

    @Override
    public void init() {
        servo = hardwareMap.get(Servo.class, "servo");
        dcMotor = hardwareMap.get(DcMotor.class, "motor");
    }

    @Override
    public void loop() {

        servo.setPosition(gamepad1.left_stick_y);
        dcMotor.setPower(gamepad1.right_stick_y);

        telemetry.addLine("Code:");
        telemetry.addData("Servo", servo.getPosition());
        telemetry.addData("Motor", dcMotor.getPower());
        telemetry.update(); //telemetry is "updated" (printed) on the Driver Station (previous telemetry prints are deleted when new ones and sent)
        //only 3 print messages
    }
}
