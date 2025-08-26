package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "AutonomousProgram", group = "OpMode")
public class AutonomousProgram extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {


        if (isStopRequested()) return;
        waitForStart();

        while (opModeIsActive()) {

        }

    }
}
