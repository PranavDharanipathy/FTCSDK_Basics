package org.firstinspires.ftc.teamcode.DcMotor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp (name = "TargetPositionDcMotor", group = "DcMotor")
public class TargetPositionDcMotor extends OpMode {

    private DcMotor dcMotor;

    @Override
    public void init() {
        dcMotor = hardwareMap.get(DcMotor.class, "motor"); // motor initialized
        //direction is default forward
        dcMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        dcMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER); // to use motor encoders, an encoder cable must be connected from the encoder port next to each corresponding motor to the motor's encoder slot

        //*redundant*
        /*dcMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);*/ /// also sets the motors current position in ticks to 0 (resets to 0 everytime the program is started by default anyway)
    }

    @Override
    public void loop() {

        /// Target position is in ticks, on the motor's website it should say how many ticks in one full revolution
        /// which changes depending on the motor.

        dcMotor.setTargetPosition(1000); //target position is set [takes 'int']
        /*power is given*/ dcMotor.setPower(1); //power of -1 and 1 do the same thing as it's just running to a target position of 1000 ticks
        dcMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION); // told to run to the given target position (1000)
    }
}
