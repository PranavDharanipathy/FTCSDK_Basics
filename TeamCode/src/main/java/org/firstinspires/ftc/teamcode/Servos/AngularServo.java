package org.firstinspires.ftc.teamcode.Servos;

import static android.os.SystemClock.sleep;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp (name = "AngularServo", group = "Servo")
public class AngularServo extends OpMode {

    private Servo servo;

    @Override
    public void init() {
        servo = hardwareMap.get(Servo.class, "servo"); // servo initialized
        servo.setDirection(Servo.Direction.REVERSE); //servo direction reversed
    }

    @Override
    public void loop() {

        /// position will be the default unless changed using the servo programmer for that servo
        /// (i. e. AXON, REV, goBILDA)

        servo.setPosition(0); //start position
        sleep(1000);
        servo.setPosition(1); //max position
    }
}
