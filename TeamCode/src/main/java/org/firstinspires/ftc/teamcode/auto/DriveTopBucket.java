package org.firstinspires.ftc.teamcode.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "DriveTopBucket")
public class DriveTopBucket extends LinearOpMode {

    private DcMotor BackLeft;
    private DcMotor BackRight;
    private DcMotor FrontLeft;
    private DcMotor FrontRight;
    private DcMotor OuttakeSlides;
    private DcMotor IntakeArm;
    private Servo OuttakePivot;

    @Override
    public void runOpMode() {
        BackLeft = hardwareMap.get(DcMotor.class, "BackLeft");
        BackRight = hardwareMap.get(DcMotor.class, "BackRight");
        FrontLeft = hardwareMap.get(DcMotor.class, "FrontLeft");
        FrontRight = hardwareMap.get(DcMotor.class, "FrontRight");
        OuttakeSlides = hardwareMap.get(DcMotor.class, "OuttakeSlides");
        IntakeArm = hardwareMap.get(DcMotor.class, "IntakeArm");
        OuttakePivot = hardwareMap.get(Servo.class, "OuttakePivot");

        BackLeft.setDirection(DcMotor.Direction.REVERSE);
        BackRight.setDirection(DcMotor.Direction.FORWARD);
        FrontLeft.setDirection(DcMotor.Direction.REVERSE);
        FrontRight.setDirection(DcMotor.Direction.FORWARD);

        OuttakeSlides.setDirection(DcMotor.Direction.FORWARD);
        IntakeArm.setDirection(DcMotor.Direction.REVERSE);

        IntakeArm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        OuttakeSlides.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        BackLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BackRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        FrontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        FrontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        OuttakeSlides.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        IntakeArm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        BackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        BackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        FrontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        FrontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        OuttakeSlides.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        IntakeArm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        BackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        BackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        FrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        FrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        IntakeArm.setPower(0);
        OuttakeSlides.setPower(0);

        BackLeft.setPower(0);
        BackRight.setPower(0);
        FrontLeft.setPower(0);
        FrontRight.setPower(0);

        waitForStart();
        if (opModeIsActive()) {

            //strafe right slightly
            BackLeft.setTargetPosition(135);
            BackRight.setTargetPosition(-135);
            FrontLeft.setTargetPosition(-135);
            FrontRight.setTargetPosition(135);
            BackLeft.setPower(0.5);
            BackRight.setPower(0.5);
            FrontLeft.setPower(0.5);
            FrontRight.setPower(0.5);
            BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            OuttakePivot.setPosition(0);
            IntakeArm.setTargetPosition(0);
            IntakeArm.setPower(1);
            OuttakeSlides.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            OuttakeSlides.setTargetPosition(2300);
            OuttakeSlides.setPower(1);
            OuttakeSlides.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            sleep(1000);
            BackLeft.setTargetPosition(0);
            BackRight.setTargetPosition(-500);
            FrontLeft.setTargetPosition(0);
            FrontRight.setTargetPosition(-500);
            BackLeft.setPower(0.5);
            BackRight.setPower(0.5);
            FrontLeft.setPower(0.5);
            FrontRight.setPower(0.5);
            BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            //move_right(-1850);
            sleep(3000);
            OuttakePivot.setPosition(0.5);
            sleep(3000);
            OuttakePivot.setPosition(0);
            sleep(1000);
            OuttakeSlides.setTargetPosition(0);
            OuttakeSlides.setPower(1);
            OuttakeSlides.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            //move_right(3000);
        }
    }
}
