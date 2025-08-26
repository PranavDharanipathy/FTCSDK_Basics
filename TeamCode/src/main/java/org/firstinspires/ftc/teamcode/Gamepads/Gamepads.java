package org.firstinspires.ftc.teamcode.Gamepads;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp (name = "Gamepads", group = "Gamepads")
public class Gamepads extends OpMode {

    private DcMotor motor;

    @Override
    public void init() {
        motor = hardwareMap.get(DcMotor.class, "motor");
    }

    @Override
    public void loop() {

        /// Gamepad object does not need to be created when class is a child class of 'OpMode'
        /// There are 2 gamepads than can be connected to the Driver Station and be used: 'gamepad1' and 'gamepad2'
        /// Some gamepad buttons return booleans others return floats.

        if (gamepad1.a) {
            motor.setPower(-1);
        }
        else if (gamepad1.left_stick_y > 0) {
            motor.setPower(gamepad1.left_stick_y);
        }
        else motor.setPower(0);

    }
}
