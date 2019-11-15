package org.firstinspires.ftc.teamcode.framework.subsystems.imu;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.hardware.bosch.JustLoggingAccelerationIntegrator;
import com.qualcomm.robotcore.util.ReadWriteFile;
import org.firstinspires.ftc.robotcore.internal.system.AppUtil;

public interface IMU {
    /**
     * Gets the angle on the x-axis
     * 
     * @return the x-axis angle
     */
    double getXAngle();

    /**
     * Gets the angle on the y-axis
     * 
     * @return the y-axis angle
     */
    double getYAngle();

    /**
     * Gets the angle on the z-axis
     * 
     * @return the z-axis angle
     */
    double getZAngle();

    /**
     * Gets the angle on the z-axis with the discontinuity being opposite of the
     * desired angle
     * 
     * @return the z-axis angle
     */
    double getZAngle(double desiredAngle);

    /**
     * Gets the acceleration on the x-axis
     * 
     * @return hte acceleration on the x-axis
     */
    double getXAcc();

    /**
     * Gets the acceleration on the y-axis
     * 
     * @return the accerlation on the y-axis
     */
    double getYAcc();

    /**
     * Gets the acceleration on the z-axis
     * 
     * @return the acceleration on the z-axis
     */
    double getZAcc();

    /**
     * Gets the velocity on the x-axis
     * 
     * @return the x-axis velocity
     */
    double getXVelo();

    /**
     * Gets the acceleration on the y-axis
     * 
     * @return the y-axis velocity
     */
    double getYVelo();

    /**
     * Gets the acceleration on the z-axis
     * 
     * @return the z-axis velocity
     */
    double getZVelo();

    /**
     * Set an offest for the imu
     * 
     * @param offset the offset to set
     */
    void setOffSet(double offset);

    /**
     * Set the current position as the zero position for the imu
     */
    void setAsZero();

    /**
     * Initialize the parameters for the IMU
     */
    void initialize();
}