package org.firstinspires.ftc.teamcode.DcMotor;

import static android.os.SystemClock.sleep;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp (name = "PowerDcMotor", group = "DcMotor")
public class PowerDcMotor extends OpMode {

    private DcMotor dcMotor;

    @Override
    public void init() {
        dcMotor = hardwareMap.get(DcMotor.class, "motor"); // motor initialized
        dcMotor.setDirection(DcMotor.Direction.REVERSE); //motor direction reversed
        dcMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    @Override
    public void loop() {

        dcMotor.setPower(1); //max power
        sleep(1000);
        dcMotor.setPower(0); //no power
        sleep(1000);
    }
}
