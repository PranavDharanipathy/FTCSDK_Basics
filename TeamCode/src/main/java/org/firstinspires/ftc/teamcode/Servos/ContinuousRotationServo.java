package org.firstinspires.ftc.teamcode.Servos;

import static android.os.SystemClock.sleep;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;

@TeleOp (name = "ContinuousRotationServo", group = "Servo")
public class ContinuousRotationServo extends OpMode {

    private CRServo crservo; //it's still a servo

    @Override
    public void init() {
        crservo = hardwareMap.get(CRServo.class, "crservo"); // servo initialized
        crservo.setDirection(CRServo.Direction.REVERSE); //servo direction reversed
        /// 'zero power behavior' is automatically "brake"
    }

    @Override
    public void loop() {

        /// moves like a motor, power-based

        crservo.setPower(0); //no power
        sleep(1000);
        crservo.setPower(1); //max power
        sleep(1000);
    }
}
